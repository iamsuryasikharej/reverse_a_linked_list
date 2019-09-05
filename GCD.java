class GCD
{
	public static void main(String[] args) {
		a obj=new a();
		System.out.println( obj.GCDyo(121,11));
	}
	
}
class a
{
	public int GCDyo(int a,int b)
	{
		if(a==b)
		{
			return a;
		}
		if(a%b==0)
		{
			return b;
		}
		if(b%a==0)
		{
			return a;
		}
		if(a>b)
		{
			return GCDyo(a%b,b);
		}
		if(b>a)
		{
			return GCDyo(a,b%a);
		}
		return 111;
	
	}
}