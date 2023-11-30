import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_app  implements ActionListener{

    double num1 = 0 , num2 = 0 , result=0;
    int calculation;
    
    
    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onJRadioButton = new JRadioButton("ON");
    JRadioButton offJRadioButton = new JRadioButton("OFF");
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton dot = new JButton(".");
    JButton clear = new JButton("C");
    JButton delete = new JButton("DEL");
    JButton equal = new JButton("=");
    JButton mull = new JButton("X");
    JButton div = new JButton("/");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton square = new JButton("x\u00B2");
    JButton perc = new JButton("%");
    JButton sqrt = new JButton("\u221A");
    

    Calculator_app(){
        
        prepareGui();
        addComponents();
        addActionEvent();

    }

    public void prepareGui(){
        frame.setSize(305 , 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents(){
        label.setBounds(250,0,50,50);
        label.setForeground(Color.WHITE);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial" , Font.BOLD , 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onJRadioButton.setBounds(10,95,60,40);
        onJRadioButton.setSelected(true);
        onJRadioButton.setFont(new Font("Arial" , Font.BOLD , 14));
        onJRadioButton.setBackground(Color.BLACK);
        onJRadioButton.setFocusable(false);
        frame.add(onJRadioButton);

        offJRadioButton.setBounds(10,120,60,40);
        offJRadioButton.setSelected(false);
        offJRadioButton.setFont(new Font("Arial" , Font.BOLD , 14));
        offJRadioButton.setBackground(Color.BLACK);
        offJRadioButton.setFocusable(false);
        frame.add(offJRadioButton);

        ButtonGroup group = new ButtonGroup();
        group.add(onJRadioButton);
        group.add(offJRadioButton);

        seven.setBounds(10,230,60,40);
        seven.setFont(new Font("Arial",Font.BOLD , 20));
        seven.setFocusable(false);
        frame.add(seven);

        eight.setBounds(80,230,60,40);
        eight.setFont(new Font("Arial" , Font.BOLD , 20));
        eight.setFocusable(false);
        frame.add(eight);

        nine.setBounds(150,230,60,40);
        nine.setFont(new Font("Arial" , Font.BOLD , 20));
        nine.setFocusable(false);
        frame.add(nine);

        four.setBounds(10,290,60,40);
        four.setFont(new Font("Arial" , Font.BOLD , 20));
        four.setFocusable(false);
        frame.add(four);

        five.setBounds(80,290,60,40);
        five.setFont(new Font("Arial" , Font.BOLD , 20));
        five.setFocusable(false);
        frame.add(five);

        six.setBounds(150,290,60,40);
        six.setFont(new Font("Arial" , Font.BOLD , 20));
        six.setFocusable(false);
        frame.add(six);

        one.setBounds(10,350 ,60,40);
        one.setFont(new Font("Arial" , Font.BOLD , 20));
        one.setFocusable(false);
        frame.add(one);

        two.setBounds(80,350,60,40);
        two.setFont(new Font("Arial" , Font.BOLD , 20));
        two.setFocusable(false);
        frame.add(two);

        three.setBounds(150,350,60,40);
        three.setFont(new Font("Arial" , Font.BOLD , 20));
        three.setFocusable(false);
        frame.add(three);

        dot.setBounds(150,410,60,40);
        dot.setFont(new Font("Arial" , Font.BOLD , 20));
        dot.setFocusable(false);
        frame.add(dot);

        zero.setBounds(10,410,130,40);
        zero.setFont(new Font("Arial" , Font.BOLD , 20));
        zero.setFocusable(false);
        frame.add(zero);

        equal.setBounds(220,350,60,100);
        equal.setFont(new Font("Arial" , Font.BOLD , 20));
        equal.setBackground(new Color(239,188,2));
        equal.setFocusable(false);
        frame.add(equal);

        div.setBounds(220,110,60,40);
        div.setFont(new Font("Arial" , Font.BOLD , 20));
        div.setBackground(new Color(239,188,2));
        div.setFocusable(false);
        frame.add(div);

        mull.setBounds(220,230,60,40);
        mull.setFont(new Font("Arial" , Font.BOLD , 20));
        mull.setBackground(new Color(239,188,2));
        mull.setFocusable(false);
        frame.add(mull);

        sqrt.setBounds(10,170,60,40);
        sqrt.setFont(new Font("Arial" , Font.BOLD , 18));
        sqrt.setFocusable(false);
        frame.add(sqrt);

        minus.setBounds(220,170,60,40);
        minus.setFont(new Font("Arial" , Font.BOLD , 20));
        minus.setBackground(new Color(239,188,2));
        minus.setFocusable(false);
        frame.add(minus);

        plus.setBounds(220,290,60,40);
        plus.setFont(new Font("Arial" ,Font.BOLD , 20));
        plus.setBackground(new Color(239,188,2));
        plus.setFocusable(false);
        frame.add(plus);

        square.setBounds(80,170, 60 ,40);
        square.setFont(new Font("Arial" , Font.BOLD , 20));
        square.setFocusable(false);
        frame.add(square);

        perc.setBounds(150,170,60,40);
        perc.setFont(new Font("Arial" , Font.BOLD , 20));
        perc.setFocusable(false);
        frame.add(perc);


        delete.setBounds(150,110,60,40);
        delete.setFont(new Font("Arial" , Font.BOLD , 12));
        delete.setBackground(Color.red);
        delete.setForeground(Color.WHITE);
        delete.setFocusable(false);
        frame.add(delete);

        clear.setBounds(80,110,60,40);
        clear.setFont(new Font("Arial" , Font.BOLD , 20));
        clear.setBackground(Color.red);
        clear.setForeground(Color.WHITE);
        clear.setFocusable(false);
        frame.add(clear);


    }

    public void addActionEvent(){

        onJRadioButton.addActionListener(this);
        offJRadioButton.addActionListener(this);
        clear.addActionListener(this);
        delete.addActionListener(this);
        div.addActionListener(this);
        sqrt.addActionListener(this);
        square.addActionListener(this);
        perc.addActionListener(this);
        minus.addActionListener(this);
        plus.addActionListener(this);
        mull.addActionListener(this);
        equal.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        zero.addActionListener(this);
        dot.addActionListener(this);


    }
    

    public static void main(String[] args) {
        Calculator_app app = new Calculator_app();
        
    }
   

    public void actionPerformed(ActionEvent e){

        Object source = e.getSource();

        if(source == onJRadioButton){

            enable();

        }else if(source == offJRadioButton){

            disable();
        }else if (source == clear) {
            label.setText("");
            textField.setText("");
            
        } else if (source == delete){
            int length = textField.getText().length();
            int number = length-1;

            if(length > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }if (textField.getText().endsWith(""));
                label.setText("");
                
        }else if (source == zero) {
            if(textField.getText().equals("0")){
                    return;
            }else{
                    textField.setText(textField.getText() + "0");
            }
                
        }else if (source == one) {
                 textField.setText(textField.getText() + "1");
            }else if (source == two) {
                 textField.setText(textField.getText() + "2");
            }else if (source == three) {
                 textField.setText(textField.getText() + "3");
            }else if (source == four) {
                 textField.setText(textField.getText() + "4");
            }else if (source == five) {
                 textField.setText(textField.getText() + "5");
            }else if (source == six) {
                 textField.setText(textField.getText() + "6");
            }else if (source == seven) {
                 textField.setText(textField.getText() + "7");
            }else if (source == eight) {
                 textField.setText(textField.getText() + "8");
            }else if (source == nine) {
                 textField.setText(textField.getText() + "9");
            }else if (source == dot) {
                if(textField.getText().contains(".")){
                    return;
                }else{
                    textField.setText(textField.getText() + ".");
                }
            }else if (source == plus) {

                String str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculation = 1;
                textField.setText("");
                label.setText(str + "+");

            }else if (source == minus) {

                String str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculation = 2;
                textField.setText("");
                label.setText(str + "-");

            }else if (source == mull) {

                String str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculation = 3;
                textField.setText(str + "X");

            }else if (source == mull) {

                String str = textField.getText();
                num1 = Double.parseDouble(textField.getText());
                calculation = 4;
                textField.setText(str + "/");

            }else if(source == square){

                num1 = Double.parseDouble(textField.getText());
                double square = Math.pow(num1, 2);
                String str2 = Double.toString(square);

                if(str2.endsWith(".0")){
                    textField.setText(str2.replace(".0", ""));
                }else{
                    textField.setText(str2);

                }

            }else if(source == sqrt){

                num1 = Double.parseDouble(textField.getText());
                double sqrt1 = Math.sqrt(num1);
                textField.setText(Double.toString(sqrt1));

            }else if(source == perc){

                num1 = Double.parseDouble(textField.getText());
                double prcge = num2 % num1;
                String str3 = Double.toHexString(prcge);

                if(str3.endsWith(".0")){
                    textField.setText(str3.replace(".0", ""));
                }else{
                    textField.setText(str3);
                }

            }else if (source == equal){

                num2 = Double.parseDouble(textField.getText());
                switch (calculation) {
                    case 1:
                         result = num1 + num2;
                        break;
                    case 2:
                         result = num1 - num2;
                         break;
                     case 3:
                         result = num1 * num2;
                         break;
                     case 4:
                         result = num1 / num2;
                         break;

                }if(Double.toString(result).endsWith(".0")){
                    textField.setText(Double.toString(result).replace(".0" , ""));
                }else{
                    textField.setText(Double.toString(result));

                }

                label.setText("");
                num1 = result;
            }   

                
        }
             
    


    public void enable(){

        onJRadioButton.setEnabled(false);
        offJRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        clear.setEnabled(true);
        delete.setEnabled(true);
        div.setEnabled(true);
        sqrt.setEnabled(true);
        square.setEnabled(true);
        perc.setEnabled(true);
        minus.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
        mull.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        plus.setEnabled(true);
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        equal.setEnabled(true);
        zero.setEnabled(true);
        dot.setEnabled(true);

    
    }

    public void disable(){

        onJRadioButton.setEnabled(true);
        offJRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        label.setText("");
        textField.setText("");
        clear.setEnabled(false);
        delete.setEnabled(false);
        div.setEnabled(false);
        sqrt.setEnabled(false);
        square.setEnabled(false);
        perc.setEnabled(false);
        minus.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
        mull.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        plus.setEnabled(false);
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        equal.setEnabled(false);
        zero.setEnabled(false);
        dot.setEnabled(false);

    
    }
}    

