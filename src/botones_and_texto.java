import java.awt.event.*;
import javax.swing.*;

    public class botones_and_texto extends JFrame implements ActionListener {

        private JButton boton_1,boton_2,boton_3;
            private JLabel label;

            public botones_and_texto(){

                setLayout(null);

                boton_1 = new JButton("1");

                boton_1.setBounds(10,100,90,30);

                add(boton_1);

                boton_1.addActionListener(this);


                boton_2 = new JButton("2");

                boton_2.setBounds(110,100,90,30);

                add(boton_2);

                boton_2.addActionListener(this);


                boton_3 = new JButton("3");

                boton_3.setBounds(210,100,90,30);

                add(boton_3);

                boton_3.addActionListener(this);


                label = new JLabel("en espera ...");

                label.setBounds(10,10,300,30);

                add(label);
            }

        public void actionPerformed(ActionEvent evento) {

                if (evento.getSource() == boton_1) {

                    label.setText("has presonnaodo el uno ");

                }
                if (evento.getSource() == boton_2) {

                    label.setText("has presonnaodo el dos ");

                }
                if (evento.getSource() == boton_3) {

                    label.setText("has presonnaodo el tres");

                }

            }

        public static void main(String[] args) {

            botones_and_texto botones_and_texto_1 = new botones_and_texto();

            botones_and_texto_1.setBounds(0, 0, 350, 300);

            botones_and_texto_1.setVisible(true);

            botones_and_texto_1.setLocationRelativeTo(null);

        }

    }