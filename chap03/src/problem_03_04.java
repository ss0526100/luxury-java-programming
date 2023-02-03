import java.util.Scanner;
public class problem_03_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input lower case>>");
        char c=sc.next().charAt(0);
        for(char i='a';i<=c;i++){
            for(char j='a';j<='a'+c-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
