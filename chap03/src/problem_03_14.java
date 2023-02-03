import java.util.Scanner;
public class problem_03_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String course [] ={"Java","C++","HTML5","Structure of Computer","Android"};
        int score[]={95,88,76,62,55};
        String tmp;
        while(true){
            System.out.print("Subject name>>");
            tmp=sc.nextLine();
            if(tmp.equals("stop"))break;
            for(int i=0;i<course.length;i++){
                if(course[i].equals(tmp)){
                    System.out.println("score of "+course[i]+" is "+score[i]);
                    break;
                }
                if(i==course.length-1)System.out.println("That is not exist subject");
            }
        }
    }
}
