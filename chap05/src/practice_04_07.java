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
class Point3D extends Point{
    int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }
    public int getZ() {
        return z;
    }
    public void moveUp(){z++;}
    public void moveDown(){z--;}
    public void move(int x,int y, int z){
        move(x,y);
        this.z=z;
    }
    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+") point";
    }
}
public class practice_04_07 {
    public static void main(String[] args) {
        Point3D p=new Point3D(1,2,3);
        System.out.println("It is "+p.toString());
        
        p.moveUp();
        System.out.println("It is "+p.toString());

        p.moveDown();
        p.move(10,10);
        System.out.println("It is "+p.toString());
        
        p.move(100,200,300);
        System.out.println("It is "+p.toString());
    }
}
