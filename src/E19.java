//打印出如下图案（菱形）
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *
public class E19 {

    public static boolean isX(int r, int c){
        int g = 0;
        int t = (r+1)*2-1;
        g = (t<=n? t:(n-2*((r+1)-(n/2+1))));

        if(c<(n-g)/2||c>((n-g)/2+(g-1))) return false;
        else return true;
    }
    static int n = 17;
    public static void main(String[] args) {

        String c = "*";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(isX(i, j)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}
