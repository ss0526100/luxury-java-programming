import java.util.Random;
import java.util.Random;
public class problem_03_07 {
    public static void main(String[] args) {
        Random rand=new Random();
        int arr[]=new int[10];
        double sum=0;
        System.out.print("Random integer>>");
        for(int i=0;i<10;i++){
            arr[i]=1+rand.nextInt(10);
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Average is "+sum/10);
    }
}
