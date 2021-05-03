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
public class Cal1 extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
    JLabel lr1,lr2,lr3,lr4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
    JTextField tr1,tr2,tr3,tr4;
    JButton b1,b2,b3;
    
    Cal1(){
        
        super("SPI Calculator - Jaydev");
        
        l19 = new JLabel("SPI Calculator");
        l19.setFont(new Font("CALIBRI", Font.BOLD, 25));
        l19.setBounds(175,5,450,50);
        add(l19);
        
        l1 = new JLabel("Sub Pointer 1");
        l1.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l1.setBounds(20,60,100,20);
        add(l1);
        
        l2 = new JLabel("Sub Pointer 2");
        l2.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l2.setBounds(20,90,100,20);
        add(l2);
        
        l3 = new JLabel("Sub pointer 3");
        l3.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l3.setBounds(20,120,100,20);
        add(l3);
        
        l4 = new JLabel("Sub Pointer 4");
        l4.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l4.setBounds(20,150,100,20);
        add(l4);
        
        l5 = new JLabel("Sub Pointer 5");
        l5.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l5.setBounds(20,180,100,20);
        add(l5);
        
        l6 = new JLabel("Sub Pointer 6");
        l6.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l6.setBounds(20,210,100,20);
        add(l6);
        
        l7 = new JLabel("Sub Pointer 7");
        l7.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l7.setBounds(20,240,100,20);
        add(l7);
        
        l8 = new JLabel("Sub Pointer 8");
        l8.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l8.setBounds(20,270,100,20);
        add(l8);
        
        l9 = new JLabel("Sub Pointer 9");
        l9.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l9.setBounds(20,300,100,20);
        add(l9);
        
        t1 = new JTextField(3);
        t1.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t1.setBounds(130,60,100,20);
        add(t1);
        
        t2 = new JTextField(3);
        t2.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t2.setBounds(130,90,100,20);
        add(t2);
        
        t3 = new JTextField(3);
        t3.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t3.setBounds(130,120,100,20);
        add(t3);
        
        t4 = new JTextField(3);
        t4.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t4.setBounds(130,150,100,20);
        add(t4);
        
        t5 = new JTextField(3);
        t5.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t5.setBounds(130,180,100,20);
        add(t5);
        
        t6 = new JTextField(3);
        t6.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t6.setBounds(130,210,100,20);
        add(t6);
        
        t7 = new JTextField(3);
        t7.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t7.setBounds(130,240,100,20);
        add(t7);
        
        t8 = new JTextField(3);
        t8.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t8.setBounds(130,270,100,20);
        add(t8);
        
        t9 = new JTextField(3);
        t9.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t9.setBounds(130,300,100,20);
        add(t9);
        
        l10 = new JLabel("Credit Sub 1");
        l10.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l10.setBounds(250,60,130,20);
        add(l10);
        
        l11 = new JLabel("Credit Sub 2");
        l11.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l11.setBounds(250,90,130,20);
        add(l11);
        
        l12 = new JLabel("Credit Sub 3");
        l12.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l12.setBounds(250,120,130,20);
        add(l12);
        
        l13 = new JLabel("Credit Sub 4");
        l13.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l13.setBounds(250,150,130,20);
        add(l13);
        
        l14 = new JLabel("Credit Sub 5");
        l14.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l14.setBounds(250,180,130,20);
        add(l14);
        
        l15 = new JLabel("Credit Sub 6");
        l15.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l15.setBounds(250,210,130,20);
        add(l15);
        
        l16 = new JLabel("Credit Sub 7");
        l16.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l16.setBounds(250,240,130,20);
        add(l16);
        
        l17 = new JLabel("Credit Sub 8");
        l17.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l17.setBounds(250,270,130,20);
        add(l17);
        
        l18 = new JLabel("Credit Sub 9");
        l18.setFont(new Font("CALIBRI", Font.PLAIN,17));
        l18.setBounds(250,300,130,20);
        add(l18);
        
        t10 = new JTextField(3);
        t10.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t10.setBounds(350,60,100,20);
        add(t10);
        
        t11 = new JTextField(3);
        t11.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t11.setBounds(350,90,100,20);
        add(t11);
        
        t12 = new JTextField(3);
        t12.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t12.setBounds(350,120,100,20);
        add(t12);
        
        t13 = new JTextField(3);
        t13.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t13.setBounds(350,150,100,20);
        add(t13);
        
        t14 = new JTextField(3);
        t14.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t14.setBounds(350,180,100,20);
        add(t14);
        
        t15 = new JTextField(3);
        t15.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t15.setBounds(350,210,100,20);
        add(t15);
        
        t16 = new JTextField(3);
        t16.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t16.setBounds(350,240,100,20);
        add(t16);
        
        t17 = new JTextField(3);
        t17.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t17.setBounds(350,270,100,20);
        add(t17);
        
        t18 = new JTextField(3);
        t18.setFont(new Font("CALIBRI", Font.PLAIN,15));
        t18.setBounds(350,300,100,20);
        add(t18);
        
        l20 = new JLabel("NOTE");
        l20.setFont(new Font("CALIBRI", Font.BOLD, 20));
        l20.setBounds(220,320,450,50);
        add(l20);
        
        l21 = new JLabel("Please also Include Your Practical Lab Pointer[Out of 10].");
        l21.setFont(new Font("CALIBRI", Font.PLAIN, 15));
        l21.setBounds(20,350,450,50);
        add(l21);
        
        l22 = new JLabel("If you have not to much subject then write '0' in rest of the field.");
        l22.setFont(new Font("CALIBRI", Font.PLAIN, 15));
        l22.setBounds(20,370,450,50);
        add(l22);
        
        t1.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t1.setEditable(true);
            } else{
                t1.setEditable(true);
                JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
                t1.setText("");
            }
         }
      });
        
        
        t2.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'  || ke.getKeyCode()==8) {
               t2.setEditable(true);
            } else{
                t2.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t2.setText("");
            }
         }
      });
        
        t3.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t3.setEditable(true);
            } else{
                t3.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t3.setText("");
            }
         }
      });
        
        t4.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t4.setEditable(true);
            } else{
                t4.setEditable(true);
                JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
                t4.setText("");
            }
         }
      });
        
        t5.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t5.setEditable(true);
            } else{
                t5.setEditable(true);
                JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
                t5.setText("");
            }
         }
      });
        
        t6.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t6.setEditable(true);
            } else{
                t6.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t6.setText("");
            }
         }
      });
        
        t7.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t7.setEditable(true);
            } else{
                t7.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t7.setText("");
            }
         }
      });
        
        t8.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t8.setEditable(true);
            } else{
                t8.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t8.setText("");
            }
         }
      });
        
        t9.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t9.setEditable(true);
            } else{
                t9.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t9.setText("");
            }
         }
      });
        
        t10.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'  || ke.getKeyCode()==8) {
               t10.setEditable(true);
            } else{
                t10.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t10.setText("");
            }
         }
      });
        
        t11.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t11.setEditable(true);
            } else{
                t11.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t11.setText("");
            }
         }
      });
        
        t12.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t12.setEditable(true);
            } else{
                t12.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t12.setText("");
            }
         }
      });
        
        t13.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t13.setEditable(true);
            } else{
                t13.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t13.setText("");
            }
         }
      });
        
        t14.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t14.setEditable(true);
            } else{
                t14.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t14.setText("");
            }
         }
      });
        
        t15.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t15.setEditable(true);
            } else{
                t15.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t15.setText("");
            }
         }
      });
        
        t16.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t16.setEditable(true);
            } else{
                t16.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t16.setText("");
            }
         }
      });
        
        t17.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9'|| ke.getKeyCode()==8) {
               t17.setEditable(true);
            } else{
                t17.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t17.setText("");
            }
         }
      });
        
        t18.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()==8) {
               t18.setEditable(true);
            } else{
                t18.setEditable(true);
               JOptionPane.showMessageDialog(null,"Only Numeric Value allowed");
               t18.setText("");
            }
         }
      });

     
        b1 = new JButton("Back");
        b1.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b1.setBounds(20,420,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Calculate");
        b2.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b2.setBounds(300,420,130,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Reset");
        b3.setFont(new Font("CALIBRI", Font.BOLD, 20));
        b3.setBounds(150,420,100,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        add(b3);
        b3.addActionListener(this);
        
        lr1 = new JLabel("Your Total Credit: ");
        lr1.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        lr1.setBounds(20,470,170,20);
        add(lr1);
        
        lr2 = new JLabel("Your Total Pointer: ");
        lr2.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        lr2.setBounds(20,510,190,20);
        add(lr2);
        
        lr3 = new JLabel("Your Total Score: ");
        lr3.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        lr3.setBounds(20,550,170,20);
        add(lr3);
        
        lr4 = new JLabel("Your Final SPI: ");
        lr4.setFont(new Font("CAMBRIA", Font.BOLD, 20));
        lr4.setBounds(20,590,170,20);
        add(lr4);
        
        tr1 = new JTextField();
        tr1.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        tr1.setBounds(230,470,170,20);
        tr1.setEditable(false);
        add(tr1);
        
        tr2 = new JTextField();
        tr2.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        tr2.setBounds(230,510,170,20);
        tr2.setEditable(false);
        add(tr2);
        
        tr3 = new JTextField();
        tr3.setFont(new Font("CAMBRIA", Font.PLAIN, 18));
        tr3.setBounds(230,550,170,20);
        tr3.setEditable(false);
        add(tr3);
        
        tr4 = new JTextField();
        tr4.setFont(new Font("CAMBRIA", Font.BOLD, 20));
        tr4.setBounds(230,590,170,20);
        tr4.setEditable(false);
        add(tr4);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(500,700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new SPICalculator().setVisible(true);
            setVisible(false);
        }
        else if(e.getSource()==b2)
        {
            if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")||t11.getText().equals("")||t12.getText().equals("")||t13.getText().equals("")||t14.getText().equals("")||t15.getText().equals("")||t16.getText().equals("")||t17.getText().equals("")||t8.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Fill All The Required Fields");
            }
            else if(Float.parseFloat(t1.getText())> 10||Float.parseFloat(t2.getText())> 10||Float.parseFloat(t3.getText())> 10||Float.parseFloat(t4.getText())> 10||Float.parseFloat(t5.getText())> 10||Float.parseFloat(t6.getText())> 10||Float.parseFloat(t7.getText())> 10||Float.parseFloat(t8.getText())> 10||Float.parseFloat(t9.getText())> 10||Float.parseFloat(t10.getText())> 10||Float.parseFloat(t11.getText())> 10||Float.parseFloat(t12.getText())> 10||Float.parseFloat(t13.getText())> 10||Float.parseFloat(t14.getText())> 10||Float.parseFloat(t15.getText())> 10||Float.parseFloat(t16.getText())> 10||Float.parseFloat(t17.getText())> 10||Float.parseFloat(t18.getText())> 10){
                JOptionPane.showMessageDialog(null,"Credit and Pointer can not be more than 10");
            }
            else{
                
                float c1 = Float.parseFloat(t10.getText());
                float c2 = Float.parseFloat(t11.getText());
                float c3 = Float.parseFloat(t12.getText());
                float c4 = Float.parseFloat(t13.getText());
                float c5 = Float.parseFloat(t14.getText());
                float c6 = Float.parseFloat(t15.getText());
                float c7 = Float.parseFloat(t16.getText());
                float c8 = Float.parseFloat(t17.getText());
                float c9 = Float.parseFloat(t18.getText());
                float TotalCredit = c1+c2+c3+c4+c5+c6+c7+c8+c9;
                
                tr1.setText(String.valueOf(TotalCredit));
                
                float p1 = Float.parseFloat(t1.getText());
                float p2 = Float.parseFloat(t2.getText());
                float p3 = Float.parseFloat(t3.getText());
                float p4 = Float.parseFloat(t4.getText());
                float p5 = Float.parseFloat(t5.getText());
                float p6 = Float.parseFloat(t6.getText());
                float p7 = Float.parseFloat(t7.getText());
                float p8 = Float.parseFloat(t8.getText());
                float p9 = Float.parseFloat(t9.getText());
                float TotalPointer = p1+p2+p3+p4+p5+p6+p7+p8+p9;
                
                tr2.setText(String.valueOf(TotalPointer));
                
                float TotalScore = c1*p1+c2*p2+c3*p3+c4*p4+c5*p5+c6*p6+c7*p7+c8*p8+c9*p9;
                
                tr3.setText(String.valueOf(TotalScore));
                
                float FinalSPI = TotalScore/TotalCredit;
                
                tr4.setText(String.valueOf(FinalSPI));
            }
        }
        else if(e.getSource()==b3){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
            t15.setText("");
            t16.setText("");
            t17.setText("");
            t18.setText("");
            tr1.setText("");
            tr2.setText("");
            tr3.setText("");
            tr4.setText("");
        }
    }
    
    public static void main(String[] args){
        new Cal1().setVisible(true);
    }
    
    
}

