import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

class CardLayoutExample {
    public static void main(String[] args) throws ClassNotFoundException, 
    InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        JFrame frame = new JFrame();
        JPanel firstPanel = new JPanel();
        JPanel secondPanel = new JPanel();
        JPanel thirdPanel = new JPanel();
        JPanel controls = new JPanel();
        JPanel group = new JPanel();

        JButton login, signup, admin;
        login = new JButton("Login");
        signup = new JButton("Sign up");
        admin = new JButton("Admin");

        controls.add(login);
        controls.add(signup);
        controls.add(admin);

        firstPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.fill = GridBagConstraints.HORIZONTAL;
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        firstPanel.add(new JLabel("Login"));
        gbc1.gridy = 1;
        firstPanel.add(new JLabel("Username:"), gbc1);
        gbc1.gridx = 1;
        firstPanel.add(new JTextField(), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        firstPanel.add(new JLabel("Password: "), gbc1);
        gbc1.gridx = 1;
        firstPanel.add(new JPasswordField(), gbc1);
        gbc1.gridy = 3;
        firstPanel.add(new JButton("Login"), gbc1);

        secondPanel.setLayout(new GridBagLayout());
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        secondPanel.add(new JLabel("Sign up"), gbc1);
        gbc1.gridy = 1;
        secondPanel.add(new JLabel("First Name"), gbc1);
        gbc1.gridx = 1;
        secondPanel.add(new JTextField(), gbc1);
        gbc1.gridy = 2;
        secondPanel.add(new JTextField(), gbc1);
        gbc1.gridx = 0;
        secondPanel.add(new JLabel("Username:"), gbc1);
        gbc1.gridy = 3;
        secondPanel.add(new JLabel("Password: "), gbc1);
        gbc1.gridx = 1;
        secondPanel.add(new JPasswordField(), gbc1);
        gbc1.gridy = 4;
        secondPanel.add(new JButton("Sign up"), gbc1);

        thirdPanel.setLayout(new GridBagLayout());
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        thirdPanel.add(new JLabel("Admin:"));
        gbc1.gridy = 1;
        thirdPanel.add(new JLabel("Database:"), gbc1);
        gbc1.gridx = 1;
        thirdPanel.add(new JTextField(), gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        thirdPanel.add(new JLabel("Password: "), gbc1);
        gbc1.gridx = 1;
        thirdPanel.add(new JPasswordField(), gbc1);
        gbc1.gridy = 3;
        thirdPanel.add(new JButton("Login"), gbc1);

        final JPanel cards = new JPanel(new CardLayout());
        cards.add(firstPanel, "Login");
        cards.add(secondPanel, "Signup");
        cards.add(thirdPanel, "Admin");

        login.addActionListener((e) -> {
            CardLayout c = (CardLayout)cards.getLayout();
            c.show(cards, "Login");
            frame.setTitle("Login");
        });

        signup.addActionListener((e) -> {
            CardLayout c = (CardLayout)cards.getLayout();
            c.show(cards, "Signup");
            frame.setTitle("Sign up");
        });

        admin.addActionListener((e) -> {
            CardLayout c = (CardLayout)cards.getLayout();
            c.show(cards, "Admin");
            frame.setTitle("Admin login");
        });

        group.add(cards);
        group.add(controls);
        
        frame.setBounds(50, 50, 400, 250);
        frame.getContentPane().add(group);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
    }
}