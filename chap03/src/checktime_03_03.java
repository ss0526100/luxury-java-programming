public class checktime_03_03 {
    public static void main(String[] args){
        int tenArray[]=new int[10];
        int sum=0;
        for(int i=0;i<tenArray.length;i++){
            tenArray[i]=i+1;
            sum+=i+1;
        }
        System.out.println(sum);
    }
}
