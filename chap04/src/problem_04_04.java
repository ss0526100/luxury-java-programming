class Rectangle{
    int x,y,width,height;
    public Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public int square(){
        return width*height;
    }
    public void show(){
        System.out.println("At ("+x+","+y+") Rectangle size "+width+"x"+height);
    }
    public boolean contains(Rectangle r){
        if(this.x<r.x&&this.y<r.y&&r.x+r.width<this.x+this.width&&r.y+r.height<this.y+this.height)return true;
        else return false;        
    }
}
public class problem_04_04 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,2,8,7);
        Rectangle s=new Rectangle(5,5,6,6);
        Rectangle t=new Rectangle(1,1,10,10);

        r.show();
        System.out.println("area of s is "+s.square());
        if(t.contains(r))System.out.println("t contians r.");
        if(t.contains(s))System.out.println("t contians s.");
    }
}
