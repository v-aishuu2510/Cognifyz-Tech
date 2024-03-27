package level1;

import java.util.Scanner;

//Task1
public class TemperatureConverter 
{
	public static float CelsiusToFahrenheit(float celsius)
	{
		return  (celsius *  9/5)+32;
	}
	public static float FahrenheitToCelsius(float fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		
	   System.out.println("┌────────────────────────┐");
		System.out.println("|       Temperature Converter   |");
	   System.out.println("└────────────────────────┘");

		
		System.out.println("1 . Celsius to Fahrenheit ");
		System.out.println("2 . Fahrenheit to Celsius ");
		System.out.println("3 . Exit \n");
		
		
		while(true)
		{
			System.out.print("Enter your choice [ 1 or 2 ]  or 3: ");
			try
			{
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.print("Enter  temparatur in celsius : ");
					float celsius=sc.nextFloat();
			       System.out.println("┌────────────────────────┐");
			       System.out.println("|       Celsius = Fahrenheit       |");
			       System.out.println("└────────────────────────┘");
			       System.out.println("      "+ celsius +"°C = "+CelsiusToFahrenheit(celsius)+" °F   " );
			       System.out.println("└────────────────────────┘\n");
			       break;
			       
				case 2:
					System.out.print("Enter  temparatur in fahrenheit  : ");
					float fahrenheit=sc.nextFloat();
			       System.out.println("┌────────────────────────┐");
			       System.out.println("|       Fahrenheit = Celsius       |");
			       System.out.println("└────────────────────────┘");
			       System.out.println("    "+ fahrenheit +" °F = "+FahrenheitToCelsius(fahrenheit)+" °C     " );
			       System.out.println("└────────────────────────┘\n");
			       break;
				case 3:
					System.out.println("**Exit**");
					return;
					
					default:
						System.out.println("Invalid choice , Please choose valid Number code ");
						break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input, please Enter valid number:  ");
				sc.nextLine();
			}
		}
	}
}
