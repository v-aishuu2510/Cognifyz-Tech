package level1;
//task4
import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Random random=new Random();
		
		System.out.print("Enter the Length of the password you want: ");
		int length=sc.nextInt();
		sc.nextLine();
		
		boolean includeNumbers=false;
		boolean includeLowerCaseLetter=false;
		boolean includeUpperCaseLetter=false;
		boolean incudeSepecialCharacters=false;
		
		while(!(includeNumbers || includeLowerCaseLetter || includeUpperCaseLetter || incudeSepecialCharacters))
		{
			System.out.print("\nDo you want to include Numbers? (yes / no) : ");
			includeNumbers=sc.nextLine().equalsIgnoreCase("yes");
			
			System.out.print("\nDo you want to include LowerCase Letters? (yes/no) :  ");
			includeLowerCaseLetter=sc.nextLine().equalsIgnoreCase("yes");
			
			System.out.print("\nDo you want to include UpperCase Letter? (yes/no) : ");
			includeUpperCaseLetter=sc.nextLine().equalsIgnoreCase("yes");
			
			System.out.print("\nDo you want to include special characters? (yes/no): ");
			incudeSepecialCharacters = sc.nextLine().equalsIgnoreCase("yes");

			
			if(!(includeNumbers || includeLowerCaseLetter || includeUpperCaseLetter || incudeSepecialCharacters))
			{
				System.out.println("\nYou must select at least one type of character to include in the password.");
			}
		}
		
		String numbers = "0123456789";
       String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
       String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String specialChars = "!@#$%^&*()_+{}[];:<>,.?/";
       
       StringBuilder password=new StringBuilder();
       
       while(password.length() < length)
       {
    	   
    	   if(includeNumbers)
    	   {
    		   password.append(numbers.charAt(random.nextInt(numbers.length())));
    	   }
    	   
    	   if(includeLowerCaseLetter)
    	   {
    		   password.append(lowercaseLetters.charAt(random.nextInt(lowercaseLetters.length())));
    	   }
    	   
    	   if(includeUpperCaseLetter)
    	   {
    		   password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
    	   }
    	   
    	   if(incudeSepecialCharacters)
    	   {
    		   password.append(specialChars.charAt(random.nextInt(specialChars.length())));
    	   }
       }
       
       
       if(password.length() > length)
       {
    	   password.setLength(length);
       }

       char passwordCharactors[]=password.toString().toCharArray();
       
       for(int i=0; i<passwordCharactors.length;i++)
       {
    	   int randomIndex=random.nextInt(passwordCharactors.length);
    	   
    	   char temp=passwordCharactors[i];
    	   
    	   passwordCharactors[i]=passwordCharactors[randomIndex];
    	   
    	   passwordCharactors[randomIndex]=temp;
       }
       
       password=new StringBuilder(String.valueOf(passwordCharactors));
       
       System.out.println("\n============================");
       System.out.println("Generated Password: "+password.toString());
       System.out.println("============================");

		
       sc.close();
	}
}
