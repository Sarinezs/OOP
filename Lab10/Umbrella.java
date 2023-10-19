import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Umbrella extends JFrame {

  private Timer timer = new Timer(1000, new TimerListener());

  public Umbrella() {
    setTitle("Stickyman");
    add(new Human());
  }

  private class TimerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      repaint();
    }
  }

  public static void main(String[] args) {
    Umbrella frame = new Umbrella();

    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 720);
    frame.setVisible(true);

  }

}

class Human extends JPanel {

  int x = 50;
  int y = 50;
  int y_rain = 0;
  int y_rain1 = 0;
  int y_rain2 = 0;

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int w = getWidth();
    int h = getHeight();

    // Stage
    g.setColor(Color.DARK_GRAY);
    g.fillRect(0, 0, w, h);

    // Umbrella
    g.setColor(Color.BLACK);
    g.drawLine(0, y + 365, w, y + 365);
    g.setColor(Color.GREEN);
    g.fillArc(x + 100, 100 + y, 200, 150, 0, 180);
    g.setColor(Color.red);
    g.drawString("Surina", x + 180, y + 145);

    // Head
    g.setColor(Color.black);
    g.drawOval(x + 140, y + 175, 50, 50);

    // Hand
    g.drawLine(x + 170, y + 245, x + 180, y + 275);
    g.drawLine(x + 170, y + 245, x + 200, y + 260);
    g.drawLine(x + 170, y + 245, x + 180, y + 275);
    g.setColor(Color.BLACK);
    g.drawLine(x + 200, y + 175, x + 200, y + 260);

    // Body
    int[] a = { x + 160, x + 170, x + 170, x + 160 };
    int[] b = { y + 225, y + 225, y + 335, y + 335 };
    g.setColor(Color.BLACK);
    g.fillPolygon(a, b, 4);

    // moving section
    if (x + 100 < w) {
      x += 1;
      y_rain += 3;
      y_rain1 += 3;
      y_rain2 += 3;
      g.setColor(Color.blue);
      if(y_rain+10 == getHeight()/2){
        repaint();
        y_rain = 0;
      }
      if(y_rain1+110 == getHeight()/2){
        repaint();
        y_rain1 = 0;
      }
      if(y_rain2+50 == getHeight()/2){
        repaint();
        y_rain2 = 0;
      }

      // for(int i = 0; i<10; i++){
      //   g.drawLine(165+42*i, y_rain+10*i, 165+42*i, y_rain+10*(i+1));
      // }

      // for(int i = 0; i<10; i++){
      //   g.drawLine(500+42*i, y_rain1+10*i, 500+42*i, y_rain1+10*(i+1));
      // }

      // for(int i = 0; i<10; i++){
      //   g.drawLine(900+42*i, y_rain2+10*i, 900+42*i, y_rain2+10*(i+1));
      // }

      g.drawLine(165, y_rain, 165, y_rain+10);
      g.drawLine(100, y_rain+20, 100, y_rain+30);
      g.drawLine(142, y_rain+40, 142, y_rain+50);
      g.drawLine(184, y_rain+60, 184, y_rain+70);
      g.drawLine(226, y_rain+80, 226, y_rain+90);
      g.drawLine(268, y_rain+100, 268, y_rain+110);
      g.drawLine(310, y_rain+120, 310, y_rain+130);
      g.drawLine(350, y_rain+140, 350, y_rain+150);
      g.drawLine(392, y_rain+160, 392, y_rain+170);
      g.drawLine(432, y_rain+180, 432, y_rain+190);

      g.drawLine(474, y_rain1, 474, y_rain1+10);
      g.drawLine(512, y_rain1+20,512, y_rain1+30);
      g.drawLine(555, y_rain1+40, 555, y_rain1+50);
      g.drawLine(599, y_rain1+60, 599, y_rain1+70);
      g.drawLine(631, y_rain1+80, 631, y_rain1+90);
      g.drawLine(671, y_rain1+100, 671, y_rain1+110);
      g.drawLine(700, y_rain1+120, 700, y_rain1+130);
      g.drawLine(742, y_rain1+140, 742, y_rain1+150);
      g.drawLine(784, y_rain1+160, 784, y_rain1+170);

      // g.drawLine(50, y_rain2+40, 50, y_rain2+50);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);
      // g.drawLine(125, y_rain2+80, 125, y_rain2+90);

      g.setColor(Color.BLACK);
      if ((x + 100) % 5 == 1 || (x + 100) % 5 == 4) {
        g.drawLine(x + 165, y + 325, x + 175, y + 365);
        repaint();
      } else {
        g.drawLine(x + 163, y + 325, x + 155, y + 365);
        repaint();

      }
    } 
    else {
      repaint();
      x = 0;
      y = 50;
    }

  }

}