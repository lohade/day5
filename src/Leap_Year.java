import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year to checked for leap year:");
        int year=sc.nextInt();
        if(year>=1000 && year<10000)
        {
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("year is  leap year" );
            }
            else
            {
                System.out.println("year is not leap year");
            }

        }
        else
        {
            System.out.println("Enter valid year:");
        }
    }

}
