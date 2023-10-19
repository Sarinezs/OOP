import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame{
    JButton num0 = new JButton("0");
    JButton num1 = new JButton("1");
    JButton num2 = new JButton("2");
    JButton num3 = new JButton("3");
    private Timer timer = new Timer(1, new Listener());
    int mode;
    int speed = 10;

    public test(){
        setTitle("Hatari");
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel(new GridLayout(1,4));
        p1.add(num0);
        p1.add(num1);
        p1.add(num2);
        p1.add(num3);
        add(p1, BorderLayout.SOUTH);
        test.Listener l = new Listener();
        add(new drawblade());
        num0.addActionListener(l);
        num1.addActionListener(l);
        num2.addActionListener(l);
        num3.addActionListener(l);

        timer.start();
    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            if(e.getActionCommand() == "0"){
                if(speed >= 0){
                    mode = 0;
                }
            }
            else if(e.getActionCommand() == "1"){
                if(speed >= 0){
                    mode = 1;
                }
            }
            else if(e.getActionCommand() == "2"){
                if(speed >= 0){
                    mode = 2;
                }
            }
            else if(e.getActionCommand() == "3"){
                if(speed >= 0){
                    mode = 3;
                }
            }
        }

    }

    class drawblade extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            int xCenter = getWidth() / 2;
                int yCenter = getHeight() / 2;
                int radius = (int)(Math.min(getWidth(), getHeight() * 0.4));
                int x = xCenter - radius;
                int y = yCenter - radius;
                g.setColor(Color.MAGENTA);

                if(mode == 0){
                    speed = 0;
                    System.out.println(mode);
                }
                else if(mode == 1){
                    speed += 10;
                    System.out.println(mode);
                }
                else if(mode == 2){
                    speed += 20;
                    System.out.println(mode);
                }
                else if(mode == 3){
                    speed += 30;
                    System.out.println(mode);
                }

                g.fillArc(x, y, 2 * radius, 2 * radius, speed+0, 30);
                g.setColor(Color.YELLOW);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+90, 30);
                g.setColor(Color.green);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+180, 30);
                g.setColor(Color.CYAN);
                g.fillArc(x, y, 2 * radius, 2 * radius, speed+270, 30);
        }
    }

    public static void main(String[] args){
        test frame = new test();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
