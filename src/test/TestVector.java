package test;

import java.util.Vector;

/**
 * Created by Administrator on 13-8-18.
 */
public class TestVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("hi");
        System.out.println(vector.get(1));
        System.out.println(vector.size());
        System.out.println();
        vector.trimToSize();

    }
}
