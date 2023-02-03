import java.util.Scanner;
import java.util.Random;
public class problem_03_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("How many interger>>");
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean isInArr[]=new boolean[101];
        for(int i=0;i<n;i++){
            do{
                arr[i]=1+rand.nextInt(99);
            }while(isInArr[arr[i]]);
            isInArr[arr[i]]=true;
            System.out.print(arr[i]+" ");
            if(i%10==9)System.out.println();
        }
    }
}
