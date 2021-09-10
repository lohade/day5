import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args){
        System.out.println("enter three numbers:");
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        if(number1>number2 && number1>number3)
        {
            System.out.println(number1 + ":is largest");
        }
        else if(number2>number1 && number2>number3)
        {
            System.out.println(number2 + ":is largest");
        }
        else
        {
            System.out.println(number3 + ":is largest");

        }

    }

}
