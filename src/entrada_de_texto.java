import javax.swing.*;
import java.awt.event.*;
    public class entrada_de_texto extends JFrame implements ActionListener {
        private JButton boton_1;
            private JLabel label;
                private JTextField text_1;

        public entrada_de_texto() {

            setLayout(null);

            boton_1 = new JButton("aceptar");

            boton_1.setBounds(50, 80, 100, 30);

            add(boton_1);

            boton_1.addActionListener(this);


            label = new JLabel("username : ");

            label.setBounds(50, 0, 100, 30);

            add(label);


            text_1 = new JTextField();

            text_1.setBounds(220, 17, 150, 20);

            add(text_1);
        }

        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == boton_1) {

                String text = text_1.getText();
                setTitle(text);

            }
        }

        public static void main(String[] args) {

            entrada_de_texto entrada_de_texto_1 = new entrada_de_texto();

            entrada_de_texto_1.setBounds(0, 0, 500, 500);

            entrada_de_texto_1.setVisible(true);

            entrada_de_texto_1.setLocationRelativeTo(null);

        }
    }