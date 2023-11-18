import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class test extends JFrame{
    
    test(){
        this.add(new draw());
    }

    public static void main(String[] args){
        test frame = new test();
        frame.setTitle("test");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class draw extends JPanel{
    int x = 50;
    int y = 50;
    int speedx = 10;
    int speedy = 10;
    int radius = 50;
    Timer timer = new Timer(1, new Ballmoving());

    Thread ball = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(100);
                }catch(Exception e){}

                x += speedx;
                y += speedy;
                if(x >= getWidth()){
                    speedx = -speedx;
                }
                if(x <= radius){
                    speedx = -speedx;
                }
                if(y >= getHeight()){
                    speedy = -speedy;
                }
                if(y <= radius){
                    speedy = -speedy;
                }
                repaint();
            }
        }
    });

    public draw(){
        this.setFocusable(true);    
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                int a = e.getKeyCode();
                if(a == KeyEvent.VK_A){
                    x -= 10;
                }
                else if(a == KeyEvent.VK_D){
                    x += 10;
                }
                else if(a == KeyEvent.VK_W){
                    y -= 10;
                }
                else if(a == KeyEvent.VK_S){
                    y += 10;
                }
                repaint();
            }
        });
        timer.start();
        // ball.start();
    }

    public class Ballmoving implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            x += speedx;
            y += speedy;
            // System.out.println(x);
            if(x >= getWidth()){
                // x = -x;
                speedx = -speedx;
            }
            if(x <= radius){
                // x = -x;
                speedx = -speedx;
            }
            if(y >= getHeight()){
                // y = -y;
                speedy = -speedy;
            }
            if(y <= radius){
                // y = -y;
                speedy = -speedy;
            }
            repaint();
        }
        
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval(x-radius, y-radius, radius,radius);
        g.drawString("X : "+x+" Y : "+y, 300, 10);
    }
}