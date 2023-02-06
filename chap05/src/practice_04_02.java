class TV{
    private int size;
    public TV(int size){this.size=size;}
    protected int getSize(){return size;}
}
class ColorTV extends TV{
    private int color;
    public ColorTV(int size, int color){
        super(size);
        this.color=color;
    }
    public void printProperty(){
        System.out.println(getSize()+"inch "+color+" color");
    }
    protected int getColor() {return color;}
}
class IPTV extends ColorTV{
    String ip;
    public IPTV(String ip,int size, int color){
        super(size, color);
        this.ip=ip;
    }
    public void printProperty(){
        System.out.println("my IPTV is "+getSize()+" inch "+getColor()+" color at "+ip);
    }
}
public class practice_04_02 {
    public static void main(String[] args) {
        IPTV iptv=new IPTV("192.1.1.2",32,1024);
        iptv.printProperty();
    }
}
