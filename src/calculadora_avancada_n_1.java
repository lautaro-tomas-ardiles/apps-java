import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
    public class calculadora_avancada_n_1 extends JFrame implements ActionListener {
        private JTextField textLine_1, textLine_2, textLine_3;
            private JLabel label_1, label_2, label_3 , label_4 ;
                private JButton button_1;

        public calculadora_avancada_n_1() {

            setLayout(null);

            label_1 = new JLabel("valor 1 :");

            label_1.setBounds(60, 10, 100, 30);

            add(label_1);


            label_2 = new JLabel("valor 2 :");

            label_2.setBounds(60, 50, 100, 30);

            add(label_2);


            label_3 = new JLabel("operasion :");

            label_3.setBounds(50, 85, 100, 30);

            add(label_3);


            label_4 = new JLabel("resultado :");

            label_4.setBounds(120,115,500,30);

            add(label_4);


            textLine_1 = new JTextField();

            textLine_1.setBounds(120, 10, 150, 20);

            add(textLine_1);


            textLine_2 = new JTextField();

            textLine_2.setBounds(120, 50, 150, 20);

            add(textLine_2);


            textLine_3 = new JTextField();

            textLine_3.setBounds(120, 90, 150, 20);

            add(textLine_3);


            button_1 = new JButton("=");

            button_1.setBounds(10, 115, 100, 30);

            add(button_1);

            button_1.addActionListener(this);

        }

        public void actionPerformed(ActionEvent event) {

            int valor_1 ;
            int valor_2 ;
            int valor_3 ;
            int resultado  ;

                valor_1 = Integer.parseInt(textLine_1.getText());

                valor_2 = Integer.parseInt(textLine_2.getText());

                valor_3 = Integer.parseInt(textLine_3.getText());


                if (valor_3 == 1) {

                    resultado = valor_1 + valor_2;

                    label_4.setText("resultado : " + resultado);

                } else if (valor_3 == 2) {

                    resultado = valor_1 - valor_2;

                    label_4.setText("resultado : " + resultado);

                } else if (valor_3 == 3) {

                    resultado = valor_1 * valor_2;

                    label_4.setText("resultado : " + resultado);

                } else if (valor_3 == 4) {

                    resultado = valor_1 / valor_2;

                    label_4.setText("resultado : " + resultado);

                }else{

                    label_4.setText("eror esa operacion no esta disponible , las opsiones son 1 (+) 2 (-) 3 (x) 4 (/)");

                }
        }

        public static void main(String[] args) {

            calculadora_avancada_n_1 c_1 = new calculadora_avancada_n_1();

            c_1.setBounds(0, 0, 600, 600);

            c_1.setLocationRelativeTo(null);

            c_1.setVisible(true);

            c_1.setResizable(false);


        }
    }
