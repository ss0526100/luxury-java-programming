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
class Won2Dollar extends Converter{
    String src="Won", dest="Dollar";
    public Won2Dollar(double ratio){
        this.ratio=ratio;
    }
    protected double convert(double src){return src/ratio;}
    protected String getSrcString(){return src;}
    protected String getDestString(){return dest;}
}
public class practice_04_03 {
    public static void main(String[] args) {
        Won2Dollar toDollar=new Won2Dollar(1200);
        toDollar.run();
    }
}
