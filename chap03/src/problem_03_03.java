import java.util.Scanner;
public class problem_03_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input integer>>");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
