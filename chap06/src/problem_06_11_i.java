import java.util.Scanner;

public class problem_06_11(i) {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(">>");
        StringBuffer target=new StringBuffer(sc.nextLine());
        String format;
        String from,to;
        boolean hasChanged;
        while(true){
            hasChanged=false;
            System.out.print("Command : ");
            format=sc.nextLine();
            if(format.equals("stop")){
                System.out.println("Exit");
                break;
            }
            if(format.split("!").length<2||format.split("!")[0].length()==0){
                System.out.println("Wrong command");
                continue;
            }
            from=format.split("!")[0];
            to=format.split("!")[1];
            System.out.println(from+" ");
            for(int i=0;i<target.length();i++){
                if(target.charAt(i)==from.charAt(0)){
                    for(int j=1;j<from.length()&&i+j<target.length();j++){
                        if(target.charAt(i+j)!=from.charAt(j))break;
                        if(j==from.length()-1){
                            target.replace(i, from.length(), to);
                            System.out.println(target);
                            hasChanged=true;
                            i=target.length();
                            break;
                        }
                    }
                }
            }
            if(!hasChanged)System.out.println("There is no "+from);
        }
    }
}
