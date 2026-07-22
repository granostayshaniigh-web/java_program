package practice.test.loop;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        for (int i=3;i<=n;i++){
            c=a;
            a=b;
            b=c+b;
        }
        if(n%2==0){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
