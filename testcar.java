import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class testcar extends JFrame{

    JLabel l1 = new JLabel("Current Position ");
    JLabel currentpos = new JLabel();
    JButton resume = new JButton("resume");
    JButton stop = new JButton("stop");

    JPanel p1 = new JPanel();
    drawball b1 = new drawball();

    Timer timer = new Timer(10, new b_check());

    testcar(){
        this.setLayout(new BorderLayout());
        this.add(b1);

        p1.add(l1);
        p1.add(currentpos);
        p1.add(resume);
        p1.add(stop);

        resume.addActionListener(new b_check());
        stop.addActionListener(new b_check());

        this.add(p1, BorderLayout.NORTH);
        // timer.start();
    }

    class b_check implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            currentpos.setText(Integer.toString(b1.x)+" "+Integer.toString(b1.y));
            if(e.getSource() == resume){
                b1.timer.start();
            }
            if(e.getSource() == stop){
                b1.timer.stop();
            }
        }

    }

    public static void main(String[] args) {
        testcar frame = new testcar();
        frame.setTitle("test");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

class drawball extends JPanel{
    int x = 110;
    int y = 110;
    int speedx = 10;
    int speedy = 10;
    int radius = 100;
    Timer timer = new Timer(10, new testtimer());

    // Thread timer = new Thread(new Runnable() {
    //     public void run(){
    //         while(true){
    //             try{
    //                 Thread.sleep(10);
    //             }catch(Exception e){}
    //             x += speedx;
    //             y += speedy;
    //             if(x >= getWidth()-radius || x <= radius){
    //                 speedx = -speedx;
    //             }
    //             if(y >= getHeight()-radius || y <= radius){
    //                 speedy = -speedy;
    //             }
    //             repaint();
    //         }
    //     }
    // });

    drawball(){
        this.setFocusable(true);
        timer.start();
        // this.addKeyListener(new KeyAdapter() {
        //     @Override
        //     public void keyPressed(KeyEvent e) {
        //         if(e.getKeyCode() == KeyEvent.VK_W){
        //             y -= speedy;
        //         }
        //         else if(e.getKeyCode() == KeyEvent.VK_A){
        //             x -= speedx;
        //         }
        //         else if(e.getKeyCode() == KeyEvent.VK_S){
        //             y += speedy;
        //         }
        //         else if(e.getKeyCode() == KeyEvent.VK_D){
        //             x += speedx;
        //         }
        //         repaint();
        //     }
            
        // });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval(x-radius, y-radius, radius, radius);
        
    }
    
    class testtimer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            x += speedx;
            y += speedy;
            if(x >= getWidth()-radius || x <= radius){
                speedx = -speedx;
            }
            if(y >= getHeight()-radius || y <= radius){
                speedy = -speedy;
            }
            repaint();
        }
        
    }
}