import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel pane = new JPanel();
        JLabel intro = new JLabel("Register");
        JLabel fName = new JLabel("First Name: ");
        JLabel lName = new JLabel("Last Name: ");
        JTextField first = new JTextField();
        JTextField lass = new JTextField();
        GroupLayout group = new GroupLayout(pane);
        group.setAutoCreateGaps(true);
        group.setAutoCreateContainerGaps(true);
        group.setHorizontalGroup(group.createSequentialGroup()
            .addGroup(group.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(intro)
                .addComponent(fName)
                .addComponent(lName)
            )
            .addGroup(group.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(first)
                .addComponent(lass)
            )
        );
        group.setVerticalGroup(group.createSequentialGroup()
            .addComponent(intro)
            .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(fName)
                .addComponent(first)
            )
            .addGroup(group.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(lName)
                .addComponent(lass)
            )
        );
        pane.setLayout(group);
        frame.setVisible(true);
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}