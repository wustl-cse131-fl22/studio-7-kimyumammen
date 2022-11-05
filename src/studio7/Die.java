package studio7;

public class Die {
	private int number;
	
	public Die()
	{
		number = 1;
	}
	
	public Die(int initNumber)
	{
		number = initNumber;
	}
	
	public int roll()
	{
		return (int) (Math.random() * number + 1);
	}
	
	public static void main(String[] args)
	{
		Die d1 = new Die(5);
		Die d2 = new Die (50);
		System.out.println(d1.roll());
		System.out.println(d2.roll());
	}
}
