import javax.swing.*;
public class ventana extends JFrame {
    private JLabel Label_1;

    public ventana() {

        setLayout(null);

        Label_1 = new JLabel("soy un boludo");

        Label_1.setBounds(850, 450, 90, 50);

        add(Label_1);

    }

    public static void main (String args[]){

        ventana ventana_1 = new ventana();

        ventana_1.setBounds(0,0,1920,1080);

        ventana_1.setVisible(true);

        ventana_1.setLocationRelativeTo(null);



    }
}