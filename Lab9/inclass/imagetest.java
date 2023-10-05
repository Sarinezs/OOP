
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class imagetest extends JFrame {

    imagetest(){
        add(new drawarea());
    }
    class drawarea extends JPanel{
        URL imageURL = this.getClass().getResource("image/bg.jfif");
        Image image = new ImageIcon(imageURL).getImage();
        URL imageactor = this.getClass().getResource("image/dante1.jfif");
        Image imagea = new ImageIcon(imageactor).getImage();
        Timer timer = new Timer(-10, new Listener());
        int x = 0;
        int y = 600;
        drawarea(){
            timer.start();
        }
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(x > getWidth()){
                x = 0;
            }
            else{
                x = x+5;
            }
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            g.drawImage(imagea, x, y, 100, 100, this);
        }
    }
    
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
        
    }
    public static void main(String[] args) {
        imagetest frame = new imagetest();
        frame.setTitle("Example");
        frame.setSize(1500, 1500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
