class Circle{
    int x,y,radius;
    public Circle(int x, int y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public String toString() {
        return "Circle("+x+","+y+") radius"+radius;
    }
    @Override
    public boolean equals(Object obj) {
        Circle target=(Circle)obj;
        if(this.x==target.x&&this.y==target.y)return true;
        else return false;
    }
}
public class problem_06_02 {
    public static void main(String[] args) {
        Circle a=new Circle(2,3,5);
        Circle b=new Circle(2,3,30);
        System.out.println("Circle a : "+a);
        System.out.println("Circle b : "+b);
        if(a.equals(b))System.out.println("same circle");
        else System.out.println("same circle");
    }
}
