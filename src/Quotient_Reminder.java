import java.util.Scanner;

public class Quotient_Reminder {


        public static void main(String[] args){
            System.out.println("enter numbers:");
            Scanner sc=new Scanner(System.in);

            int dividend= sc.nextInt();
            int divisor= sc.nextInt();
            int quotient=  dividend/divisor;
            int reminder= (dividend%divisor);
            System.out.println("Quotient is:" +quotient );
            System.out.println("reminder is:" +reminder );

        }
}
