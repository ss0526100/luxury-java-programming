import java.util.ArrayList;

public class practiceproblem_07_08 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>(10);
        a.add("Java");
        a.add(0,"c++");
        System.out.println(a.size());
        System.out.println(a.remove(a.size()-1));
    }
}
