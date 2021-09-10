import java.util.Scanner;

public class Head_Tails_Percentages {
    public static void main(String[] args){
        System.out.println("enter numbers for flip coin:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double tails_cnt=0,heads_cnt=0;
        double tails_percentages,heads_percentage;
        for (int x=1;x<=num;x++) {
            double a = (Math.random());
            if (a <= 0.5) {
                tails_cnt++;
            } else {
                heads_cnt++;
            }
        }
        tails_percentages=(tails_cnt * 100) /num;
        heads_percentage=(heads_cnt* 100) / num;

        System.out.println("tails_percentages:" +tails_percentages);
        System.out.println("heads_percentages:" +heads_percentage);

    }

}
