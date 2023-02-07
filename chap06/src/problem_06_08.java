import java.util.Scanner;
public class problem_06_08 {
    static String spinStr(String target){
        return target.substring(1)+target.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the textline>>");
        String target=sc.nextLine();
        for(int i=0;i<target.length();i++){
            target=spinStr(target);
            System.out.println(target);
        }

    }
}
