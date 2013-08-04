/**
 * 判断101-200之间有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
 */
public class E2 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i=101;i<200;i++){
//            123
            boolean _i =true;
            for (int j = 2; j < i/2+1 ; j++) {
                if(i%j==0) {
                    _i = false;
                    break;
                }
            }

            if(_i){
                counter++;
                System.out.println(i);
            }

        }
        System.out.println(counter);
    }
}
