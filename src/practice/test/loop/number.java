package practice.test.loop;
import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        System.out.println("Enter a number");
        int j=sc.nextInt();
        int n=0;
        for(int k=i;k<=j;k++){
            if(k%3==0&&k%5==0){
                System.out.println(k);
                n++;
            }
        }
        System.out.println("个数为"+n);
    }
}
