package toolkit;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class toolkit {

    public static void main(String[] args) {
        JFrame first = new JFrame("TOOLKIT");
        first.getContentPane().setBackground(Color.CYAN);
        JButton b1 = new JButton("CALCULATOR");//done
        b1.setBounds(100, 150, 170, 40);
        b1.setBackground(Color.YELLOW);
        JButton b4 = new JButton("NOTEPAD");//left to copy
        b4.setBounds(350, 150, 170, 40);
        b4.setBackground(Color.YELLOW);
        JButton b5 = new JButton("CHECKLIST");//done
        b5.setBounds(100, 300, 170, 40);
        b5.setBackground(Color.YELLOW);
        JButton b6 = new JButton("SIMPLE INTEREST GENERATOR");//copy
        b6.setBounds(350, 300, 170, 40);
        b6.setBackground(Color.YELLOW);
        JButton b7 = new JButton("COMPOUND INTEREST GENERATOR");//done
        b7.setBounds(100, 450, 170, 40);
        b7.setBackground(Color.YELLOW);
        JButton b8 = new JButton("FAVOURITE SITES");
        b8.setBounds(350, 450, 170, 40);
        b8.setBackground(Color.YELLOW);
        first.add(b1);
        first.add(b4);
        first.add(b5);
        first.add(b6);
        first.add(b7);
        first.add(b8);
        first.setSize(700, 700);
        first.setLayout(null);
        first.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sc = new JFrame("Simpla Calculator");
                sc.setLayout(null);
                sc.getContentPane().setBackground(Color.CYAN);

                // Fields for input and output
                final JTextField result = new JTextField();
                result.setBounds(100, 350, 100, 50);
                final JTextField num1 = new JTextField();
                num1.setBounds(100, 250, 100, 50);
                final JTextField num2 = new JTextField();
                num2.setBounds(100, 150, 100, 50);
                result.setEditable(false);

                // Buttons for operations
                final JButton b_add = new JButton("Add");
                b_add.setBounds(250, 150, 100, 40);
                b_add.setBackground(Color.YELLOW);
                final JButton b_sub = new JButton("Subtract");
                b_sub.setBounds(370, 150, 100, 40);
                b_sub.setBackground(Color.YELLOW);
                final JButton b_mul = new JButton("Multiply");
                b_mul.setBounds(250, 250, 100, 40);
                b_mul.setBackground(Color.YELLOW);
                final JButton b_div = new JButton("Divide");
                b_div.setBounds(370, 250, 100, 40);
                b_div.setBackground(Color.YELLOW);

                // Listener to handle operations
                ActionListener calculator;
                calculator = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (num1.getText().length() == 0 || num2.getText().length() == 0) {
                                throw new Exception();
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Field missing", "Warning", JOptionPane.WARNING_MESSAGE);
                        }

                        Double x = Double.parseDouble(num1.getText());
                        Double y = Double.parseDouble(num2.getText());
                        Double z = null;
                        DecimalFormat f = new DecimalFormat("##.00");

                        if (e.getSource() == b_add) {
                            z = x + y;
                        } else if (e.getSource() == b_sub) {
                            z = x - y;
                        } else if (e.getSource() == b_mul) {
                            z = x * y;
                        } else if (e.getSource() == b_div) {
                            z = x / y;
                        }
                        result.setText(f.format(z));
                    }
                };
                // Register buttons to event listener
                b_add.addActionListener(calculator);
                b_sub.addActionListener(calculator);
                b_mul.addActionListener(calculator);
                b_div.addActionListener(calculator);

                // Add everything to frame + labels    
                sc.add(new JLabel("First Number"));
                sc.add(num1);
                sc.add(new JLabel("Second Number"));
                sc.add(num2);
                sc.add(new JLabel("Result"));
                sc.add(result);
                sc.add(b_add);
                sc.add(b_sub);
                sc.add(b_mul);
                sc.add(b_div);
                sc.setSize(500, 500);
                sc.setLocationRelativeTo(null);
                sc.setVisible(true);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ci = new JFrame("COMPOUND INTEREST GENERATOR");
                ci.getContentPane().setBackground(Color.CYAN);
                final JTextField principal = new JTextField();
                final JTextField rate = new JTextField();
                final JTextField years = new JTextField();
                JTextField inc = new JTextField();
                JLabel principal1 = new JLabel("PLEASE ENTER THE PRINCIPAL AMOUNT");
                principal1.setBackground(Color.YELLOW);
                JLabel rate1 = new JLabel("PLEASE ENTER THE RATE OF INTEREST");
                rate1.setBackground(Color.YELLOW);
                JLabel years1 = new JLabel("PLEASE ENTER THE NUMBER OF YEARS");
                years1.setBackground(Color.YELLOW);
                JLabel no = new JLabel("PLEASE ENTER THE NUMBER OF TIME INTEREST SHOULD BE COMPOUNDED");
                no.setBackground(Color.YELLOW);
                final JTextField no1 = new JTextField();
                JButton cia = new JButton("TOTAL INTEREST WITH AMOUNT");
                principal1.setBounds(70, 90, 240, 40);
                principal.setBounds(300, 90, 240, 40);
                rate1.setBounds(70, 150, 240, 40);
                rate.setBounds(300, 150, 240, 40);
                years1.setBounds(70, 220, 240, 40);
                years.setBounds(300, 220, 240, 40);
                no.setBounds(70, 300, 500, 40);
                no1.setBounds(530, 300, 240, 40);
                final JTextField amount = new JTextField();
                cia.setBounds(300, 450, 300, 40);
                amount.setBackground(Color.YELLOW);
                amount.setBounds(70, 380, 400, 40);
                ci.add(principal);
                ci.add(principal1);
                ci.add(years);
                ci.add(years1);
                ci.add(rate);
                ci.add(rate1);
                ci.add(cia);
                ci.add(amount);
                ci.add(no);
                ci.add(no1);
                ci.setSize(700, 700);
                ci.setLayout(null);
                ci.setVisible(true);
                cia.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int p, r = 0, y, n, r1;
                        double finalamount = 0;
                        double ciamount;
                        p = Integer.parseInt(principal.getText());
                        r = Integer.parseInt(rate.getText());
                        r1 = r / 100;
                        y = Integer.parseInt(years.getText());
                        n = Integer.parseInt(no1.getText());
                        ciamount = p * (1 + r1 / n);
                        ciamount = Math.pow(ciamount, y * n);
                        finalamount = ciamount + p;
                        amount.setText("TOTAL INTEREST WITH AMOUNT IS " + finalamount);

                    }

                });
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame("CHECKLIST");
                f1.getContentPane().setBackground(Color.CYAN);
                JLabel list = new JLabel("LIST ");
                list.setBackground(Color.YELLOW);
                final JTextField check1 = new JTextField();
                check1.setBounds(150, 150, 450, 40);
                final JTextField check2 = new JTextField();
                check2.setBounds(150, 210, 450, 40);
                final JTextField check3 = new JTextField();
                check3.setBounds(150, 270, 450, 40);
                final JTextField check4 = new JTextField();
                check4.setBounds(150, 330, 450, 40);
                final JTextField check5 = new JTextField();
                check5.setBounds(150, 390, 450, 40);
                final JTextField check6 = new JTextField();
                check6.setBounds(150, 450, 450, 40);
                final JTextField check7 = new JTextField();
                check7.setBounds(150, 510, 450, 40);
                final JTextField check8 = new JTextField();
                check8.setBounds(150, 570, 450, 40);
                final JCheckBox cb1 = new JCheckBox();
                cb1.setBounds(100, 150, 40, 20);
                final JCheckBox cb2 = new JCheckBox();
                cb2.setBounds(100, 210, 40, 20);
                final JCheckBox cb3 = new JCheckBox();
                cb3.setBounds(100, 270, 40, 20);
                final JCheckBox cb4 = new JCheckBox();
                cb4.setBounds(100, 330, 40, 20);
                final JCheckBox cb5 = new JCheckBox();
                cb5.setBounds(100, 390, 40, 20);
                final JCheckBox cb6 = new JCheckBox();
                cb6.setBounds(100, 450, 40, 20);
                final JCheckBox cb7 = new JCheckBox();
                cb7.setBounds(100, 510, 40, 20);
                final JCheckBox cb8 = new JCheckBox();
                cb8.setBounds(100, 570, 40, 20);
                f1.add(check1);
                f1.add(check2);
                f1.add(check3);
                f1.add(check4);
                f1.add(check5);
                f1.add(check6);
                f1.add(check7);
                f1.add(check8);
                f1.add(cb1);
                f1.add(cb2);
                f1.add(cb3);
                f1.add(cb4);
                f1.add(cb5);
                f1.add(cb6);
                f1.add(cb7);
                f1.add(cb8);
                f1.setSize(900, 900);
                f1.setLayout(null);
                f1.setVisible(true);
                ActionListener check = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == cb1) {
                            check1.setText("       ");
                        } else {
                            check1.setEditable(true);
                        }
                        if (e.getSource() == cb2) {
                            check2.setText("       ");
                        } else {
                            check2.setEditable(true);
                        }
                        if (e.getSource() == cb3) {
                            check3.setText("       ");
                        } else {
                            check3.setEditable(true);
                        }
                        if (e.getSource() == cb4) {
                            check4.setText("       ");
                        } else {
                            check4.setEditable(true);
                        }
                        if (e.getSource() == cb5) {
                            check5.setText("       ");
                        } else {
                            check5.setEditable(true);
                        }
                        if (e.getSource() == cb6) {
                            check6.setText("       ");
                        } else {
                            check6.setEditable(true);
                        }
                        if (e.getSource() == cb7) {
                            check7.setText("       ");
                        } else {
                            check7.setEditable(true);
                        }
                        if (e.getSource() == cb8) {
                            check8.setText("       ");
                        } else {
                            check8.setEditable(true);
                        }
                    }
                };
                cb1.addActionListener(check);
                cb2.addActionListener(check);
                cb3.addActionListener(check);
                cb4.addActionListener(check);
                cb5.addActionListener(check);
                cb6.addActionListener(check);
                cb7.addActionListener(check);
                cb8.addActionListener(check);

            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame si = new JFrame("SIMPLE INTEREST GENERATOR");
                si.getContentPane().setBackground(Color.CYAN);
                si.setSize(700, 700);
                final JTextField principal = new JTextField();
                final JTextField rate = new JTextField();
                final JTextField years = new JTextField();
                JLabel principal1 = new JLabel("PLEASE ENTER THE PRINCIPAL AMOUNT =");
                principal1.setBackground(Color.YELLOW);
                JLabel rate1 = new JLabel("PLEASE ENTER THE RATE OF INTEREST =");
                rate1.setBackground(Color.YELLOW);
                JLabel years1 = new JLabel("PLEASE ENTER THE NUMBER OF YEARS =");
                years1.setBackground(Color.YELLOW);
                JButton sia = new JButton("TOTAL INTEREST WITH AMOUNT");
                sia.setBackground(Color.YELLOW);
                final JTextField amount = new JTextField();
                sia.setBounds(300, 450, 300, 40);
                amount.setBounds(70, 280, 400, 40);
                principal1.setBounds(70, 90, 250, 40);
                principal.setBounds(300, 90, 200, 40);
                rate1.setBounds(70, 150, 250, 40);
                rate.setBounds(300, 150, 200, 40);
                years1.setBounds(70, 220, 250, 40);
                years.setBounds(300, 220, 200, 40);
                si.setLayout(null);
                si.add(principal);
                si.add(principal1);
                si.add(rate);
                si.add(rate1);
                si.add(years);
                si.add(years1);
                si.add(sia);
                si.add(amount);
                si.setVisible(true);
                sia.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int p, r, y;
                        double siamount;
                        p = Integer.parseInt(principal.getText());
                        r = Integer.parseInt(rate.getText());
                        y = Integer.parseInt(years.getText());
                        siamount = p * r * y;
                        amount.setText("TOTAL INTEREST WITH AMOUNT IS " + siamount / 100 + p);
                    }
                });
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame notepad = new JFrame("NOTEPAD");
                notepad.getContentPane().setBackground(Color.CYAN);
                final JTextField tf = new JTextField();
                final JButton save = new JButton("SAVE");
                save.setBackground(Color.RED);
                tf.setBounds(70, 70, 300, 90);
                save.setBounds(70, 300, 90, 40);
                notepad.add(save);
                notepad.add(tf);
                notepad.setSize(700, 700);
                notepad.setLayout(null);
                notepad.setVisible(true);
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == save) {
                            try {
                                String text;
                                text = tf.getText();
                                FileWriter fw = new FileWriter("C:\\Users\\gandh\\Desktop\\quicknotepad.txt");
                                fw.write(text);
                                fw.close();

                            } catch (Exception x) {

                            }

                        }
                    }
                });
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame("SAVED SITES");
                f1.getContentPane().setBackground(Color.CYAN);
                final JTextField check1 = new JTextField();
                check1.setBounds(150, 150, 450, 40);
                final JTextField check2 = new JTextField();
                check2.setBounds(150, 210, 450, 40);
                final JTextField check3 = new JTextField();
                check3.setBounds(150, 270, 450, 40);
                final JTextField check4 = new JTextField();
                check4.setBounds(150, 330, 450, 40);
                final JButton cb1 = new JButton("Save 1 ");
                cb1.setBounds(50, 150, 100, 40);
                cb1.setBackground(Color.YELLOW);
                final JButton cb2 = new JButton("Save 2 ");
                cb2.setBounds(50, 210, 100, 40);
                cb2.setBackground(Color.YELLOW);
                final JButton cb3 = new JButton("Save 3 ");
                cb3.setBounds(50, 270, 100, 40);
                cb3.setBackground(Color.YELLOW);
                final JButton cb4 = new JButton("Save 4 ");
                cb4.setBounds(50, 330, 100, 40);
                cb4.setBackground(Color.YELLOW);
                f1.add(check1);
                f1.add(check2);
                f1.add(check3);
                f1.add(check4);
                f1.add(cb1);
                f1.add(cb2);
                f1.add(cb3);
                f1.add(cb4);
                f1.setSize(900, 900);
                f1.setLayout(null);
                f1.setVisible(true);
                ActionListener tosave = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textsite;
                        if (e.getSource() == cb1) {
                            textsite = check1.getText();
                            try {
                                FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\myfavsite.txt");
                                fw.write(textsite);
                                fw.close();

                            } catch (Exception x) {
                                System.out.println(x);
                            }

                        }
                        if (e.getSource() == cb2) {
                            textsite = check2.getText();
                            try {
                                FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\myfavsite1.txt");
                                fw.write(textsite);
                                fw.close();

                            } catch (Exception x) {
                                System.out.println(x);
                            }

                        }
                        if (e.getSource() == cb3) {
                            textsite = check3.getText();
                            try {
                                FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\myfavsite2.txt");
                                fw.write(textsite);
                                fw.close();

                            } catch (Exception x) {
                                System.out.println(x);
                            }

                        }
                        if (e.getSource() == cb4) {
                            textsite = check4.getText();
                            try {
                                FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\myfavsite3.txt");
                                fw.write(textsite);
                                fw.close();

                            } catch (Exception x) {
                                System.out.println(x);
                            }

                        }
                    }
                };
                cb1.addActionListener(tosave);
                cb2.addActionListener(tosave);
                cb3.addActionListener(tosave);
                cb4.addActionListener(tosave);
            }
        });
    }
}
