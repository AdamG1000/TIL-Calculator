import java.util.Scanner;

public class division{

    void dividing()throws InterruptedException{
      
        System.out.println("What is the first number");

        Scanner n1 = new Scanner(System.in);
        double x = n1.nextDouble();
        Thread.sleep(100);
        
        System.out.println("what is your second number");

        Scanner n2 = new Scanner(System.in);
        double y = n1.nextDouble(); 
        
        double sum = x / y;
        int answer =(int)sum;
        
        Thread.sleep(1000);

        if((sum - (int)sum) > 0){

            System.out.println("Your answer is " + sum);
        }
        else{

            System.out.println("Your answer is " + answer);
        }
    }
}