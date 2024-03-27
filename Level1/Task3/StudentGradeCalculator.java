package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

//Task3
public class StudentGradeCalculator 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the Student Name: ");
		String name=sc.nextLine();
		System.out.println();

		
		System.out.print("Enter the number of grades: ");
		int numGrades;
		try
		{
			numGrades= sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input ! Enter the number only: ");
			sc.next();
			 numGrades= sc.nextInt();
		}
		System.out.println();
		
		int greads[]=new int[numGrades];
		
		for (int i=0;i<numGrades;i++)
		{
			
			int gread;
			boolean validInput=false;
			while(!validInput)
			{
				try
				{
					System.out.print("Enter grade "+ (i+1)+": ");
					gread=sc.nextInt();

					if(gread >=0 && gread <=100)
					{
						greads[i]=gread;
						validInput=true;
					}
					else
					{
						System.out.println("Grade must be between 0 and 100.");
					}
				}
				catch(Exception e)
				{
					System.out.println("Please enter a valid numeric grad: ");
					sc.next();
				}
			}
		}
		
		double sum=0;
		for(int i=0;i < numGrades;i++)
		{
			sum=sum+greads[i];
		}
		
		double averageOfGrade=sum/numGrades;
		System.out.println("\nStudent Name: "+name);
		System.out.println("The average grade is: "+averageOfGrade);
	}
}

