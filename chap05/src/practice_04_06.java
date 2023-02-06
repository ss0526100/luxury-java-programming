class Point{
    private int x,y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    protected void move(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class ColorPoint extends Point{
    String color;
    public ColorPoint(){
        super(0, 0);
        this.color="black";
    }
    public ColorPoint(int x,int y){
        super(x,y);
        this.color="black";
    }
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return color+" color ("+getX()+","+getY()+") point";
    }
    public void setXY(int x, int y){
        super.move(x,y);
    }
}
public class practice_04_06 {
    public static void main(String[] args) {
        ColorPoint zeroPoint=new ColorPoint();
        System.out.println("It is "+zeroPoint.toString());

        ColorPoint cp=new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("Red");
        System.out.println("It is "+cp.toString());        
    }
}
