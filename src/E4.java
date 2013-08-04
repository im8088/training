/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 */
public class E4 {
    public static void main(String[] args) {
        int num = 90;
        String out = num +"=";

        int i=2;
        while (i<num+1)
        {
            if(num%i==0)
            {
                if(i==num) out += i;
                else out += i+"*";
                num = num/i;
                i = 2;
            }
            else {
                i++;
            }
        }

        System.out.println(out);
    }
}
