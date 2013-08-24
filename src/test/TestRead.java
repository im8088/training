package test;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by Administrator on 13-8-24.
 * 中文
 */
public class TestRead {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("src/test/TestRead.java");
            int i;
            while((i = reader.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
