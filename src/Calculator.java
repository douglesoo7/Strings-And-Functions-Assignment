import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        float a= sc.nextFloat(),b= sc.nextFloat();
        System.out.println("What do want to perform ?\n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide");
        int op=sc.nextInt();
        float res;
        switch (op){
            case 1:
                res=add(a,b);
                System.out.println(res);
                break;
            case 2:
                res=subtract(a,b);
                System.out.println(res);
                break;
            case 3:
                res=multiply(a,b);
                System.out.println(res);
                break;
            case 4:
                res=divide(a, b);
                System.out.println(res);
                break;
        }
    }

    private static float multiply(float a, float b) {
        return a*b;
    }

    private static float subtract(float a, float b) {
        return a-b;
    }

    private static float divide(float a, float b) {
        return a/b;
    }

    private static float add(float a, float b) {
        return a+b;
    }


}
