import java.util.Scanner;

public class Vowels_Consonant {
    public static void main(String[] args){
        System.out.println("enter character:");
        Scanner sc=new Scanner(System.in);
        char alphabet=sc.next().charAt(0);
        if(alphabet=='a' || alphabet=='i' || alphabet=='o' ||alphabet=='e' || alphabet=='u')
        {
            System.out.println("alphabet is vowels");
        }
        else
        {
            System.out.println("alphabet is consonant");
        }

    }

}
