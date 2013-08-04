//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6 {
    public static void main(String[] args) {
        int m = 18;
        int n = 12;

        int max = m>n? m:n;
        int min = m>n? n:m;

        for (int i = min; i >0 ; i--) {
            if(m%i==0&&n%i==0){
                System.out.println(i);
                break;
            }
        }

        for (int j = 1; j < min ; j++) {
            if(max*j%n==0) {
                System.out.println(max*j);
                break;
            }
        }

    }
}
