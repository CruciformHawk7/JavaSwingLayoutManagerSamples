import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class BorderExample {
    public static void main(String args[]) {
        JFrame frame = new JFrame("BorderLayout Demo");

        frame.add(new JLabel("I am at the North!", SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JLabel("I am at the South!", SwingConstants.CENTER), BorderLayout.SOUTH);
        frame.add(new JLabel("I am at the West!", SwingConstants.CENTER), BorderLayout.WEST);
        frame.add(new JLabel("I am at the East!", SwingConstants.CENTER), BorderLayout.EAST);
        frame.add(new JLabel("I am at the Center!", SwingConstants.CENTER), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}