import javax.swing.*;
import java.awt.*;
    public class button_blue extends JFrame {
        private JLabel label_1, label_2;
            private JButton button_1 , button_2;

        public button_blue() {

            setLayout(null);

            label_1 = new JLabel("boton de color plano");

            label_1.setBounds(10,70,200,10);

            add(label_1);


            label_2 = new JLabel("boton normal");

            label_2.setBounds(10,30,100,10);

            add(label_2);


            button_1 = new JButton();

            button_1.setBounds(135,65,50,30);

            Color color_1 = new Color(0, 149, 144);

            button_1.setBackground(color_1);

            add(button_1);



            button_2 = new JButton();

            button_2.setBounds(120,25,50,30);

            add(button_2);

        }

        public static void main(String[] args){

            button_blue b = new button_blue();

            b.setBounds(0,0,600,600);

            b.setLocationRelativeTo(null);

            b.setVisible(true);

            b.setResizable(false);

        }
    }