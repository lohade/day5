import java.util.Scanner;

public class Prime_Factors {
    public static void main(String[] args){
        System.out.println("enter number for prime factors:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        while(number%2==0){
            System.out.println(2 +" ");
            number/=2;

        }
        for(int i=3;i*i<=number;i++){
            while(number%i==0){
                System.out.println(i + " " );
                number/=i;
            }
        }
        if(number>2)
            System.out.println(number);
    }
}
