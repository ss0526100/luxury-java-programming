public class problem_03_12 {
    public static void main(String[] args) {
        double sum=0;
        int cnt=0;
        for(int i=0;i<args.length;i++){
            try{
                sum+=Integer.parseInt(args[i]);
                cnt++;
            }
            catch(NumberFormatException e){}
        }
        System.out.println(sum/cnt);
    }
}
