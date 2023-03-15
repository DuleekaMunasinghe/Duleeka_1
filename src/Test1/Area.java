package Test1;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float radius = 9.6f;
		final float pie = 3.14f; //pie is a constant so initiate as "final float" which is not change later 
		float area = pie * radius* radius;
		System.out.println("Area of circle is: "+String.format("%.2f", area)); // print vs println : Print will display only one line while println display line by line
	}
}
