import java.awt.*;
import java.awt.event.*;
class AddSum extends Frame implements ActionListener{
    TextField t1,t2,t3;
    Button sum,sub;
    AddSum(){
        t1 = new TextField();
        t1.setBounds(200,50,150,30);
        add(t1);
        t2 = new TextField();
        t2.setBounds(200,90,150,30);
        add(t2);
        t3 = new TextField();
        t3.setBounds(200,120,150,30);
        add(t3);
        sum = new Button("sum");
        sum.setBounds(90,190,100,30);
        sub = new Button("sub");
        sub.setBounds(90,210,100,30);
        add(sum);
        add(sub);
        setVisible(true);
        setLayout(null);
        setSize(400,500);
        sum.addActionListener(this);
        sub.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if(e.getSource() == sum){
            int c = a+b;
            t3.setText(String.valueOf(c));
        }else{
            int d = a-b;
            t3.setText(String.valueOf(d));
        }
    }
    public static void main(String [] args){
        new AddSum();
    }
}