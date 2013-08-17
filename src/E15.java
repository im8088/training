//输入三个整数x,y,z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int z = -2;

        if(x>y){
            int t = y;
            y = x;
            x = t;
        }

        if(x>z){
            int t = z;
            z = x;
            x = t;
        }

        System.out.println(x+", "+Math.min(y,z)+", "+Math.max(y, z));

    }
}
