import java.util.Scanner;
public class problem_03_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input 10 integer>>");
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("multiple of 3 is "); 
        for(int i=0;i<10;i++){
            if(arr[i]%3==0)System.out.print(arr[i]+" ");
        }
    }
}
