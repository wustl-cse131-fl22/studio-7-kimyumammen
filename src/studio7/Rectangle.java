package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	
	public double getArea()
	{
		return this.length * this.width;
	}
	
	public double getPerimeter()
	{
		return 2 * (this.length + this.width);
	}
	
	public boolean isSmaller(Rectangle other)
	{
		return this.getArea() < other.getArea();
	}
	
	public boolean isSquare()
	{
		return this.length == this.width;
	}
	
	public void draw()
	{
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.005);
		StdDraw.rectangle(0.5, 0.5, this.width / 2, this.length / 2);
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(0.2, 0.2);
		Rectangle r2 = new Rectangle (0.2, 0.5);
		
		r1.draw();
		r2.draw();
		
		System.out.println(r1.isSmaller(r2));
		System.out.println(r2.isSmaller(r1));
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());
	
	}
}
