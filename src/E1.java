import java.lang.String;import java.lang.System;
/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问某个月的兔子总数为多少？
 * F[n] = 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ..
 *
 */
public class E1 {
    public static void main(String[] args) {
        int _m = 5;
        int _n = method(_m);
        System.out.println("The "+_m+" months has total of "+_n+" rabbits");
    }

    static int method(int m){

        if(m==1 || m==2) return 1;
        else{
            return method(m-1)+ method(m-2);
        }
    }

    static int pow(int num, int mi){
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
