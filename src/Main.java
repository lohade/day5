import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here



            System.out.println("enter numbers:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println("number is even ");

            } else {
                System.out.println("number is odd");
            }



    }
}
