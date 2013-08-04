import java.lang.String;import java.lang.System; /**
 * Created by Administrator on 13-8-4.
 */
public class Tuzi {
    public static void main(String[] args) {
        int _m = 36;
        int _n = getTuziBy(_m);
        System.out.println("The "+_m+" months has total of "+_n+" rabbits");
    }

    public static int getTuziBy(int m){
        int tuzi = 2;
        int _n = pow(tuzi, (m/3));
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
