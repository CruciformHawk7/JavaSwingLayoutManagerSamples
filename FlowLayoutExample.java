import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutExample {
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Flow Layout Test");
        
        JButton button1 = new JButton("This");
        JButton button2 = new JButton("is");
        JButton button3 = new JButton("Flow");
        JButton button4 = new JButton("Layout");


        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        //frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.pack();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}