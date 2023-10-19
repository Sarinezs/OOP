import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawArcs extends JFrame {
    JButton num1 = new JButton("1");
    JButton num2 = new JButton("2");
    JButton num3 = new JButton("3");
    JButton num0 = new JButton("0");
    private Timer timer = new Timer(10, new Listener());
    int speed = 1;
    int A;


    public DrawArcs(){
        setTitle("Hatari");
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel(new GridLayout(1, 4));
        p1.add(num1);
        p1.add(num2);
        p1.add(num3);
        p1.add(num0);
        add(p1, BorderLayout.SOUTH);
        DrawArcs.Listener l = new Listener();
        add(new ArcsPanel());
        num1.addActionListener(l);
        num2.addActionListener(l);
        num3.addActionListener(l);
        num0.addActionListener(l);
        timer.start();
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            if (e.getActionCommand() == "1") {
                if (speed >= 0) {
                    A = 1;
                }
            } else if (e.getActionCommand() == "2") {
                if (speed >= 0) {
                    A = 2;
                }
            } else if (e.getActionCommand() == "3") {
                if (speed >= 0) {
                    A = 3;
                }
            } else if (e.getActionCommand() == "0") {
                if (speed >= 0) {
                    A = 4;
                }
            }
        }
    }
    // draw blade
    class ArcsPanel extends JPanel{
            @Override
        protected void paintComponent(Graphics g){
                super.paintComponent(g);
                int xCenter = getWidth() / 2;
                int yCenter = getHeight() / 2;
                int radius = (int)(Math.min(getWidth(), getHeight() * 0.4));
                int x = xCenter - radius;
                int y = yCenter - radius;
                g.setColor(Color.red);
                if( A == 1){
                    speed += 1;
                }else if( A == 2){
                    speed += 10;
                }else if( A == 3){
                    speed += 20;
                }else if( A== 4){
                    speed = 0;
                }
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+0, 30);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+90, 30);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+180, 30);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+270, 30);
        }
    }
    public static void main(String[] args) {
        DrawArcs frame = new DrawArcs();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 300);
        frame.setVisible(true);
    }
}