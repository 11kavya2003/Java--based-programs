class func
{
	int num;
	
	func(int n)
	{
		num=n;
		if(n%2==0)
		   System.out.println("Even");
		else
		   System.out.println("Odd");
	}
	
	public static void main(String args[])
	{
		func c1= new func(55);
		func c2= new func(40);
	
	}
}