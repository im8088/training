import java.util.Random;

/**
 * Created by Administrator on 13-8-10.
 */
public class testRandom {

    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10000; i++) {
            System.out.println(rnd.nextInt(20)+1);
        }
//
//        for (int i = 0; i < 10000; i++) {
//            int x = (int)(Math.random()*20+1);
//            System.out.println(x);
//        }
    }
}
