package Test1;


public class OverriddingB extends OverriddingA{
	int k;
	OverriddingB(int a,int b ,int c)
	{
		super(a,b); // and b coming from parent
		k=c;
		
	}
	
	
	void show()
	{   super.show();
		System.out.println("k :"+ k);
	}
}