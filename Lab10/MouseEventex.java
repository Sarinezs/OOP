/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MouseEventex extends JFrame {
    
    drawString drawStringobj = new drawString();
    DrawKeyArea drawkeyarea = new DrawKeyArea();
    MouseEventex(){
//        add(drawStringobj);
        add(drawkeyarea);
        drawkeyarea.setFocusable(true);
    }
    
    //inner class
    class DrawKeyArea extends JPanel{
        char ch = 'A';
        int x = 10;
        int y = 10;
        DrawKeyArea(){
            addKeyListener(new KeyAdapter(){ // also MouseAdapter
                @Override
                public void keyPressed(KeyEvent e) {
                    switch(e.getKeyCode()){
                        case KeyEvent.VK_UP:
                            y -= 10;
                            break;
                        case KeyEvent.VK_DOWN:
                            y += 10;
                            break;
                        case KeyEvent.VK_LEFT:
                            x -= 10;
                            break;
                        case KeyEvent.VK_RIGHT:
                            x += 10;
                            break;
                        default:
                            ch = e.getKeyChar();
                    }
                    
                    repaint();
                }

            });
        }
        @Override
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("TimeRoman", Font.PLAIN, 40));
        g.drawString("Position x = "+x+" y "+y, 100, 100);
        g.drawString(String.valueOf(ch),x,y);
        
    }
    }
    
    class drawString extends JPanel{
    String str = "Hello Java";
    int x = 10;
    int y = 10;
    drawString(){
        addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
            
        });
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("Position x = "+x+" y"+y, 100, 100);
        g.drawString(str,x,y);
        
    }
}
    public static void main(String[] args){
        MouseEventex  frame = new MouseEventex();
        frame.setTitle("event example");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); // null = frame will be in middle
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}
