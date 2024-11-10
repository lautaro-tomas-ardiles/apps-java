import javax.swing.*;
    public class MANIPULACION_DE_TEXTO extends JFrame {
        private JLabel Label_1;
            private JLabel Label_2;

        public MANIPULACION_DE_TEXTO() {

            setLayout(null);

            Label_1 = new JLabel("soy un boludo");      //label_1 establece la pocicion , el tamaño y el texto

            Label_1.setBounds(850, 450, 90, 50);

                add(Label_1);

            Label_2 = new JLabel("1.2");    //label_2 establece la pocicion , el tamaño y el texto

            Label_2.setBounds(850,500,90,50);

                add(Label_2);

    }

        public static void main (String args[]){

            MANIPULACION_DE_TEXTO ventana_1 = new MANIPULACION_DE_TEXTO();

            ventana_1.setBounds(0,0,1920,1080);     // parametros de ventana como tamño , posicion etc

            ventana_1.setVisible(true);

            ventana_1.setLocationRelativeTo(null);

    }
}
