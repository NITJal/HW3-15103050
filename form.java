

import java.util.Scanner;

public class form {
	String name;
	String email;
	String address;
	int rollNo;
	String phoneNo;
	float hsc_percent;
	float ug_percent;
	
	Scanner sc=new Scanner(System.in);

	void info() throws Exception 
	{
	    System.out.println("Enter your name");
		name = sc.next();
		int n = name.length();
		for(int i=0; i<n; i++)
		{
			if(!((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z')))
			{
				throw new Exception("Invalid Name.Name must contain alphabets only.");
			}	
		}
	    
		System.out.println("Enter your roll number");	
		rollNo=sc.nextInt();
		if(rollNo<10000000 || rollNo>99999999)
		{
		    throw new Exception("Invalid Roll Number.Roll Number must contain 8 digits only.");
		}

	    System.out.println("Enter your address");	
		address=sc.next();
		
	    System.out.println("Enter your Phone number");	
	    phoneNo=sc.next();
	    if(phoneNo.length() != 10)
			throw new Exception("Invalid Phone Number.Phone Number must contain 10 digits only.");
		for(int j=0; j<10; j++)
		{
			if(!(phoneNo.charAt(j)>='0' && phoneNo.charAt(j)<='9'))
				throw new Exception("Invalid Phone Number.Phone Number must contain alphabets only.");
		}
	
	    System.out.println("Enter email address");	
	    email=sc.next();
	
	    System.out.println("Enter your HSC percentage");	
	    hsc_percent=sc.nextFloat();
	    if(hsc_percent> 100 || hsc_percent<0)
			throw new Exception("Invalid HSC percentage.Please enter a number between 0 and 100.");
	    
	    System.out.println("Enter your UG percentage");	
	    ug_percent=sc.nextFloat();
	    if(ug_percent> 100 || ug_percent<0)
			throw new Exception("Invalid UG percentage.Please enter a number between 0 and 100.");
	    
	}

	public static void main(String[] args) throws Exception
	{
		form f=new form();
		f.info();
		if(f.hsc_percent >= 60 && f.ug_percent >= 70)
			System.out.println("The candidate with the roll number "+f.rollNo+" is eligible for admission.");
		else
			System.out.println("Sorry, the candidate with the roll Number "+f.rollNo+" is not eligible for admission.");
	}
}