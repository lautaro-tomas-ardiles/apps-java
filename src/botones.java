import javax.swing.*;
import java.awt.event.*;
    public class botones extends JFrame implements ActionListener {

        JButton boton_1;

        public botones() {

            setLayout(null);

            boton_1 = new JButton("cerrar");

            boton_1.setBounds(50, 50, 100, 50);

            add(boton_1);

            boton_1.addActionListener(this);

        }

        public void actionPerformed(ActionEvent evento){

            if (evento.getSource() == boton_1){

                System.exit(0);

            }
        }

    public static void main (String args[]){

        botones ventana_1 = new botones();

        ventana_1.setBounds(0,0,1920,1080);

        ventana_1.setVisible(true);

        ventana_1.setLocationRelativeTo(null);
    }
}
