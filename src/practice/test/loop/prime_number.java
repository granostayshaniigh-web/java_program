package practice.test.loop;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=true;

        //另解：判断一个整数是否为质数的另一种方法是，从2开始枚举，到这个整数的平方根判断Math.sqrt(num)

        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
