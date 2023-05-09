package Exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {

        //try, catch throw, throws, finally
        try {
            int x = 0;
            int y = 1 / x;
            System.out.println("value of y" + y);// infinity exception
            // if not catching then it is unchecked exceptions
        } catch (ArithmeticException e) {
            System.out.println("division by Zero.");

        }
        System.out.println("After the catch statement.");
    }
}
