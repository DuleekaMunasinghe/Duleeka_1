package Test1;
public class TwodimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multidimensional array means -- array of array
		
		int twoDarr[][];		
		twoDarr = new int[4][5];
		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				twoDarr[i][j]=k;
				System.out.println("value of twoDarr is :twoDarr["+i+"]["+j+"]"+ twoDarr[i][j]);
				k++;
			}
			
			System.out.println("******");
		}
		
	}

}
