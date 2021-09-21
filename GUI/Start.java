import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Start {
    public static void main(String[] args) {
        System.out.println("Testing, and working!");

        JFrame mainframe = new JFrame("Test!");
        //text 1
        JLabel label1 = new JLabel("Click the button!");
        //button 1
        JButton button1 = new JButton("Test");
        mainframe.setSize(1300, 1300);
        mainframe.setVisible(true);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setLocationRelativeTo(null);
        label1.setVisible(true);
        label1.setBounds(595,50, 30,30); 
        label1.setSize(500, 600);
        button1.setVisible(true);
        button1.setSize(500, 500);
        button1.setBounds(600, 390, 180, 30);
        mainframe.add(label1);
        mainframe.add(button1);
        mainframe.setLayout(null);
        mainframe.setResizable(false);
    }
}