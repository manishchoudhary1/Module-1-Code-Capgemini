package FlowControl;

public class PowerOfTwo {

	public boolean naive(int n)
	{
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
			
		}
		return true;
		
	}
}
