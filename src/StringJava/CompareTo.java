package StringJava;

public class CompareTo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2= "Hello";
        String s3= "Mella";
     // char cl= 'H';
     // String strDouble;
        
        System.out.println("s1 compae s2 is :" + s1.compareTo(s2));
        System.out.println("s1 compae s3 is :" + s1.compareTo(s3));
      //System.out.println("unicode value fo H :" + Integer.toString(int(cl));
        String strDouble = String.format("%.2f", 1.23456);
        System.out.println(s1.concat(s3));
        System.out.println( strDouble);
        
    }
}