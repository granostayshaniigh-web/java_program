package practice.test.choice_test;
import java.util.Scanner;
public class if_test {
    public static void main(String[] args){
        int blood=200;
        Scanner sc=new Scanner(System.in);
        System.out.println("伤害值：");
        int x=sc.nextInt();
        System.out.println("恢复值");
        int y=sc.nextInt();
        blood =blood - x;
        if(blood<0){
            blood=1;
        }
        blood = blood + y;
        if(blood>200){
            blood=200;
        }
        System.out.println("当前血量："+blood);

    }
}
