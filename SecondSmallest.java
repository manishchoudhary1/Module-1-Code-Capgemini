package Arrays;

public class SecondSmallest {
	
	public void secondLargest(int []arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("The Second largest element is "+arr[1]);
	}

}
