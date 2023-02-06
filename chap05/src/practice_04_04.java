import java.util.Scanner;
abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Change "+getSrcString()+" to "+getDestString());
        System.out.print("Enter "+getSrcString()+">>");
        double val=sc.nextDouble();
        double res=convert(val);
        System.out.println("Result : "+res+getDestString());
        sc.close();
    }
}
class Km2Mile extends Converter{
    String src="Km", dest="Mile";
    public Km2Mile(double ratio){
        this.ratio=ratio;
    }
    protected double convert(double src){return src/ratio;}
    protected String getSrcString(){return src;}
    protected String getDestString(){return dest;}
}
public class practice_04_04 {
    public static void main(String[] args) {
        Km2Mile toMile=new Km2Mile(1.6);
        toMile.run();
    }
}
