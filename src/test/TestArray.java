package test;

/**
 * Created by Administrator on 13-8-18.
 */
public class TestArray {
    public static void main(String[] args) {

        int ln = 10;
        int[] a = new int[ln];

        for (int i = 0; i < ln; i++) {
            a[i] = i*i;
        }
        System.out.println(a);

        Object o = 10;

        log("【程序29】题目：求一个3*3矩阵对角线元素之和");
        int n = 4;
        int[][] matrix = new int[n][n];
        log("------------------创建N*N矩阵");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i+j;
                System.out.print(matrix[i][j] + ", ");
            }
            log("");
        }
        log("------------------");
        int r = 0;//从第一行开始计算
        int h0 =0;//和
        for (int i = 0; i < n; i++) {
            h0 += matrix[r][r];
            r++;
        }
        log("反斜线对角之和："+h0);
        r = n-1;//从最下面一行开始计算
        int hn =0;//和
        for (int j = 0; j < n; j++) {
            hn += matrix[r][j];
            r--;
        }
        log("正斜线对角之和："+hn);
        log("矩阵对角线元素总和："+(h0+hn));
    }

    public static void log(Object s){
        System.out.println(s);
    }
}
