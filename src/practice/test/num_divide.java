package practice.test;
import java.util.Scanner;
public class num_divide {
    public static void main (String[] args){
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int seconds =sc.nextInt();
        int hours=seconds/3600;
        int minutes=seconds%3600/60;
        int second=seconds%3600%60;
        System.out.println("小时:"+hours);
        System.out.println("分钟:"+minutes);
        System.out.println("秒:"+second);
    }
}
