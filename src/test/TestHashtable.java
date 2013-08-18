package test;

import java.util.Hashtable;

/**
 * Created by Administrator on 13-8-18.
 */
public class TestHashtable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("a", 11);
        hashtable.put("b", 22);
        System.out.println(hashtable.get("b"));
        System.out.println(hashtable.size());
    }
}
