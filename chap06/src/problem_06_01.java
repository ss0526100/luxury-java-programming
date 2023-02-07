class MyPoint{
    int x,y;
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString() {
        return "Point("+this.x+","+this.y+")";
    }
    @Override
    public boolean equals(Object obj) {
        MyPoint target=(MyPoint)obj;
        if(this.x==target.x&&this.y==target.y)return true;
        else return false;
    }
}
public class problem_06_01 {
    public static void main(String[] args) {
        MyPoint p=new MyPoint(3, 50);
        MyPoint q=new MyPoint(3, 50);
        System.out.println(p);
        if(p.equals(q))System.out.println("same point");
        else System.out.println("different point");
    }
}
