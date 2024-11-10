import javax.swing.*;
import java.awt.event.*;
    public class change_from_line_to_area extends  JFrame implements ActionListener {
        private JButton boton_1;
            private JTextField text_1;
                private JTextArea text_area;
                    private JScrollPane scroll , scroll_1;
                        String text ="";

            public change_from_line_to_area (){

                setLayout(null);

                boton_1 = new JButton("cambiar");

                boton_1.setBounds(200, 0, 100, 30);

                add(boton_1);

                boton_1.addActionListener(this);


                text_1 = new JTextField();

                scroll = new JScrollPane(text_1);

                scroll.setBounds(10,0,150,45);

                add(scroll);


                text_area = new JTextArea();

                scroll_1 = new JScrollPane(text_area);

                scroll_1.setBounds(10,50,400,400);

                add(scroll_1);



            }

            public void actionPerformed(ActionEvent event) {

                if (event.getSource() == boton_1) {

                    text += text_1.getText() + "\n" ;

                    text_1.setText("");

                    text_area.setText(text);

                }
            }
            public static void main(String[] args) {

            change_from_line_to_area _1_ = new change_from_line_to_area();

            _1_.setBounds(0, 0, 500, 500);

            _1_.setVisible(true);

            _1_.setLocationRelativeTo(null);

        }
    }