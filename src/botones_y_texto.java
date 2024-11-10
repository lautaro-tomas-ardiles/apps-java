import javax.swing.*;
import java.awt.event.*;
    public class botones_y_texto extends JFrame implements ActionListener {

        private JLabel Label_1;

        JButton boton_1;

        public botones_y_texto() {

            // soy um boludo , no funca

            setLayout(null);

            boton_1 = new JButton("cerrar");

            boton_1.setBounds(50, 20, 100, 25);

            boton_1.addActionListener(this);

            add(boton_1);

            Label_1 = new JLabel("coca-cola");

            Label_1.setBounds(850, 450, 90, 50);

            add(Label_1);

        }

        public void actionPerformed(ActionEvent evento) {

            if (evento.getSource() == boton_1) {

                System.exit(0);

            }
        }

        public static void main(String args[]) {

        botones ventana_1 = new botones();

        ventana_1.setBounds(0,0,1920,1080);

        ventana_1.setVisible(true);

        ventana_1.setLocationRelativeTo(null);

    }
}