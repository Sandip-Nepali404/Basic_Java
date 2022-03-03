import java.awt.*;
import java.awt.event.*;
class Inclass  extends Frame implements ActionListener{
    TextField t1;
        Inclass(){
            t1 = new TextField();
            Button b1 = new Button("click");
            setLayout(new FlowLayout());
            setVisible(true);
            add(t1);
            add(b1);
            b1.addActionListener(this);

        }


    public void actionPerformed(ActionEvent e){
        t1.setText("Welcome");
    }

    public static void main(String [] args){
        new Inclass();
    }
}