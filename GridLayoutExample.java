import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayoutExample {
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Dialpad");
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("*"));
        frame.add(new JButton("0"));
        frame.add(new JButton("#"));
        frame.setLayout(new GridLayout(4,3, 10, 10));
        frame.setVisible(true);
        frame.setBounds(300, 200, 350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}