import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("enter numbers:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int temp;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        temp = number2;
        number2 = number1;
        number1 = temp;
        System.out.println("after swappping number1:" + number1);
        System.out.println("number2:" + number2);
    }

}
