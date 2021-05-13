import java.util.Scanner;

class  Calculatorbasiccode {
    public static void main(String[] args) throws InterruptedException {
        introcode i = new introcode();
        i.intro();
        boolean lol = true;
        while(lol == true){
            Thread.sleep(1000);

            System.out.println("What mathematical operation would you like to use addition, subtraction, multiplication, division, exponents, or squared?");
        
            Scanner operation = new Scanner(System.in);
            String o = operation.next();

            Thread.sleep(1000);
        
            if(o.equals("addition")){
                addition a = new addition();
                a.adding();
            }
            else{

                if(o.equals("subtraction")){
                    subtraction s = new subtraction();
                    s.subtracting();
                }

                else{

                    if(o.equals("multiplication")){
                        multiplication m = new multiplication();
                        m.multiplying();
                    }

                    else{

                        if(o.equals("division")){
                            division d = new division();
                            d.dividing();

                        }

                        else{

                            if(o.equals("exponents")){
                                exponents e = new exponents();
                                e.exponential();

                            }

                            else{

                                if(o.equals("squared")){
                                    roots r = new roots();
                                    r.root();
                                
                                }

                                else{

                                    System.out.println("THAT IS NOT A MATHEMATICAL OPERATION!");
                                    Thread.sleep(1000);
                                    System.out.println("You annoy me.");
                                    Thread.sleep(1000);

                                }
                            }
                        }
                    }
                }
            }
            
            Thread.sleep(1000);

            System.out.println("Would you like to continue using the calculator?");
            Thread.sleep(1000);

            System.out.println("Yes or No?");

            Scanner yes = new Scanner(System.in);
            String Y = yes.next();

            if( Y.equals("yes") ){
                lol = true;

            }
            else{
                if(Y.equals("Yes")){
                    lol = true;

                }
                else{
                    Thread.sleep(1000);
                    System.out.println("Goodbye");
                    System.exit(1);
                }
            }
        
        
        }
    }
}