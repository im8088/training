/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class E10 {
    public static void main(String[] args) {
        int h = 100;
        int t = 3;

        double l =0.0;
        double _h = h;//弹起高度
        double _d = h;//下落高度
        for (int i = 0; i < t; i++) {
            _d = _h;
            if (i == 0) {
                l =_d;
            } else {
                l+=_d+_h;
            }
            _h /= 2;
        }
        System.out.println("第"+t+"次落地时，共经过"+l+"米, 第"+t+"次反弹高度为"+_h+"米");
                
        
    }
}
