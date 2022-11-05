package studio7;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction()
	{
		numerator = 0;
		denominator = 1;
	}

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}

	public Fraction multiply(Fraction other)
	{
		int newNumerator = this.numerator * other.numerator;
		int newDenominator = this.denominator * other.denominator;
		return new Fraction(newNumerator, newDenominator);
	}
	
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(1, 2);
		System.out.println(f1);
		System.out.println(f1.multiply(f2));
	}
}
