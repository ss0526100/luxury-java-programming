abstract class PairMap{
    protected String keyArray [];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap{
    private int cnt=0;
    public Dictionary(int n){
        keyArray=new String[n];
        valueArray=new String[n];
    }
    @Override
    String get(String key) {
        for(int i=0;i<cnt;i++){
            if(keyArray[i].equals(key))return valueArray[i];
        }
        return null;
    }
    @Override
    void put(String key, String value) {
        for(int i=0;i<cnt;i++){
            if(keyArray[i].equals(key)){
                valueArray[i]=value;
                return;
            }
        }
        keyArray[cnt]=key;
        valueArray[cnt]=value;
        cnt++;        
    }
    @Override
    String delete(String key) {
        String result;
        for(int i=0;i<cnt;i++){
            if(keyArray[i].equals(key)){
                result=valueArray[i];
                for(int j=i;j<cnt-1;j++){
                    keyArray[i]=keyArray[i+1];
                    valueArray[i]=valueArray[i+1];
                }
                cnt--;
                return result;
            }
        }
        return null;
    }
    @Override
    int length() {
        return cnt;
    }
    void print(){
        System.out.println(cnt);
        for(int i=0;i<keyArray.length;i++){
            System.out.print(keyArray[i]+" ");
        }
        System.out.println();
        for(int i=0;i<valueArray.length;i++){
            System.out.print(valueArray[i]+" ");
        }
        System.out.println();
    }
}
public class pracitce_04_10 {
    public static void main(String[] args) {
        Dictionary dic=new Dictionary(10);
        dic.put("hwang","java");
        dic.put("lee","python");
        dic.put("lee","C++");
        System.out.println("lee's value is "+dic.get("lee"));
        System.out.println("hwang's value is "+dic.get("hwang"));
        dic.delete("hwang");
        System.out.println("hwang's value is "+dic.get("hwang"));
    }
}
