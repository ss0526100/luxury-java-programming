import java.util.Scanner;
interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}
class StringStack implements Stack{
    private String stack[];
    private int cnt=0;
    public StringStack(int capacity){
        stack=new String[capacity];
    }
    public int length(){
        return cnt;
    }
    public int capacity(){
        return stack.length;
    }
    public boolean push(String val){
        if(cnt==stack.length)return false;
        stack[cnt++]=val;
        return true;
    }
    public int getCnt() {
        return cnt;
    }
    public String pop(){
        if(cnt==0)return "";
        return stack[--cnt];
    }
}
public class practice_04_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter stack storage >>");
        int a=sc.nextInt();
        StringStack strStack=new StringStack(a);
        String str;
        while(true){
            System.out.print("Enter String>>");
            str=sc.next();
            if(str.equals("stop")){
                System.out.print("Saved string in the stack pop : ");
                while(strStack.getCnt()!=0){
                    System.out.print(strStack.pop()+" ");
                }
                break;
            }
            if(!strStack.push(str))System.out.println("Can't push because stack is full!");
        }
    }
}
