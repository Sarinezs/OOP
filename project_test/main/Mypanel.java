import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mypanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgrountImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    Mypanel(){
        this.setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_HEIGHT));
        this.setBackground(Color.black);
        enemy = new ImageIcon("Boss.png").getImage();
        timer = new Timer(1000, null);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
}