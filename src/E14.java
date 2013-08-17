import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//输入某年某月某日，判断这一天是这一年的第几天？
public class E14 {
    public static void main(String[] args) {
        int y = 2013;
        int m = 12;
        int d = 31;

        Date star = new Date(y, 1, 1);
        Date date = new Date(y, m, d);
        int days = (int)((date.getTime() - star.getTime())/(1000*60*60*24))+1;

        /*GregorianCalendar star = new GregorianCalendar(y+1900, 1, 1);
        GregorianCalendar date = new GregorianCalendar(y+1900, m, d);
        double days = (date.getGregorianChange().getTime() - star.getGregorianChange().getTime())/(1000*60*60*24) +1;
*/

        System.out.println(days);
    }
}
