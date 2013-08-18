package test;

/**
 * Created by Administrator on 13-8-18.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "Hello 世界！！";
        char[] c = new char[2];
        s.getChars(6, 8, c, 0);

        for (char c1 : c) {
            System.out.println(c1);
        }

        for (int i = 0; i < c.length; i++) {
            char c1 = c[i];

        }

        String s1 = new String(c);
        System.out.println(s1);

        String s2 = new String();
        System.out.println(s2.isEmpty());

        System.out.println(s.codePointBefore(1));

        String s3 = "hi";
        String s4 = new String("hi");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println("\u0098");
    }

}
