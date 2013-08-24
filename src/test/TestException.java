package test;

/**
 * Created by Administrator on 13-8-24.
 */
public class TestException {
    public static  void  mb_createException(){
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void mb_method(){
        try{
            mb_createException();
            System.out.println("a");
        }
        catch (ArithmeticException e){
            System.out.println("b");
        }
        finally {
            System.out.println("c");
        }

    }
    public static void main(String[] args) {
        try{
            mb_method();
        }
        catch (Exception e){
            System.out.println("m");
        }
        System.out.println("n");
    }
}
