import java.util.Scanner;
import java.lang.StringBuffer;
public class openchanllange_06_01 {
    static String readString(){
        StringBuffer sb=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        while(true){
            String line=sc.nextLine();
            if(line.length()==1&&line.charAt(0)==';')break;
            sb.append(line);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String lowerCase="abcdefghijklmnopqrstuvwxyz";
        String upperCase=lowerCase.toUpperCase();
        System.out.println("Enter english text, and enter semicolon");
        String target=readString();
        int[] arr=new int[26];
        for(int i=0;i<target.length();i++){
            for(int j=0;j<lowerCase.length();j++){
                if(target.charAt(i)==lowerCase.charAt(j))arr[j]++;
                if(target.charAt(i)==upperCase.charAt(j))arr[j]++;
            }
        }
        System.out.println("draw histogram");
        for(int i=0;i<upperCase.length();i++){
            System.out.print(upperCase.charAt(i));
            for(int j=0;j<arr[i];j++){
                System.out.print("-");
            }
            System.out.println();
        }
        
    }
}
