import java.util.*;
class StockSpan
{
	public static void main(String[] args) 
	{
		// int [] a={100,65,70,110,80,90,120};
				int [] a={100,65,70,110,80,90,120};

		// System.out.println(a.length);
		Stack s=new Stack();
		Integer [] span=new Integer[a.length];
		span[0]=1;
		s.push(0);
		for(int i=1;i<a.length;i++)
		{
			int counter=0;
			int temp=a[i];
			while(temp>a[(int)s.peek()])
			{
				
				s.pop();
				if(s.empty())
				{
					s.push(i);
					counter++;
					span[i]=i+1;
				}
			}
			if(counter==0)
			{
			s.push(i);
			span[i]=
		}

		}
		System.out.println(s);
		}
}