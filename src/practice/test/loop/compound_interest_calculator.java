package practice.test.loop;

public class compound_interest_calculator {
    public static void main(String[] args){
        int year=0;
        double initial_balance=100000;
        while(initial_balance<=200000){
            initial_balance=initial_balance*1.017;
            year++;
        }
        System.out.println("需要"+year+"年");
    }
}
