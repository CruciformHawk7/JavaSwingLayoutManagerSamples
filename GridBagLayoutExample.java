import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("Enter your credentials:"), gbc);

        gbc.gridy = 1;
        frame.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        JTextField f = new JTextField();
        frame.add(f, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        frame.add(new JLabel("Password: "), gbc);

        gbc.gridx = 1;
        frame.add(new JPasswordField(), gbc);

        gbc.gridy = 3;
        frame.add(new JButton("Login"), gbc);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}