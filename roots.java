import java.util.Scanner;

public class roots{

    void root()throws InterruptedException{
       
        System.out.println("What is the you want to be square rooted?");

        Scanner n1 = new Scanner(System.in);
        double x = n1.nextDouble();
        
        double sum = Math.sqrt(x);
        int answer = (int)sum;

        Thread.sleep(1000);

        if((sum - (int)sum) > 0){
            System.out.println("Your answer is " + sum);
        }
        else{
            System.out.println("Your answer is " + answer);
        }


    }
}