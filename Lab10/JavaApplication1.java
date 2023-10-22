/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// package javaapplication1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author student
 */
public class JavaApplication1 extends JFrame implements ActionListener{
    DrawCircle drawcircle = new DrawCircle();
    JButton jbtEnlarge = new JButton("Enlarge");
    JButton jbtShrink = new JButton("Shrink");
    JPanel p = new JPanel(); // paper
    JavaApplication1(){
        p.add(jbtEnlarge); // push Button in paper
        p.add(jbtShrink);
        add(drawcircle, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH); //push paper in frame and
        jbtEnlarge.addActionListener(this);
        jbtShrink.addActionListener(this);
        
        // Or use annoymous listener
//        jbtShrink.addActionListener(new ActionListener(){
//            if(e.getSource() == jbtEnlarge){
//                drawcircle.incRadius();
//            }
//            else if(e.getSource() == jbtShrink){
//                drawcircle.decRadius();
//            }
//            else{
//                
//            }
//        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication1 frame = new JavaApplication1(); // this frame can't any draw
        frame.setTitle("event example");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); // null = frame will be in middle
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
    
    //inner class
//    class Listener implements ActionListener{ // have incomplete method
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if(e.getSource() == jbtEnlarge){
//                drawcircle.incRadius();
//            }
//            else if(e.getSource() == jbtShrink){
//                drawcircle.decRadius();
//            }
//            else{
//                
//            }
//        }
//        
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbtEnlarge){
                drawcircle.incRadius();
            }
            else if(e.getSource() == jbtShrink){
                drawcircle.decRadius();
            }
            else{
                
            }
    }
}

class DrawCircle extends JPanel{
    int radius = 100;
    void incRadius(){
        radius++;
        repaint(); // call paintComponent function
    }
    
    void decRadius(){
        radius--;
        repaint(); // call paintComponent function
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g); // clear old frame
        g.setColor(Color.red);
        g.drawOval(getWidth()/2-radius, getHeight()/2-radius, 2*radius, 2*radius);
    }
}
