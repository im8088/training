import java.util.Scanner;

//企业发放的奖金根据利润提成。利润(I)
// 低于或等于10万元时，奖金可提10%；
// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
// 20万到40万之间时，高于20万元的部分，可提成5%；
// 40万到60万之间时高于40万元的部分，可提成3%；
// 60万到100万之间时，高于60万元的部分，可提成1.5%，
// 高于100万元时，超过100万元的部分按1%提成，
// 从键盘输入当月利润I，求应发放奖金总数？
public class E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当月利润（万）：");
        double i = scanner.nextDouble();
        double h = 0.0;
        if(i>100) {
            h += (i-100)*.01;
            i = 100;
        }
        if(i>60 && i<=100){
            h +=(i-60)*.015;
            i = 60;
        }
        if(i>40 && i<=60){
            h +=(i-40)*.03;
            i = 40;
        }
        if(i>20 && i<=40){
            h +=(i-20)*.05;
            i = 20;
        }
        if(i>10 && i<=20){
            h +=(i-10)*.075;
            i = 10;
        }
        if(i<=10){
            h +=i*.1;
        }
        System.out.println("应发放奖金总数为："+h+"万");
    }
}
