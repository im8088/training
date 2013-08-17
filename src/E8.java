import java.util.Scanner;

/**
 * 求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A（0～9）：");
        int i = scanner.nextInt();
        System.out.println("请输入计算的次数：");
        int t = scanner.nextInt();

        E8 test = new E8();
        System.out.println(test.method(i, t));
    }
    private int h;
    int method(int a, int t){
        h += getNum(a, t);
        t--;
        if(t!=0){
            return method(a, t);
        }
        else {
           return h;
        }
    }

    int getNum(int a, int t){
        int n = a;
        for (int i = 1; i < t; i++) {
            n += a*Math.pow(10, i);
        }
        return n;
    }
}
