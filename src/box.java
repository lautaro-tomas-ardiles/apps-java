import javax.swing.*;
import java.awt.event.*;
public class box extends JFrame implements ItemListener{
      private JComboBox box_1;

      public box(){

          setLayout(null);

          box_1 = new JComboBox();

          box_1.setBounds(10,10,80,20);

          add(box_1);


          box_1.addItem("rojo");

          box_1.addItem("verde");

          box_1.addItem("azul");

          box_1.addItem("amarillo");

          box_1.addItem("negro");

          box_1.addItemListener(this);
 }

        public void itemStateChanged(ItemEvent e){

          if(e.getSource() == box_1){

              String seleccion = box_1.getSelectedItem().toString();

              setTitle(seleccion);

  }
 }

 public static void main(String args[]){
  box box_1 = new box();

  box_1.setBounds(0,0,500,500);

  box_1.setVisible(true);

  box_1.setResizable(false);

  box_1.setLocationRelativeTo(null);

      }
}