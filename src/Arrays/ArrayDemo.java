package Arrays;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// An array is a data structure which hold a group of  together
		//its size should be defined
		// when an array is created we cannot change size of array
		
		/* Moethod#1
		int month_days[]; // type name_array --declaring an array
		month_days = new int[5]; // name_arr = new type [size] -- allocating memory to array
		
		month_days[0]=10; // assign values to the array, array index should start with zero
		month_days[1]=20;
		month_days[2]=20;
		month_days[3]=20;
		month_days[4]=50;
		
		for(int i=0; i<=4; i++)
		System.out.println(month_days[i]);*/
		/*System.out.println(month_days[1]);
		System.out.println(month_days[2]);
		System.out.println(month_days[3]);
		System.out.println(month_days[4]);*/
		
		/*Method#2*/
		
		/*int month_days[] = {10, 20 ,30, 40, 50, 60};// combination of both initialization, declaration and assigned the values to the array
		for (int i=0; i<=5; i=i+1)
			System.out.println(month_days[i]);*/
		// hard code above method #2
		
		/*int month_days[] = {10, 20 ,30, 40, 50, 60, 70};// combination of both initialization and declaration 
		for (int i=0; i<month_days.length; i=i+1)// hard coding,for loop will do the same thing as above and it will run till the end of the array elements, length function, doesn't matter how many elements got the array
			System.out.println(month_days[i]);
		System.out.println("No of elements in the array "+ month_days.length); //print the length of the array
		System.out.println(month_days[5]);// printing the value of 5th location of the array*/
		
		/*int nums[]= {10, 20, 30, 40, 50}; // combination of both initialization and declaration 
		int result = 0; 
		for(int i=0; i<nums.length; i++)
		{
//			result = result+nums[i];
			
			System.out.println(result + "=" +result+"+"+nums[i]);
			result = result+nums[i];
		}*/
		
		int arr[]; //declaring an array
		arr = new int[5]; //asigning a size of an array
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= i*10;
			System.out.println(arr[i]);
		}
	}

}
