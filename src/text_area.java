import javax.swing.*;
    public class text_area extends JFrame{
        private JTextField text_1;
            private JTextArea text_area_1;

    public text_area(){

        setLayout(null);

        text_1 = new JTextField();

        text_1.setBounds(30,10,200,30);

        add(text_1);


        text_area_1 = new JTextArea();

        text_area_1.setBounds(30,50,400,100);

        add(text_area_1);
    }

    public static void main(String[] args){

        text_area area_1 = new text_area();

        area_1.setBounds(0,0,500,500);

        area_1.setVisible(true);

        area_1.setLocationRelativeTo(null);

        area_1.setResizable(false); // esto hace que no pueda modificar el tamanio de la ventana



    }
}
