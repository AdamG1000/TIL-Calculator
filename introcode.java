import java.util.Scanner;

public class introcode {

    void intro()throws InterruptedException {
        boolean Lol = true;
        while(Lol == true){
            System.out.println("Hello kind stranger I will be your personal calculator");
            Thread.sleep(1000);
            System.out.println("Would you like to use my calculating abilities?");
            Thread.sleep(1000);
            System.out.println("Yes or No?");
            Scanner yes = new Scanner(System.in);
            String Y = yes.next();
            if( Y.equals("yes") ){
                break;

            }
            else{
                if(Y.equals("Yes")){
                    break;
                }
                else{
                    System.out.println("Goodbye");
                    System.exit(1);
                }
            }
        }
    }
}
