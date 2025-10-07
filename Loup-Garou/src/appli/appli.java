package appli;
import javax.swing.SwingUtilities;
import view.MainFrame;

public class appli {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
