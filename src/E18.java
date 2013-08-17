//两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
// 已抽签决定比赛名单。有人向队员打听比赛的名单。
// a说他不和x比，
// c说他不和x,z比，
// 请编程序找出三队赛手的名单。
// c-y a-z b-x
public class E18 {
    public static void main(String[] args) {
        String[] d1 = {"a", "b", "c"};
        String[] d2 = {"x", "y", "z"};

        for (int i = 0; i <d1.length ; i++) {
            for (int j = 0; j <d2.length ; j++) {
                if((d1[i]=="a"&&d2[j]=="x")||(d1[i]=="c"&&d2[j]=="x")||(d1[i]=="c"&&d2[j]=="z")) continue;
                System.out.println(d1[i]+" vs "+d2[j]);
            }
        }
    }
}
