/**
Author:George Samu
Date:5/22/2020

*/
import java.util.Scanner;

public class MathCosine
{
	public static void main (String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is the angle in radians: ");
	double angleInRadians=keyboard.nextDouble();
	double cosine=Math.cos(angleInRadians);
	System.out.println("The cosine of "+ angleInRadians+ " radians is "
						+ cosine);
	
	System.out.println();
	
	System.out.print("Type the angle in degrees: ");
	double angleInDegrees=keyboard.nextDouble();
	angleInRadians=Math.toDegrees(angleInDegrees);
	cosine = Math.cos(angleInRadians);
	System.out.println("The cosine of " +angleInDegrees +
						"degree is "+ cosine);
	
	}//end main
	}//MathCosine