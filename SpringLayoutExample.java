import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

class SpringLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        JLabel fName = new JLabel("First Name ");
        JLabel lName = new JLabel("Last Name ");
        JTextField first = new JTextField("", 16);
        JTextField last = new JTextField("", 16);

        frame.getContentPane().add(fName);
        frame.getContentPane().add(first);
        frame.getContentPane().add(lName);
        frame.getContentPane().add(last);

        layout.putConstraint(SpringLayout.WEST, fName, 5, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, fName, 5, SpringLayout.NORTH, frame.getContentPane());

        layout.putConstraint(SpringLayout.WEST, first, 5, SpringLayout.EAST, fName);
        layout.putConstraint(SpringLayout.NORTH, first, 5, SpringLayout.NORTH, frame.getContentPane());
        layout.putConstraint(SpringLayout.EAST, frame.getContentPane(), 5, SpringLayout.WEST, first);

        layout.putConstraint(SpringLayout.EAST, frame.getContentPane(), 5, SpringLayout.EAST, first);
        layout.putConstraint(SpringLayout.NORTH, last, 5, SpringLayout.SOUTH, first);


        layout.putConstraint(SpringLayout.WEST, lName, 5, SpringLayout.WEST, frame.getContentPane());
        layout.putConstraint(SpringLayout.NORTH, lName, 5, SpringLayout.SOUTH, fName);

        layout.putConstraint(SpringLayout.WEST, last, 5, SpringLayout.EAST, lName);

        layout.putConstraint(SpringLayout.EAST, frame.getContentPane(), 5, SpringLayout.EAST, last);
        layout.putConstraint(SpringLayout.SOUTH, frame.getContentPane(), 5, SpringLayout.SOUTH, last);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}