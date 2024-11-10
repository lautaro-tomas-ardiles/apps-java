import javax.swing.*;
    public class text_area_scroll extends JFrame {
        private JTextArea text_area;
        private JScrollPane scroll;

        public text_area_scroll() {

            setLayout(null);

            text_area = new JTextArea();

            scroll = new JScrollPane(text_area);

            scroll.setBounds(40,30,400,400);

            add(scroll);

        }

        public static void main(String[] args) {

            text_area_scroll area_1 = new text_area_scroll();

            area_1.setBounds(0,0,500,500);

            area_1.setLocationRelativeTo(null);

            area_1.setVisible(true);

        }
    }