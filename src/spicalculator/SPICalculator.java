/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spicalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author PREMIUM
 */
public class SPICalculator extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b;
    
    SPICalculator(){
        super("SPI Calculator - Jaydev");
        
        l1 = new JLabel("SPI Calculator");
        l1.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l1.setBounds(175,5,450,50);
        add(l1);
        
        l2 = new JLabel("[Using Pointer Out Of 10 and Credit Of Course]");
        l2.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l2.setBounds(100,15,500,100);
        add(l2);
        
        l3 = new JLabel("Instructions");
        l3.setFont(new Font("CALIBRI", Font.BOLD, 20));
        l3.setBounds(190,35,450,150);
        add(l3);
        
        l4 = new JLabel("If Marks >= 80 Then Consider 10 Pointer");
        l4.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l4.setBounds(50,50,500,200);
        add(l4);
        
        l5 = new JLabel("If Marks between 70-79 Then Consider 9 Pointer");
        l5.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l5.setBounds(50,80,500,200);
        add(l5);
        
        l6 = new JLabel("If Marks between 60-69 Then Consider 8 Pointer");
        l6.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l6.setBounds(50,110,500,200);
        add(l6);
        
        l7 = new JLabel("If Marks between 55-59 Then Consider 7 Pointer");
        l7.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l7.setBounds(50,140,500,200);
        add(l7);
        
        l8 = new JLabel("If Marks between 50-54 Then Consider 6 Pointer");
        l8.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l8.setBounds(50,170,500,200);
        add(l8);
        
        l9 = new JLabel("If Marks between 45-49 Then Consider 5 Pointer");
        l9.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l9.setBounds(50,200,500,200);
        add(l9);
        
        l10 = new JLabel("If Marks between 40-44 Then Consider 4 Pointer");
        l10.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l10.setBounds(50,230,500,200);
        add(l10);
        
        l11 = new JLabel("If Marks <40 Then Consider Fail");
        l11.setFont(new Font("CALIBRI", Font.PLAIN, 16));
        l11.setBounds(50,260,500,200);
        add(l11);
        
        b = new JButton("Start");
        b.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b.setBounds(190,400,100,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        add(b);
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            new Cal1().setVisible(true);
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new SPICalculator().setVisible(true);
    }
    
}


