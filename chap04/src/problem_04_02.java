import java.util.Scanner;
class Grade{
    int math;
    int science;
    int english;
    public Grade(int math, int science, int english){
        this.math=math;
        this.science=science;
        this.english=english;
    }
    public int average(){
        return (math+science+english)/3;
    }
}
public class problem_04_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 3 score in order of Math, Science, and English>>");
        int math=sc.nextInt();
        int science=sc.nextInt();
        int english=sc.nextInt();

        Grade me=new Grade(math,science,english);
        System.out.println("average is "+me.average());
        sc.close();
    }
}
