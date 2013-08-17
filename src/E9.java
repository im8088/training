/**
 * 一个数如果恰好等于它的因子之和，这个数就称为’完数’。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 */
public class E9 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(isWS(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isWS(int i){
        int _i = i;
        for (int j = 1; j <= ((int)(i/2)+1) ; j++) {
            if(i%j==0) {
                _i -= j;
                if(_i==0) return true;
                else continue;
            }
        }
        return false;
    }

}
