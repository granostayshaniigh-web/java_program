package practice.test;

import java.util.Scanner;

public class a_little_example {
    public static void main (String[] args){
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a");
        a=sc.nextDouble();
        System.out.println("Enter the second number b");
        b=sc.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
