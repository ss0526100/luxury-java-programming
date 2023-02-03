public class problem_03_13 {
    public static void main(String[] args) {
        int cnt;
        for(int i=1;i<100;i++){
            cnt=0;
            if((i%10)!=0&&(i%10)%3==0)cnt++;
            if(i>10&&(i/10)%3==0)cnt++;
            if(cnt>0) System.out.println(i+" clap"+" chap".repeat(cnt));
        }
    }
}
