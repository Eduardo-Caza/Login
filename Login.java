package login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField Usuario;
    private JButton INICIARSESIONButton;
    private JButton REGISTRARSEButton;
    private JButton SALIRButton;
    private JLabel LUsu;
    private JLabel LContra;
    private JPanel Login;
    private JPasswordField Contrasena;

    public Login() {
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


