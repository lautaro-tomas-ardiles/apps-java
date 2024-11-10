import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {
    private JMenuBar bar ;
        private JMenu menu;
            private JMenuItem item_1 , item_2 , item_3 ;

        private menu(){

            setLayout(null);

            bar = new JMenuBar();

            setJMenuBar(bar);


            menu = new JMenu("opciones");

            bar.add(menu);


            item_1 = new JMenuItem("rojo");

            item_1.addActionListener(this);

            menu.add(item_1);


            item_2 = new JMenuItem("verde");

            item_2.addActionListener(this);

            menu.add(item_2);


            item_3 = new JMenuItem("azul");

            item_3.addActionListener(this);

            menu.add(item_3);

        }

        public void actionPerformed(ActionEvent e){

            Container fondo = this.getContentPane();

            if (e.getSource() == item_1){

                fondo.setBackground(new Color(255,0,0));

            }else if(e.getSource() == item_2){

                fondo.setBackground(new Color(0,255,0));

            }else if (e.getSource() == item_3){

                fondo.setBackground(new Color(0,0,255));

            }
        }

        public static void main(String[] args) {

            menu c_1 = new menu();

            c_1.setBounds(0, 0, 600, 600);

            c_1.setLocationRelativeTo(null);

            c_1.setVisible(true);

            c_1.setResizable(false);


        }
}
