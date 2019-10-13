package git;

public class qn10 
{

	public static void main(String[] args) 
	{
		double sum=0;
		for(double i=3;i<=2000000;i=i+2)
		{
			int flag=0;
			for(double j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				sum=sum+i;
			}
		}
		System.out.printf("Result:%.0f",sum+2);
	}
}
