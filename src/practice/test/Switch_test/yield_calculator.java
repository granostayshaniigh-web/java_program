package practice.test.Switch_test;

public class yield_calculator {
    public static void main(String[] args){
        int a=10;
        int b=20;
        String operator="-";
        int result= switch(operator){
            case "+" -> {
                int sum=a+b;
                yield sum;
            }
            //yield 返回一个值
            case "-" ->{
                yield a - b;
            }
            case "*" -> a*b;
            case "/" -> a/b;
            case "%" -> a%b;
            default ->  0;
        };
        //分号
        System.out.println(result);
    }
}
