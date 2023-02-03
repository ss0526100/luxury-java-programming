import java.util.Random;
public class problem_03_10 {
    public static void main(String[] args) {
       Random rand=new Random();
       int arr[][]=new int[4][4];
       int tmpR,tmpC;
       for(int i=0;i<10;i++){
        do{
            tmpR=rand.nextInt(4);
            tmpC=rand.nextInt(4);
        }while(arr[tmpR][tmpC]!=0);
        arr[tmpR][tmpC]=1+rand.nextInt(10);
       }
       for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            System.out.print(arr[i][j]+"  ");
        }
        System.out.println();
       }
    }
}
