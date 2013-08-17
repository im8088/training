//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
public class E13 {
    public static void main(String[] args) {

        int i =0;
        while (true)
        {
            i++;
            if(isQS(i + 100) && isQS(i + 100 + 168)){
                System.out.println(i);
            }
        }
    }

    public static boolean isQS(int n){
        if (Math.sqrt(n)%1==0) {
            return true;
        } else {
            return false;
        }
    }
}
