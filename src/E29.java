//题目：求一个n*n矩阵对角线元素之和
public class E29 {
    public static void main(String[] args) {
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
