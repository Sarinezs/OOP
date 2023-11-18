import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class test5 extends JFrame{
    JLabel l1 = new JLabel("car 1");
    JLabel l2 = new JLabel("car 2");
    JLabel l3 = new JLabel("car 3");
    JLabel l4 = new JLabel("car 4");

    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField(10);
    JTextField t4 = new JTextField(10);

    drawcar c1 = new drawcar();
    drawcar c2 = new drawcar();
    drawcar c3 = new drawcar();
    drawcar c4 = new drawcar();


    JPanel p = new JPanel();
    JPanel p2 = new JPanel(new GridLayout(4, 1));

    movingcar mc = new movingcar();


    test5(){
        this.setLayout(new BorderLayout());

        p.add(l1);
        p.add(t1);

        p.add(l2);
        p.add(t2);

        p.add(l3);
        p.add(t3);

        p.add(l4);
        p.add(t4);

        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        p2.add(c4);

        t1.addActionListener(mc);
        t2.addActionListener(mc);
        t3.addActionListener(mc);
        t4.addActionListener(mc);

        this.add(p, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
    }

    class movingcar implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == t1){
            int v1 = Integer.parseInt(t1.getText());
            c1.speed = v1;
        }
        if(e.getSource() == t2){
            int v2 = Integer.parseInt(t2.getText());
            c2.speed = v2;
        }
        if(e.getSource() == t3){
            int v3 = Integer.parseInt(t3.getText());
            c3.speed = v3;
        }
        if(e.getSource() == t4){
            int v4 = Integer.parseInt(t4.getText());
            c4.speed = v4;
        }
    }
    
    

}

    public static void main(String[] args){
        test5 frame = new test5();
        frame.setTitle("car");
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class drawcar extends JPanel{
        int speed = 0;
        int x = 10;
        Timer timer = new Timer(10, new listener());

        public drawcar(){
            this.setFocusable(true);
            timer.start();
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.red);
            if(x > getWidth()){
                x = 10;
            }
            else{
                x += speed;
            }
            g.drawRect(x+speed, 50, 30, 20);
        }

        class listener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                repaint();
            }
        }
    }

