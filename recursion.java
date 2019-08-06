class recursion
{
	public static void main(String[] args) 
	{
		int x=fact(10);
		System.out.println(x);
	}
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);


	}
}
