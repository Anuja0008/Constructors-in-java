public class parameterized
{
		void addition(int x , int y, int z)
		{
			int sum=x+y+z;
			System.out.println("sum is"+sum);
			
		}
	
	public static void main(String[] args)
	{
		parameterized object=new parameterized();
		object.addition(25,30,100);
		
		
	}
}