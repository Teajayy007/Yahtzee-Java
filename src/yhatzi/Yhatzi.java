/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yhatzi;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Yhatzi extends JFrame {

    private int rand;

    private Container content;
    private JLabel jp1, jp2, jp3, jp4, jp5, jp6, playerScore, title;
    private JButton btn1, btn2, btn3, bt4, btn5, roll, start, about, quit, hld1, hld2, hld3, hld4, hld5;
    private JTextField score;
    private ImageIcon[] dice
            = {new ImageIcon("none.png"),
                new ImageIcon("one.png"),
                new ImageIcon("two.png"),
                new ImageIcon("three.png"),
                new ImageIcon("four.png"),
                new ImageIcon("five.png"),
                new ImageIcon("six.png")
            };

    public Yhatzi() {
        super("YHATZI");
        content = getContentPane();
        content.setLayout(new FlowLayout());
        content.setBackground(Color.darkGray);
       
         title = new JLabel("LET'S GO!!");
         title.setForeground(Color.WHITE);
         
        jp1 = new JLabel(dice[0]);

        jp2 = new JLabel(dice[0]);

        jp3 = new JLabel(dice[0]);

        jp4 = new JLabel(dice[0]);

        jp5 = new JLabel(dice[0]);
        playerScore = new JLabel("score is :");
        playerScore.setForeground(Color.WHITE);

        score = new JTextField("", 5);
        score.setEditable(false);
        score.setBackground(Color.pink);
        hld1 = new JButton("Hold");
        hld1.setBackground(Color.gray);

        hld2 = new JButton("Hold");
        hld2.setBackground(Color.gray);
        hld3 = new JButton("Hold");
        hld3.setBackground(Color.gray);
        hld4 = new JButton("Hold");
        hld4.setBackground(Color.gray);
        hld5 = new JButton("Hold");
        hld5.setBackground(Color.gray);

        roll = new JButton("roll");
        roll.setBackground(Color.magenta);
        start = new JButton("Start");
        start.setBackground(Color.green);
        quit = new JButton("Quit");
        quit.setBackground(Color.orange);
        about = new JButton("About");
        about.setBackground(Color.yellow);
        
        content.add(jp1);
        content.add(hld1);
        content.add(jp2);
        content.add(hld2);
        content.add(jp3);
        content.add(hld3);
        content.add(jp4);
        content.add(hld4);
        content.add(jp5);
        content.add(hld5);
        content.add(roll);
        content.add(playerScore);
        content.add(score);
        content.add(start);
        content.add(roll);
        roll.setEnabled(false);
        content.add(quit);
        content.add(about);
        content.add(title);

        hld1.setEnabled(false);
        hld2.setEnabled(false);
        hld3.setEnabled(false);
        hld4.setEnabled(false);
        hld5.setEnabled(false);

        rollHanlder rollhand = new rollHanlder();
        roll.addActionListener(rollhand);
        start.addActionListener(rollhand);
        quit.addActionListener(rollhand);
        about.addActionListener(rollhand);
        hld1.addActionListener(rollhand);
        hld2.addActionListener(rollhand);
        hld3.addActionListener(rollhand);
        hld4.addActionListener(rollhand);
        hld5.addActionListener(rollhand);
        score.addActionListener(rollhand);

        setSize(400, 200);
        setVisible(true);
    }

    private class rollHanlder implements ActionListener {

        int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;
        int totalScore = 0;
        boolean x1, x2, x3, x4, x5 = false;

        public void rollDice() {

            Random random = new Random();
            rand = random.nextInt(6) + 1;

        }

        public int getRoll() {
            return rand;
        }
        int i = 0;

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == roll) {

                i++;
                if (i == 3) {
                    roll.setEnabled(false);
                    i = 0;
                }
                // int totalScore = 0;
                // int l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;
                if (x1 == false) {
                    rollDice();

                    if (getRoll() == 1) {
                        jp1.setIcon(dice[1]);

                    } else if (getRoll() == 2) {
                        jp1.setIcon(dice[2]);

                    } else if (getRoll() == 3) {
                        jp1.setIcon(dice[3]);

                    } else if (getRoll() == 4) {
                        jp1.setIcon(dice[4]);

                    } else if (getRoll() == 5) {
                        jp1.setIcon(dice[5]);

                    } else {
                        jp1.setIcon(dice[6]);
                    }
l1 = getRoll();
                }
                
                if (x2 == false) {
                    rollDice();
                    if (getRoll() == 1) {
                        jp2.setIcon(dice[1]);

                    } else if (getRoll() == 2) {
                        jp2.setIcon(dice[2]);

                    } else if (getRoll() == 3) {
                        jp2.setIcon(dice[3]);

                    } else if (getRoll() == 4) {
                        jp2.setIcon(dice[4]);

                    } else if (getRoll() == 5) {
                        jp2.setIcon(dice[5]);

                    } else {
                        jp2.setIcon(dice[6]);
                    }
l2 = getRoll();
                }
                
                if (x3 == false) {
                    rollDice();
                    if (getRoll() == 1) {
                        jp3.setIcon(dice[1]);

                    } else if (getRoll() == 2) {
                        jp3.setIcon(dice[2]);

                    } else if (getRoll() == 3) {
                        jp3.setIcon(dice[3]);

                    } else if (getRoll() == 4) {
                        jp3.setIcon(dice[4]);

                    } else if (getRoll() == 5) {
                        jp3.setIcon(dice[5]);

                    } else {
                        jp3.setIcon(dice[6]);
                    }
l3 = getRoll();
                }
                
                if (x4 == false) {
                    rollDice();
                    if (getRoll() == 1) {
                        jp4.setIcon(dice[1]);

                    } else if (getRoll() == 2) {
                        jp4.setIcon(dice[2]);

                    } else if (getRoll() == 3) {
                        jp4.setIcon(dice[3]);

                    } else if (getRoll() == 4) {
                        jp4.setIcon(dice[4]);

                    } else if (getRoll() == 5) {
                        jp4.setIcon(dice[5]);

                    } else {
                        jp4.setIcon(dice[6]);
                    }
  l4 = getRoll();
                }
              
                if (x5 == false) {
                    rollDice();
                    if (getRoll() == 1) {
                        jp5.setIcon(dice[1]);

                    } else if (getRoll() == 2) {
                        jp5.setIcon(dice[2]);

                    } else if (getRoll() == 3) {
                        jp5.setIcon(dice[3]);

                    } else if (getRoll() == 4) {
                        jp5.setIcon(dice[4]);

                    } else if (getRoll() == 5) {
                        jp5.setIcon(dice[5]);

                    } else {
                        jp5.setIcon(dice[6]);
                    }
l5 = getRoll();
                }
                
                totalScore = l1 + l2 + l3 + l4 + l5;

                String scr = Integer.toString(totalScore);
                score.setText(scr);
            } else if (e.getSource() == quit) {
                System.exit(0);
            } else if (e.getSource() == start) {
                //   int l1, l2, l3, l4, l5, l6 = 0;
                x1 = false;
                x2 = false;
                x3 = false;
                x4 = false;
                x5 = false;
                score.setText("");
                jp1.setIcon(dice[0]);
                jp2.setIcon(dice[0]);
                jp3.setIcon(dice[0]);
                jp4.setIcon(dice[0]);
                jp5.setIcon(dice[0]);

                roll.setEnabled(true);
                hld1.setEnabled(true);
                hld2.setEnabled(true);
                hld3.setEnabled(true);
                hld4.setEnabled(true);
                hld5.setEnabled(true);
                hld1.setBackground(Color.red);
                hld2.setBackground(Color.red);
                hld3.setBackground(Color.red);
                hld4.setBackground(Color.red);
                hld5.setBackground(Color.red);
                i = 0;

            } else if (e.getSource() == about) {

            } else if (e.getSource() == hld1) {
                x1 = true;
                hld1.setEnabled(false);
                hld1.setBackground(Color.yellow);

            } else if (e.getSource() == hld2) {
                x2 = true;
                hld2.setEnabled(false);
                hld2.setBackground(Color.yellow);
            } else if (e.getSource() == hld3) {
                x3 = true;
                hld3.setEnabled(false);
                hld3.setBackground(Color.yellow);
            } else if (e.getSource() == hld4) {
                x4 = true;
                hld4.setEnabled(false);
                hld4.setBackground(Color.yellow);
            } else if (e.getSource() == hld5) {
                x5 = true;
                hld5.setEnabled(false);
                hld5.setBackground(Color.yellow);
            }

        }

    }

    public static void main(String[] args) {
        Yhatzi yat = new Yhatzi();

        yat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
