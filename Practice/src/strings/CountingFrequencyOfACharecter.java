package strings;

public class CountingFrequencyOfACharecter 
{
	public static void main(String[] args) 
	{
		String str = "welcome to javatpoint portal";
		int count = 0;
		for(int i = 0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("frequency of   is:"+count);

	}

}
