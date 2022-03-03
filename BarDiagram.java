   import java.awt.*;
   class BarDiagram extends Frame{
       public void Bardiagram(){
           setSize(400,500);
           setVisible(true);
       }

       public void paint (Graphics g){
           g.setColor(Color.blue);
           g.fillRect(50,100,80,40);
       }
       public static void main(String [] args){
           new BarDiagram();
       }
   }