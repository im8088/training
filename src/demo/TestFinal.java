package demo;

/**
 * Created by Administrator on 13-8-11.
 */
public class TestFinal {
    public TestFinal() {
    }

    final static public int xx = 11;
    final  void  m(){

    }
}

class Test extends TestFinal{

    int xx = 2;
    public static void main(String[] args) {
        TestFinal t = new TestFinal();

        System.out.println(t.xx);
    }

}
