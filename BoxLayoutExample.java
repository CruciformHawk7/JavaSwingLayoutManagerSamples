import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BoxLayoutExample {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Box Layout Example");
        JPanel p = new JPanel();

        p.add(new JButton("These"));
        p.add(new JButton("buttons"));
        p.add(new JButton("are"));
        p.add(new JButton("for"));
        p.add(new JButton("demonstration"));
        p.add(new JButton("purpose"));

        p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
        //LINE, PAGE, Y

        frame.add(p);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}