/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package javaapplication1;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;

public class ClockAnimation extends JFrame {
    static String country = "";
    String[] Country = {"JAPAN", "US"};
    JLabel jlbThai = new JLabel("THAI");
    JLabel jlbOther = new JLabel("JAPAN");
    StillClock clock = new StillClock();
    StillClock Other = new StillClock();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel(new GridLayout(1,2,5,5));
    JPanel p3 = new JPanel();
    JTextField jtfCountry = new JTextField("JAPAN");
    JRadioButton jrdoCountry = new JRadioButton("JAPAN");
    JComboBox jcombo = new JComboBox<>(Country);
    JButton jbtButton = new JButton("OK");
    Timer timer = new Timer(1000, new TimerListener());
    
    
    public ClockAnimation() {
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        p1.add(jlbThai);
        p1.add(jlbOther);
        p2.add(clock);
        p2.add(Other);
        // p3.add(jtfCountry);
        p3.add(jcombo);
        p3.add(jbtButton);
        jbtButton.addActionListener(new listener());
        Timer timer  = new Timer(1000, new TimerListener());
        timer.start();
      
        
    }
    
    private class TimerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//            clock.setCurrentTime();
//            clock.repaint();
            
          
            country = jlbOther.getText();
            clock.setCurrentTime();
            clock.repaint();
            if(country.equals("JAPAN")){
                Other.setCurrentTime();
                Other.setHour(clock.getHour()+2);
                Other.repaint();
            }
            else if(country.equals("US")){
                Other.setCurrentTime();
                Other.setHour(clock.getHour()-9);
                Other.repaint();
            }
        }
    }
    
    class listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // country = jtfCountry.getText();
            country = (String)jcombo.getSelectedItem();
            jlbOther.setText(country);


        }
        
    }
    
    public static void main(String[] args){
        JFrame frame = new ClockAnimation();
        frame.setTitle("ClockAnimation");
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}

class StillClock extends JPanel{
    private int hour;
    private int minute;
    private int second;
    
    public StillClock(){
        setCurrentTime();
    }
    
    public StillClock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour(){
        return hour;
    }
    
    public void setHour(int hour){
        this.hour = hour;
        repaint();
    }
    
    public int getMinute(){
        return minute;
    }
    
    public void setMinute(int minute){
        this.minute = minute;
        repaint();
    }
    
    public int getSecond(){
        return second;
    }
    
    public void getSecond(int second){
        this.second = second;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        // initialize clock parameter
        int clockRadius = (int)(Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        
        // Draw circle
        g.setColor(Color.black);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius,
        2 * clockRadius, 2 * clockRadius);
        g.drawString("12", xCenter - 5, yCenter - clockRadius + 12);
        g.drawString("9", xCenter - clockRadius + 3, yCenter + 5);
        g.drawString("3", xCenter + clockRadius - 10, yCenter + 3);
        g.drawString("6", xCenter - 3, yCenter + clockRadius - 3);
        
        // Draw second hand
        int sLength = (int)(clockRadius * 0.8);
        int xSecond = (int)(xCenter + sLength *
        Math.sin(second * (2 * Math.PI / 60)));
        int ySecond = (int)(yCenter - sLength *
        Math.cos(second * (2 * Math.PI / 60)));
        g.setColor(Color.red);
        g.drawLine(xCenter, yCenter, xSecond, ySecond);
        
        // Draw minute hand
        int mLength = (int)(clockRadius * 0.65);
        int xMinute = (int)(xCenter + mLength *
        Math.sin(minute * (2 * Math.PI / 60)));
        int yMinute = (int)(yCenter - mLength *
        Math.cos(minute * (2 * Math.PI / 60)));
        g.setColor(Color.blue);
        g.drawLine(xCenter, yCenter, xMinute, yMinute);
        
        // Draw hour hand
        int hLength = (int)(clockRadius * 0.5);
        int xHour = (int)(xCenter + hLength *
        Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        int yHour = (int)(yCenter - hLength *
        Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
        g.setColor(Color.green);
        g.drawLine(xCenter, yCenter, xHour, yHour);
    }
    
    public void setCurrentTime(){
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        
        // Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
    
}
