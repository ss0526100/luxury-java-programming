import java.util.Scanner;
class Add{
    private int a,b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int calculate(){return a+b;};
}
class Sub{
    private int a,b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int calculate(){return a-b;};
}
class Mul{
    private int a,b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int calculate(){return a*b;};
}
class Div{
    private int a,b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int calculate(){return a/b;};
}
public class problem_04_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two integer and operator>>");
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                Add add=new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case '-':
                Sub sub=new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul=new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div=new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
        }
    }
}
