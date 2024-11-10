import javax.swing.*;
    public class text_line_scroll extends JFrame {
        private JTextField text_fild;
        private JScrollPane scroll;

        public text_line_scroll(){

            setLayout(null);

            text_fild = new JTextField();

            scroll = new JScrollPane(text_fild);

            scroll.setBounds(40,30,400,75);

            add(scroll);

        }

        public static void main(String[] args){

            text_line_scroll line_1 = new text_line_scroll();

            line_1.setBounds(0,0,500,500);

            line_1.setLocationRelativeTo(null);

            line_1.setVisible(true);





        }
}