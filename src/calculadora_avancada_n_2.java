import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class calculadora_avancada_n_2 extends JFrame implements ActionListener {
    private JTextField textLine_1 , textLine_2 ;
        private JComboBox<String> box_1 ;
            private JLabel label_1 , label_2 , label_3 , label_4 ;
                private JButton button ;

        public calculadora_avancada_n_2(){

            setLayout(null);

            label_1 = new JLabel("valor 1 :");

            label_1.setBounds(145, 50, 100, 30);

            label_1.setFont(new Font("arial",Font.PLAIN,13));

            add(label_1);

            label_2 = new JLabel("valor 2 :");

            label_2.setBounds(145, 85, 100, 30);

            label_2.setFont(new Font("arial",Font.PLAIN,13));

            add(label_2);

            label_3 = new JLabel("operasion :");

            label_3.setBounds(125, 120, 100, 30);

            label_3.setFont(new Font("arial",Font.PLAIN,13));

            add(label_3);

            label_4 = new JLabel("resultado :");

            label_4.setBounds(200,150,500,30);

            label_4.setFont(new Font("arial",Font.BOLD,13));

            add(label_4);

            textLine_1 = new JTextField();

            textLine_1.setBounds(200, 55, 150, 20);

            textLine_1.setFont(new Font("arial",Font.PLAIN,13));

            add(textLine_1);

            textLine_2 = new JTextField();

            textLine_2.setBounds(200, 90, 150, 20);

            textLine_2.setFont(new Font("arial",Font.PLAIN,13));

            add(textLine_2);

            box_1 = new JComboBox();

            box_1.setBounds(200,125,150,20);
// + - x ÷
            box_1.setFont(new Font("arial",Font.BOLD,14));

            add(box_1);

            box_1.addItem("+");

            box_1.addItem("-");

            box_1.addItem("*");

            box_1.addItem("/");

            box_1.addItem("^");

            box_1.addItem("rais");

            button = new JButton("=");

            button.setBounds(95, 155, 100, 30);

            add(button);

            button.addActionListener(this);

        }

        public void actionPerformed(ActionEvent e) {

            double val_1 , val_2 , resultado ;

            String mas = "+" , menos = "-" , por = "*" , divicion = "/" , pow = "^" , sqrt = "rais";

            val_1 = Integer.parseInt(textLine_1.getText());

            val_2 = Integer.parseInt(textLine_2.getText());

            String cad_1 = box_1.getSelectedItem().toString();

            if (cad_1.equals(mas)){

                resultado = val_1 + val_2 ;

                label_4.setText("resultado : " + resultado);

            }else if (cad_1.equals(menos)){

                resultado = val_1 - val_2 ;

                label_4.setText("resultado : " + resultado);

            }else if (cad_1.equals(por)){

                resultado = val_1 * val_2 ;

                label_4.setText("resultado : " + resultado);

            }else if (cad_1.equals(divicion)){

                resultado = val_1 / val_2 ;

                label_4.setText("resultado : " + resultado);

            }else if (cad_1.equals(pow)){

               resultado = Math.pow(val_1, val_2);

               label_4.setText("resultado : " + resultado);

            }else if (cad_1.equals(sqrt)){

                resultado = Math.sqrt(val_1);

                label_4.setText("resultado : " + resultado);

            }else{

                System.out.println("como loa echo");

            }
        }

        public static void main(String[] args) {

            Color color = new Color(255, 255, 255);

            calculadora_avancada_n_2 c_1 = new calculadora_avancada_n_2();

            c_1.setBounds(0, 0, 500, 300);

            c_1.setLocationRelativeTo(null);

            c_1.setVisible(true);

            c_1.setResizable(false);

            c_1.setTitle("calculadora");

            c_1.getContentPane().setBackground(color);

        }
    }