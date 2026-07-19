package practice.test.choice_test;
import java.util.Scanner;
public class more_cheap_plan2 {
    public static void main(String[] args){
        double price;
        double price1=10000;
        double price2;
        Scanner s =new Scanner (System.in);
        price = s.nextDouble();
        if(price>=10&&price<50){
            price1=price-8;
        }
        else if(price>=50&&price<100){
            price1=price-30;
        }
        else if(price>=100&&price<200){
            price1=price-50;
        }
        else if(price>=200){
            price1=price-90;
        }
        price2=price*0.8;
        System.out.println(price1);
        System.out.println(price2);
    }
}
