import java.util.Scanner;

public class Power_Of_2 {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=(int)Math.pow(2,n);
        for(int a=1;a<=number;a++){
            int power_of_2=(int)Math.pow(a,2);
            if(power_of_2<=number){
                System.out.println(+power_of_2);
            }


        }

    }

}
