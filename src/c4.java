import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class c4 extends JFrame implements ActionListener {
    private JLabel label_1 , label_2 , label_3 , label_4 ;
        private JButton button_0 ,button_1 ,button_2 ,button_3 , button_4 ,
                button_5 , button_6 , button_7 , button_8 , button_9 , button_10;

        public c4() {

            setLayout(null);

            label_1 = new JLabel("___");

            label_1.setBounds(10,10,100,10);

            label_1.setFont(new Font("arial" , Font.PLAIN , 12));

            add(label_1);


            button_0 = new JButton("0");

            button_0.setBounds(10,20,50,50);

            add(button_0);

            button_0.addActionListener(this);


            button_1 = new JButton("1");

            button_1.setBounds(10,30,50,50);

            add(button_1);

            button_1.addActionListener(this);


            button_2 = new JButton("2");

            button_2.setBounds(10,40,50,50);

            add(button_2);

            button_2.addActionListener(this);


            button_3 = new JButton("3");

            button_3.setBounds(10,10,50,50);

            add(button_3);

            button_3.addActionListener(this);


            button_4 = new JButton("4");

            button_4.setBounds(10,20,50,50);

            add(button_4);

            button_4.addActionListener(this);


            button_5 = new JButton("5");

            button_5.setBounds(10,40,50,50);

            add(button_5);

            button_5.addActionListener(this);


            button_6 = new JButton("6");

            button_6.setBounds(10,60,50,50);

            add(button_6);

            button_6.addActionListener(this);


            button_7 = new JButton("7");

            button_7.setBounds(10,80,50,50);

            add(button_7);

            button_7.addActionListener(this);


            button_8 = new JButton("8");

            button_8.setBounds(10,100,50,50);

            add(button_8);

            button_8.addActionListener(this);


            button_9 = new JButton("9");

            button_9.setBounds(10,160,50,50);

            add(button_9);

            button_9.addActionListener(this);


            button_10 = new JButton("=");

            button_10.setBounds(10,190,50,50);

            add(button_10);

            button_10.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {

            int val_1 = 0, val_2 = 0 , resultado ;

            if (e.getSource() == button_0){
                val_1 = 0;
            }else if (e.getSource() == button_1){
                val_1 = 1;
            }else if (e.getSource() == button_2){
                val_1 = 2;
            }else if (e.getSource() == button_3){
                val_1 = 3;
            }else if (e.getSource() == button_4){
                val_1 = 4;
            }else if (e.getSource() == button_5){
                val_1 = 5;
            }else if (e.getSource() == button_6){
                val_1 = 6;
            }else if (e.getSource() == button_7){
                val_1 = 7;
            }else if (e.getSource() == button_8){
                val_1 = 8;
            }else if (e.getSource() == button_9){
                val_1 = 9;
            }

            if (e.getSource() == button_0){
                val_2 = 0;
            }else if (e.getSource() == button_1){
                val_2 = 1;
            }else if (e.getSource() == button_2){
                val_2 = 2;
            }else if (e.getSource() == button_3){
                val_2 = 3;
            }else if (e.getSource() == button_4){
                val_2 = 4;
            }else if (e.getSource() == button_5){
                val_2 = 5;
            }else if (e.getSource() == button_6){
                val_2 = 6;
            }else if (e.getSource() == button_7){
                val_2 = 7;
            }else if (e.getSource() == button_8){
                val_2 = 8;
            }else if (e.getSource() == button_9){
                val_2 = 9;
            }

            if (e.getSource() == button_10){
                resultado = val_1 + val_2;

                label_1.setText("resultado : " + resultado);
            }



        }

        public static void main(String[] args) {

            Color color = new Color(255, 255, 255);

            c4 c_4 = new c4();

            c_4.setBounds(0, 0, 500, 300);

            c_4.setLocationRelativeTo(null);

            c_4.setVisible(true);

            c_4.setResizable(false);

            c_4.setTitle("calculadora");

            c_4.getContentPane().setBackground(color);

        }

}