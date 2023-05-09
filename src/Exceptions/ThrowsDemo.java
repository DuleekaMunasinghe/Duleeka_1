package Exceptions;

public class ThrowsDemo {
    static void throwmethodone() throws IllegalAccessException
    {
        System.out.println("throw method one ");
        throw new IllegalAccessException();
    }
    //if a method is capable of causing exception, but it does not handle it
    //so caller of the method should handle the exception using catch box
    public static void main(String[] args) {
        try
        {
            throwmethodone();
        }
        catch (IllegalAccessException e)
        {
            System.out.println("illegal expectoin " +e);
        }
        finally 
        {
            System.out.println("End of try catch block " );
        }
    }
}