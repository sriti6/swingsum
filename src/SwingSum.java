import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingSum extends JFrame{


public SwingSum () {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Enter numbers to find the sum:");
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    JButton button = new JButton("Calculate");
    button.addActionLister(new ActionListener(){
        public void actionPerformer(ActionEvent e){
        JOptionPane.showMessageDialog(null,"The total of two numbers is "+Integer.parseInt(num1,num2));
        }
                           }

    panel.add(label);
    panel.add(num1);
    panel.add(num2);
    panel.add(button);
add(panel);
setSize(200,200);
}




}
