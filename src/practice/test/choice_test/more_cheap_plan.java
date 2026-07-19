package practice.test.choice_test;
import java.util.Scanner;
public class more_cheap_plan {
    public static void main(String[] args) {
        double price;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the price");
        price=sc.nextDouble();
        double price1;
        double price2;
        price1=price*0.9;
        if(price>=30){
            price2=price-10;
        }else{
            price2=price;
        }
        System.out.println(price1);
        System.out.println(price2);
        if(price1>price2){
            System.out.println("the more cheap plan is the 2nd");
        }else{
            System.out.println("the more cheap plan is the 1st");
        }
    }
}
