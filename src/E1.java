import java.lang.String;import java.lang.System;
/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class E1 {
    public static void main(String[] args) {
        int _m = 36;
        int _n = getTuziBy(_m);
        System.out.println("The "+_m+" months has total of "+_n+" rabbits");
    }

    public static int getTuziBy(int m){
        int rabbits = 2;
        int _n = pow(rabbits, (m/3));
        return _n;
    }

    private static int pow(int num, int mi){
        int _m = 0;
        int _n = num;
        while (_m<mi)
        {
            _n = _n*num;
            _m++;
        }
        return _n;
    }
}
