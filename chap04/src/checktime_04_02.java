public class checktime_04_02 {
    public static double getSum(double arr[]){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        double arr[]={0.1,0.2,0.3,0.4};
        System.out.println(getSum(arr));
    }
}
