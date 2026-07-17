package practice.test;

import java.util.Scanner;

public class type_boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hight1=sc.nextDouble();
        double hight2=sc.nextDouble();
        boolean result=hight1>=hight2;
        System.out.println(result);
        System.out.println(hight1>=hight2);
    }
}
