package level1;

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
		int numGrades= sc.nextInt();
		System.out.println();
		
		int greads[]=new int[numGrades];
		
		for (int i=0;i<numGrades;i++)
		{
			
			System.out.print("Enter grade "+ (i+1)+": ");
			int gread=sc.nextInt();
			
			while(gread <0 || gread>100)
			{
				System.out.println("Grade must be between 0 and 100.");
				System.out.println("Enter grade "+(i+1)+": ");
				gread=sc.nextInt();
			}
			greads[i]=gread;
		}
		
		double sum=0;
		for(int i=0;i < numGrades;i++)
		{
			sum=sum+greads[i];
		}
		
		double averageOfGrade=sum/numGrades;
		System.out.println("Student Name: "+name);
		System.out.println("The average grade is: "+averageOfGrade);
	}
}
