package day9empwage;

import java.util.Scanner;

public class day9uc3 {

	void show()
	{
		int hours=8, wage;
		String empname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp name");
		empname=sc.nextLine();
		
		System.out.println("Enter emp wage per hour ");
		wage=sc.nextInt();
		//calculating pay
		int pay = wage * hours;
		System.out.println("Total emp wage is "+pay );
	}
	
     	public static void main(String[] args) {
	    day9uc3 obj = new day9uc3();
	    obj.show();
 }

}