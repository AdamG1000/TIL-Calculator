import java.util.Scanner;

public class exponents{

    void exponential()throws InterruptedException{
      
        System.out.println("What is the base");

        Scanner n1 = new Scanner(System.in);
        double x = n1.nextDouble();
        Thread.sleep(100);
        
        System.out.println("what is the number you are raising the base by");

        Scanner n2 = new Scanner(System.in);
        double y = n2.nextDouble();
        
          
        double sum = Math.pow( x , y);
        int answer = (int)sum;

        Thread.sleep(1000);

        System.out.println("Your answer is " + answer);
        
    }
}