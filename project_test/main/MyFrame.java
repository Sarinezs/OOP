
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

    Mypanel panel;

    MyFrame(){
        panel = new Mypanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}