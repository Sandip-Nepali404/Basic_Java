import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
class  TextChange extends Frame implements ActionListener{
    TextField t1;
        TextChange(){
            t1 = new TextField();
            Button b1 = new Button("click");
            setLayout(new FlowLayout());
            setVisible(true);
            add(t1);
            add(b1);
            b1.addActionListener(this);

        }


    public void actionPerformed(ActionEvent e){
        t1.getText();
        setFont(new Font("Arial", Font.BOLD, 20));
        t1.setColor(Color.BLUE);
        t1.setBackground(Color.GREEN);

    }

    public static void main(String [] args){
        new TextChange();
    }
}