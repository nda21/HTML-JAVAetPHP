package view;

import javax.swing.*;
import Controller.GameController;
import Model.Joueur;
import java.awt.event.*;
import java.util.*;

public class MainFrame extends JFrame {
    private JTextField txtNbJoueurs;
    private GameController controller = new GameController();
    private JTextArea txtArea;
    private JButton btnContinuer;
    private int phase = 0;

    public MainFrame() {
        setTitle("Jeu des Loups-Garous");
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblNbJoueurs = new JLabel("Nombre de joueurs :");
        lblNbJoueurs.setBounds(30, 30, 150, 25);
        getContentPane().add(lblNbJoueurs);

        txtNbJoueurs = new JTextField();
        txtNbJoueurs.setBounds(180, 30, 100, 25);
        getContentPane().add(txtNbJoueurs);

        JButton btnStart = new JButton("Démarrer");
        btnStart.setBounds(300, 30, 120, 25);
        getContentPane().add(btnStart);

        txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(30, 80, 420, 300);
        getContentPane().add(scrollPane);

        btnContinuer = new JButton("Continuer");
        btnContinuer.setBounds(180, 400, 120, 30);
        btnContinuer.setVisible(false);
        getContentPane().add(btnContinuer);

        btnStart.addActionListener(e -> {
            try {
                int nb = Integer.parseInt(txtNbJoueurs.getText());
                controller.initialiserPartie(nb);
                afficherRoles();
                btnContinuer.setVisible(true);
                phase = 0;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Entre un nombre valide !");
            }
        });

        btnContinuer.addActionListener(e -> {
            if (phase == 0) {
                fairePhaseNuit();
                phase = 1;
            } else {
                fairePhaseJour();
                phase = 0;
            }
        });
    }

    private void afficherRoles() {
        StringBuilder sb = new StringBuilder("🔍 Rôles des joueurs :\n");
        for (Joueur j : controller.getJoueurs()) {
            sb.append(j).append("\n");
        }
        txtArea.setText(sb.toString());
    }

    private void fairePhaseNuit() {
        StringBuilder sb = new StringBuilder("🌙 Nuit :\n");
        List<Joueur> loups = controller.getLoupsVivants();
        List<Joueur> vivants = controller.getVivants();

        // Loups choisissent une cible (aléatoire sauf eux-mêmes)
        List<Joueur> cibles = new ArrayList<>(vivants);
        cibles.removeAll(loups);
        if (!cibles.isEmpty()) {
            Joueur victime = cibles.get(new Random().nextInt(cibles.size()));
            victime.tuer();
            sb.append("Les Loups ont tué ").append(victime.getNom()).append("\n");
        }

        // Voyante consulte
        Joueur voyante = controller.getVoyante();
        if (voyante != null && voyante.estVivant()) {
            List<Joueur> autres = new ArrayList<>(vivants);
            autres.remove(voyante);
            if (!autres.isEmpty()) {
                Joueur vu = autres.get(new Random().nextInt(autres.size()));
                sb.append("La Voyante voit : ").append(vu.getNom()).append(" est ").append(vu.getRole()).append("\n");
            }
        }

        txtArea.setText(sb.toString());
        verifierFin(sb);
    }

    private void fairePhaseJour() {
        StringBuilder sb = new StringBuilder("☀️ Jour :\n");

        List<Joueur> vivants = controller.getVivants();
        if (!vivants.isEmpty()) {
            Joueur vote = vivants.get(new Random().nextInt(vivants.size()));
            vote.tuer();
            sb.append("Les joueurs ont voté contre ").append(vote.getNom())
              .append(" (").append(vote.getRole()).append(")\n");
        }

        txtArea.setText(sb.toString());
        verifierFin(sb);
    }

    private void verifierFin(StringBuilder sb) {
        if (controller.isVillageWin()) {
            sb.append("\n🎉 Les Villageois ont gagné !");
            btnContinuer.setEnabled(false);
        } else if (controller.isLoupsWin()) {
            sb.append("\n💀 Les Loups-Garous ont gagné !");
            btnContinuer.setEnabled(false);
        }
    }
}
