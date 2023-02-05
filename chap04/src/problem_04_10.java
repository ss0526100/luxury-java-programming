import java.util.Scanner;
class EnglishNumber{
    private static String[] english={"one","two","three","four","five"};
    private static String[] number={"1","2","3","4","5"};
    public static String english2Number(String word){
        for(int i=0;i<english.length;i++){
            if(english[i].equals(word))return number[i];
        }
        return "";
    }
}
public class problem_04_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String tmp;
        System.out.println("English to Number search program.");
        while(true){
            System.out.print("English?");
            tmp=sc.next();
            if(tmp.equals("stop"))break;
            if(EnglishNumber.english2Number(tmp).equals(""))System.out.println(tmp+" doesn't exist");
            else System.out.println(tmp+" is "+EnglishNumber.english2Number(tmp));
        }
    }
}
