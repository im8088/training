/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 */
// 1    4   10  22  46  94  ..N(x) = (N（x-1)+1)*2
public class E17 {
    public static void main(String[] args) {
        int t = 10;//天
        //递归方法
        System.out.println(compute(t));

        //循环方法
        int n = 1;
        for (int i = 1; i < t; i++) {
            n = (n+1)*2;
        }
        System.out.println(n);
    }
    public static int compute(int t){
        if (t!=1) {
            return (compute(t-1)+1)*2;
        } else {
            return 1;
        }
    }
}
