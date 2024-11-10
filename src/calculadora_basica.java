import javax.swing.*;
import java.awt.event.*;
    public class calculadora_basica extends JFrame implements ActionListener {
        private JTextField textLine_1 , textLine_2;
            private JLabel label_1 , label_2 , label_3;
                private JButton button_1;

                public calculadora_basica(){

                    setLayout(null);

                    label_1 = new JLabel("valor 1 :");

                    label_1.setBounds(50,5,100,30);

                    add(label_1);


                    label_2 = new JLabel("valor 2 :");

                    label_2.setBounds(50,35,100,30);

                    add(label_2);


                    label_3 = new JLabel("resultado :");

                    label_3.setBounds(120,80,100,30);

                    add(label_3);


                    textLine_1 = new JTextField();

                    textLine_1.setBounds(120,10,150,20);

                    add(textLine_1);


                    textLine_2 = new JTextField();

                    textLine_2.setBounds(120,40,150,20);

                    add(textLine_2);


                    button_1 = new JButton("=");

                    button_1.setBounds(10,80,100,30);

                    add(button_1);

                    button_1.addActionListener(this);

                }

            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button_1){

                    int valor_1 = 0,valor_2 = 0 , resultado = 0;

                        valor_1 = Integer.parseInt(textLine_1.getText());

                        valor_2 = Integer.parseInt(textLine_2.getText());

                        resultado = valor_1 + valor_2;

                        label_3.setText("resultado : " + resultado);
                }
            }

        public static void main(String[] args) {

             calculadora_basica calculadora_basica_1 = new calculadora_basica();

            calculadora_basica_1.setBounds(0, 0, 350, 300);

            calculadora_basica_1.setVisible(true);

            calculadora_basica_1.setLocationRelativeTo(null);

        }
}
