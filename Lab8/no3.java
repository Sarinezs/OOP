/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author student
 */
public class no3 extends JFrame {
    no3(){
        getContentPane().setLayout(new GridLayout(2,4,5,7));
        getContentPane().add(new ex1());
        getContentPane().add(new ex2());
        getContentPane().add(new ex3());
        getContentPane().add(new ex4());
        getContentPane().add(new ex5());
        getContentPane().add(new ex6());
        getContentPane().add(new ex7());
    }
    
    public static void main(String[] args){
        no3 frame = new no3();
        frame.setSize(400,400);
        frame.setTitle("Ex abstract class");
        frame.setVisible(true);
    }
}

abstract class AbstractDrawFunction extends JPanel{
    private Polygon p = new Polygon();
    protected AbstractDrawFunction(){
        drawFunction();
        setBackground(Color.white);
    }
    public abstract double f(double x);
    
    public void drawFunction(){
        for(int x = -100; x<=100; x++){
            p.addPoint(x+200, 200-(int)f(x));
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        g.drawLine(10,200,390,200);
        g.drawLine(200,30,200,390);
        
        g.drawLine(390,200,370,190);
        g.drawLine(390,200,370,210);
        
        g.drawLine(200,30,190,50);
        g.drawLine(200,30,210,50);
        
        g.drawString("X",370,170);
        g.drawString("Y",220,40);
        
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
    }
}

class ex1 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return x*x;
    }
    
    protected ex1(){
        drawFunction();
        setBackground(Color.MAGENTA);
    }
    
}

class ex2 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return Math.sin(x)*10;
    }
    
    protected ex2(){
        drawFunction();
        setBackground(Color.CYAN);
    }
    
}

class ex3 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return Math.cos(x)*10;
    }
    
    protected ex3(){
        drawFunction();
        setBackground(Color.BLUE);
    }
    
}

class ex4 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return Math.tan(x);
    }
    
    protected ex4(){
        drawFunction();
        setBackground(Color.GREEN);
    }
    
}
class ex5 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return Math.cos(x) + 5*Math.sin(x);
    }
    
    protected ex5(){
        drawFunction();
        setBackground(Color.YELLOW);
    }
    
}
class ex6 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return 5*Math.cos(x)+ Math.sin(x);
    }
    
    protected ex6(){
        drawFunction();
        setBackground(Color.ORANGE);
    }
    
}
class ex7 extends AbstractDrawFunction{

    @Override
    public double f(double x) {
        return Math.log10(x) + Math.pow(x,2);
    }
    
    protected ex7(){
        drawFunction();
        setBackground(Color.RED);
    }
    
}

