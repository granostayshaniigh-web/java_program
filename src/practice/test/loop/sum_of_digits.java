package practice.test.loop;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args){
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        num=sc.nextInt();
        int sum=0;
        if(num<0){
            num=-num;
        }
        int j=1;
        /*
        * 计算一个整数的各位数字的和
        * 输入：一个整数
        * 输出：该整数的各位数字的和
        * 方法：
        *循环目的：通过逐位提取数字的方式，累加计算一个整数的各位数字之和
        num % 10：取模运算，获取数字的最后一位（个位数）
        num / 10：整数除法，移除最后一位数字，使高位数字变成新的个位
        */
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("sum of digits is "+sum);
    }
}
