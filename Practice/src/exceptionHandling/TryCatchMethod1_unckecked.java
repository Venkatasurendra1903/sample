package exceptionHandling;
public class TryCatchMethod1_unckecked
{
	public static void main(String[] args) 
	{
		int i, j, k = 0;
		
//		int a[] = new int[4]; 
		i = 8;
		j = 0;
		
		
		try
		{
			k = i / j;
			System.out.println(k);
//			for(int c = 0; c <= 5; c++)
//			{
//				a[c]=c+1;
//			}
//			for(int value:a)
//			{
//				System.out.println(value);
//			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divided by zero");
		}
		
		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("success"+e);
//		}
//		
		
//		catch(ArithmeticException e)
//		{
//			System.out.println("cannot divide by zero"+e); 
//		}
		
		
	}

}
