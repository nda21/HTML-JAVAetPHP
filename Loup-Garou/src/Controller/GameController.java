package Controller;

import Model.Joueur;
import Model.Role;

import java.util.*;

public class GameController {
    private List<Joueur> joueurs = new ArrayList<>();

    public void initialiserPartie(int nbJoueurs) {
        joueurs.clear();
        List<Role> roles = genererRoles(nbJoueurs);
        Collections.shuffle(roles);
        for (int i = 0; i < nbJoueurs; i++) {
            joueurs.add(new Joueur("Joueur " + (i + 1), roles.get(i)));
        }
    }

    private List<Role> genererRoles(int nbJoueurs) {
        List<Role> roles = new ArrayList<>();
        int nbLoups = Math.max(1, nbJoueurs / 4);
        for (int i = 0; i < nbLoups; i++) roles.add(Role.LOUP_GAROU);
        roles.add(Role.VOYANTE);
        while (roles.size() < nbJoueurs) roles.add(Role.VILLAGEOIS);
        return roles;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public List<Joueur> getVivants() {
        List<Joueur> res = new ArrayList<>();
        for (Joueur j : joueurs) if (j.estVivant()) res.add(j);
        return res;
    }

    public List<Joueur> getLoupsVivants() {
        List<Joueur> res = new ArrayList<>();
        for (Joueur j : joueurs)
            if (j.estVivant() && j.getRole() == Role.LOUP_GAROU)
                res.add(j);
        return res;
    }

    public Joueur getVoyante() {
        for (Joueur j : joueurs)
            if (j.getRole() == Role.VOYANTE) return j;
        return null;
    }

    public boolean isVillageWin() {
        return getLoupsVivants().isEmpty();
    }

    public boolean isLoupsWin() {
        int loups = 0, villageois = 0;
        for (Joueur j : joueurs) {
            if (!j.estVivant()) continue;
            if (j.getRole() == Role.LOUP_GAROU) loups++;
            else villageois++;
        }
        return loups >= villageois;
    }
}
