package practice.test.loop;
import java.util.Scanner;
import java.util.Random;
public class guess_number {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc=new Scanner(System.in);
        int num=r.nextInt(100)+1;
        System.out.println(num);
        int count=0;
        while (true) {
            System.out.println("guess a number between 1 and 100");
            int guess_num=sc.nextInt();
            if(guess_num>num){
                System.out.println("guess_num is too big");
                count++;
                if(count==3){
                    System.out.println("the right number in"+(num-5)+"to"+(num+5));
                }else if(count==5){
                    System.out.println("ok,the right number is"+num);
                }
            }else if(guess_num<num){
                System.out.println("guess_num is too small");
                count++;
                if(count==3){
                    System.out.println("the right number in"+(num-5)+"to"+(num+5));
                }else if(count==5){
                    System.out.println("ok,the right number is"+num);
                    break;
                }
            }else{
                System.out.println("guess_num is ok");
                break;
            }
        }


    }
}
