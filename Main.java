
import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JFrame frame1 = new JFrame("Calculator");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(442, 400);//352
        frame1.setLayout(null);

        JTextField tField = new JTextField();
        tField.setBounds(45, 30, 340, 50);
        frame1.add(tField);

        JButton button7 = new JButton("7");
        button7.setBounds(45, 110, 70, 40);
        frame1.add(button7);
        button7.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "7");
        });

        JButton button8 = new JButton("8");
        button8.setBounds(135, 110, 70, 40);
        frame1.add(button8);
        button8.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "8");
        });

        JButton button9 = new JButton("9");
        button9.setBounds(225, 110, 70, 40);
        frame1.add(button9);
        button9.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "9");
        });

        JButton buttonDevide = new JButton("/");
        buttonDevide.setBounds(315, 110, 70, 40);
        frame1.add(buttonDevide);
        buttonDevide.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "/");
        });

        JButton button4 = new JButton("4");
        button4.setBounds(45, 170, 70, 40);
        frame1.add(button4);
        button4.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "4");
        });

        JButton button5 = new JButton("5");
        button5.setBounds(135, 170, 70, 40);
        frame1.add(button5);
        button5.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "5");
        });

        JButton button6 = new JButton("6");
        button6.setBounds(225, 170, 70, 40);
        frame1.add(button6);
        button6.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "6");
        });

        JButton buttonMultiply = new JButton("X");
        buttonMultiply.setBounds(315, 170, 70, 40);
        frame1.add(buttonMultiply);
        buttonMultiply.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "X");
        });

        JButton button1 = new JButton("1");
        button1.setBounds(45, 230, 70, 40);
        frame1.add(button1);
        button1.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "1");
        });

        JButton button2 = new JButton("2");
        button2.setBounds(135, 230, 70, 40);
        frame1.add(button2);
        button2.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "2");
        });

        JButton button3 = new JButton("3");
        button3.setBounds(225, 230, 70, 40);
        frame1.add(button3);
        button3.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "3");
        });

        JButton buttonSub = new JButton("-");
        buttonSub.setBounds(315, 230, 70, 40);
        frame1.add(buttonSub);
        buttonSub.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "-");
        });

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(45, 290, 70, 40);
        frame1.add(buttonEqual);
        buttonEqual.addActionListener(e -> {
            String text = tField.getText();
            try {
                // Regex to split the text into operands and operator
                String[] parts = text.split("(?<=[-+X/])|(?=[-+X/])");
        
                if (parts.length == 3) {
                    double num1 = Double.parseDouble(parts[0]); // First operand
                    String operator = parts[1];               // Operator
                    double num2 = Double.parseDouble(parts[2]); // Second operand
                    double result = 0;

                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "X":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                tField.setText("Error: Div by 0");
                                return;
                            }
                            break;
                        default:
                            tField.setText("Invalid Operator");
                            return;
                    }
        
                    // Display the result
                    tField.setText(String.valueOf(result));
                } else {
                    tField.setText("Error");
                }
            } catch (Exception ex) {
                tField.setText("Error");
            }
        });
        

        JButton button0 = new JButton("0");
        button0.setBounds(135, 290, 70, 40);
        frame1.add(button0);
        button0.addActionListener(e -> {
            String text1 = tField.getText();
            tField.setText(text1 + "0");
        });

        JButton buttonBack = new JButton("←");
        buttonBack.setBounds(225, 290, 70, 40);
        frame1.add(buttonBack);
        buttonBack.addActionListener(e -> {
            String text = tField.getText();
            if(!text.isEmpty()){
                tField.setText(text.substring(0, text.length()-1));
            }
        });

        JButton buttonSum = new JButton("+");
        buttonSum.setBounds(315, 290, 70, 40);
        frame1.add(buttonSum);
        buttonSum.addActionListener(e -> {
            String text1 = tField.getText();
               tField.setText(text1+"+");
        });
        frame1.setVisible(true);
    }
}
