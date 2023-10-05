
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class example extends JFrame {

    JLabel jlbName = new JLabel("Name");
    JLabel jlbSurname = new JLabel("Surname");
    JLabel jlbAge = new JLabel("Age");
    JLabel jlbInfo = new JLabel("Detail");
    JLabel jlbInfoFromText = new JLabel();
    JTextField jtfName = new JTextField(10);
    JTextField jtfSurname = new JTextField(10);
    JTextField jtfAge = new JTextField(10);
    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");

    JPanel p = new JPanel();

    example() {
        GridLayout layoutManager = new GridLayout(5, 2, 5, 5);
        p.setLayout(layoutManager);
        p.add(jlbName);
        p.add(jtfName);
        p.add(jlbSurname);
        p.add(jtfSurname);
        p.add(jlbAge);
        p.add(jtfAge);
        jtfAge.setText("25");
        jtfAge.setEditable(false);
        jtfAge.setHorizontalAlignment(JTextField.RIGHT);
        p.add(jlbInfo);
        p.add(jlbInfoFromText);
        p.add(jbtOK);
        p.add(jbtCancel);
        add(p);

        Listener spyobj = new Listener();
        jbtCancel.addActionListener(spyobj);
        jbtOK.addActionListener(spyobj);
    }

    class Listener implements ActionListener { // interface must have abstract method

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand() == "OK") {
                jlbInfoFromText.setText(""+jtfName.getText()+" "+jtfSurname.getText()+" "+jtfAge.getText());
            } else {
                jtfName.setText("");
                jtfSurname.setText("");
                jtfAge.setText("");
                jlbInfoFromText.setText("");
            }

        }

    }

    public static void main(String[] args) {
        example frame = new example();
        frame.setTitle("Example");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
