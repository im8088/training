import java.util.regex.Pattern;

//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        String s = "sfA 23sffF F@252&)(*t42+&^%$GsfF";
        char [] c = s.toCharArray();
        int l = s.length();
        int c_n = 0;
        int s_n = 0;
        int d_n = 0;
        int o_n = 0;

        for (int i = 0; i < l ; i++) {
            if(c[i]>='A'&&c[i]<='Z' || c[i]>'a'&&c[i]<='z') c_n++;
            if(c[i]==32) s_n++;
            if(c[i]>='0'&&c[i]<='9') d_n++;
        }
        o_n = l - c_n - s_n - d_n;

        System.out.println(c_n+", "+s_n+", "+d_n+", "+o_n+", "+l);
    }
}
