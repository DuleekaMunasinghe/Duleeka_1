package Test1;

public class InterfaceDemo implements Callback {
	public void method01() {
		System.out.println("implements of method 01 ");
	}

	public static void main(String[] args)

	{
		InterfaceDemo obj =new InterfaceDemo();
		obj.method01();
	}
}