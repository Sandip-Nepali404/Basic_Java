import java.awt.*;
import java.awt.event.*;
class Example extends Frame{
         TextField t1;
        Example(){
            t1 = new TextField();
            Button b1 = new Button("click");
            setLayout(new FlowLayout());
            setVisible(true);
            add(t1);
            add(b1);
            Outer o = new Outer(this);
            b1.addActionListener(o);

        }
}

class Outer implements ActionListener{
    Example obj;
    Outer(Example obj){
    this.obj = obj;
    }   

    public void actionPerformed(ActionEvent e){
        obj.t1.setText("Welcome");
    }
}

class Check {
    public static void main(String [] args){
        new Example();
    }
}