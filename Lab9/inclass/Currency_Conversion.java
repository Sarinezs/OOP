
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Currency_Conversion extends JFrame{
    JLabel jlbUS = new JLabel("US Dollars");
    JLabel jlbCana = new JLabel("Canadian Dollars");
    
    JTextField jtfUS = new JTextField(10);
    JTextField jtfCana = new JTextField(10);
    
    JButton jbtconvert = new JButton("Convert");
    
    
    
    Currency_Conversion(){
        setLayout(new GridLayout());
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(2,1));
        JPanel p3 = new JPanel(new GridLayout(2,1));
        JPanel p4 = new JPanel(new BorderLayout());
        
        
        p1.add(p2, BorderLayout.WEST);
        p1.add(p3, BorderLayout.CENTER);
        p1.add(p4, BorderLayout.SOUTH);
        
        p2.add(jlbUS);
        p2.add(jlbCana);
        
        p3.add(jtfUS);
        p3.add(jtfCana);
        jtfCana.setText("0");
        jtfCana.setEditable(false);
        jtfCana.setHorizontalAlignment(JTextField.RIGHT);
        
        p4.add(jbtconvert, BorderLayout.EAST);
        add(p1);
        
        listener spyobj = new listener();
        jbtconvert.addActionListener(spyobj);
    }
    
    class listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double usget = Double.parseDouble(jtfUS.getText());
            double cana = usget * 1.35;
//            System.out.println(usget);
            jtfCana.setText(""+cana);
        }
        
    }
    
    public static void main(String[] args) {
        Currency_Conversion frame = new Currency_Conversion();
        frame.setTitle("Example");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
