import javax.swing.*;
import java.awt.event.*;
public class menu_submenu extends JFrame implements ActionListener {
    private JMenuBar bar;
        private JMenu menu_1 , menu_2 ;
            private JMenuItem item_1 , item_2 , item_3 ;

    public menu_submenu() {

        setLayout(null);

        bar = new JMenuBar();

        setJMenuBar(bar);


        menu_1 = new JMenu("opciones");

        bar.add(menu_1);


        menu_2 = new JMenu("tamaño de panatalla");

        menu_1.add(menu_2);


        item_1 = new JMenuItem("400*300");

        item_1.addActionListener(this);

        menu_2.add(item_1);


        item_2 = new JMenuItem("600*600");

        item_2.addActionListener(this);

        menu_2.add(item_2);


        item_3 = new JMenuItem("500*500 (tamaño pro defeto)");

        item_3.addActionListener(this);

        menu_2.add(item_3);

    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource() == item_1){

            setSize(400,300);

        }
        else if (e.getSource() == item_2){

            setSize(600,600);

        }
        else if (e.getSource() == item_3){

            setSize(500,500);

        }
    }

    public static void main(String[] args){

        menu_submenu m = new menu_submenu();

        m.setBounds(0,0,500,500);

        m.setLocationRelativeTo(null);

        m.setVisible(true);

        m.setResizable(false);

    }
}
