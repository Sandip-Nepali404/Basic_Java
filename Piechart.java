import java.awt.*;
class Piechart extends Frame{
    int [] data={50,15,10};
    Color [] color={Color.blue,Color.red,Color.pink};

    public Piechart(){
        setSize(400,500);
        setVisible(true);
    }

    public int getSum(){
        int sum=0;
        for(int value:data){
            sum = sum+value;
        }
        return sum;
    }


    public int [] getAngles(int sum){
        int [] angles = new int [data.length];
        int i;
        for(i=0; i<data.length; i++){
            angles[i] = (int)(360*data[i]/sum);

        }

        return angles;

    }

    public void paint(Graphics g){
        int sum =  this.getSum();
        int [] angles = this.getAngles(sum);
        int startAngle = 0;
        for(int i=0; i<angles.length; i++){
            g.setColor(color[i]);
            g.fillArc(50,100,80,80,startAngle,angles[i]);
            startAngle = startAngle + angles[i]; 

        }
    }

    public static void main(String [] args){
        new Piechart();
    }
}