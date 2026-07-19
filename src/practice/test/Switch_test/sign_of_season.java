package practice.test.Switch_test;
import java.util.Scanner;
public class sign_of_season {
    public static void main(String[] args){
        int month;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month");
        month =sc.nextInt();
        switch(month){
            //case后面可以写多个值，用逗号隔开
            case 3,4,5:{
                System.out.println("spring");
                break;
            }
            case 6:
            case 7:
            case 8:{
                System.out.println("summer");
                break;
            }
            //->可以写在case后面,在大括号里面不用写break，但是冒号和->不能同时写
//            case 6,7,8->{
//                System.out.println("summer");
//            }
            case 9:
            case 10:
            case 11:{
                System.out.println("autumn");
                break;
            }
            case 12:
            case 1:
            case 2:{
                System.out.println("winter");
                break;
            }
            default:{
                System.out.println("invalid month");
                break;
            }
        }
    }
}
