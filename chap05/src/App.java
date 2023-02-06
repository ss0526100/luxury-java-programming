class A{
    public void hello(){
        System.out.println("A");
    }
    void kill(){}
}
class B extends A{
    @Override
    public void hello(){
        System.out.println("B");
    }
}
interface cake{
    default void bbang(){System.out.println("cake");}
}
interface soboro{
    default void bbang(int a){System.out.println("soboro");}
}
class hehe implements cake, soboro{

}
public class App {
    public static void main(String[] args) throws Exception {
        A a0=new A();
        B b0=new B();
        A a1=new B();
        B b1=(B)a1;
        a0.hello();
        b0.hello();
        a1.hello();
        b1.hello();
    }
}
