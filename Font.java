import java.awt.*;
import java.awt.event.*;
class Font extends Frame implements ActionListener{
    TextField t1;
    Font(){
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
        setFont(new Font("arial",Font.BOLD,15));
        t1.setBackground(Color.red);


    }

    public static void main(String [] args){
        new Font();
    }
}