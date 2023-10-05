
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hangman extends JFrame {

    Hangman() {
        add(new drawarea());
    }

    class drawarea extends JPanel {

        Timer timer = new Timer(10, new Listener());

        int x = 0;
        int y = 0;
        int a = 0;

        drawarea() {
            timer.start();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g); // delete current image and render new image
            if(160 - x == 200 || 160 + y == 120){
                a = 1;
            }
            if(160 - x == 120 || 160 + y == 200){
                a = 0;
            }
            
            g.drawArc(20, 220, 80, 40, 0, 180);
            g.drawLine(20 + 40, 220, 20 + 40, 20);
            g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
            
            g.drawLine(20 + 40 + 100 , 20, 20 + 40 + 100 - x, 40);
            int radius = 20;
            g.drawOval(20 + 40 + 100 - radius - x, 40, 2 * radius, 2 * radius); //head
            //right hand
            g.drawLine(20 + 40 + 100 - x + (int) (radius * Math.cos(Math.toRadians(45))), 
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))), 20 + 40 + 100 + 60 - x*2, 40 + radius + 60);
            // left hand
            g.drawLine(20 + 40 + 100 - x - (int) (radius * Math.cos(Math.toRadians(45))), 
                    40 + radius + (int) (radius * Math.sin(Math.toRadians(45))), 20 + 40 + 100 - 60 - x*2, 40 + radius + 60);
            // body
            g.drawLine(20 + 40 + 100 - x, 40 + 2 * radius, 20 + 40 + 100 - x*2, 40 + radius + 80);
            // left leg
            g.drawLine(20 + 40 + 100 - 2*x, 40 + radius + 80, 20 + 40 + 100 - 40 - x *3, 40 + radius + 80 + 40);
            //right leg
            g.drawLine(20 + 40 + 100 - 2*x, 40 + radius + 80, 20 + 40 + 100 + 40 - x*3, 40 + radius + 80 + 40);
            if(a == 0){
                x--;
                y--;
            }
            else{
                x++;
                y++;
            }
        }
    }

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

        public static void main(String[] args) {
            Hangman frame = new Hangman();
            frame.setTitle("Example");
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    
}
