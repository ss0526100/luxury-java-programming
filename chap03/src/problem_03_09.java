import java.util.Random;
public class problem_03_09 {
    public static void main(String[] args) {
       Random rand=new Random();
       int arr[][]=new int[4][4];
       for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            arr[i][j]=1+rand.nextInt(10);
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }
    }
}
