package Exceptions;

public class ExceptionDemo02 {

    public static void main(String[] args) 
    {
        try 
        {
            int a=args.length;// need to pass value of a
            a=1;
            System.out.println("Value of a : "+a);
            int b=1/a;
            int c[]= {1,2};
            c[10]=15;
            System.out.println("Stetment is not executed ");
        }
        catch (ArithmeticException ex)// Spelling should correct here: ArithmeticException ex
        {

            System.out.println("Divided by Zero "+ex);

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index is out of bound "+ex);
        }
        System.out.println("After try/catch blocks");
    }
}