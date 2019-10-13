package git;

public class qn7 
{

	public static void main(String[] args)
	{
		int prime=0,c=0;
		for(int i=3;c<10000;i=i+2)
		{
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				prime=i;
				c++;
			}
			
		}
		System.out.println("Result="+prime);
	}

}
