package practice.test.choice_test;

import java.util.Scanner;

public class form_a_triangle {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextDouble();
        System.out.println("Enter the second number");
        b=sc.nextDouble();
        System.out.println("Enter the third number");
        c=sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("The triangle is a solution");
            //在if中条件会有重叠，小范围的条件要写在大范围的条件之前
            if(a==b&&b==c) System.out.println("等边三角形");
            else if(a==b||a==c||b==c) System.out.println("等腰三角形");
            else if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) System.out.println("直角三角形");
            else System.out.println("普通三角形");
        }else{
            System.out.println("The triangle is not a solution");
        }
    }
}
