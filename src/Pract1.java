import java.util.Scanner;

public class Pract1 {
    public static void main(String[] args){
        System.out.println("enter number for harmonic:");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        float harmonic_mean=1;
        if(number>0){
            for(int i=2;i<=number;i++)
            {
                harmonic_mean+=(float)1/i;
            }
            System.out.println("Harmonic_mean" +harmonic_mean);
        }
    }

}
