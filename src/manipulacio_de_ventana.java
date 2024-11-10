import  javax.swing.*;
public class manipulacio_de_ventana extends JFrame {

    public manipulacio_de_ventana() {

        setLayout(null);

    }

    public static void main (String args[]){

        manipulacio_de_ventana ventana_1 = new manipulacio_de_ventana();

        ventana_1.setBounds(0,0,500,500);

        ventana_1.setVisible(true);



    }
}