/**
 * 打印出所有的’水仙花数’，所谓’水仙花数’是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个’水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方
 */
public class E3 {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;

            if(i== a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");
        int x = 100;
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    if( x == a*a*a+b*b*b+c*c*c) System.out.println(x);
                    x++;
                }
            }
        }
    }
}
