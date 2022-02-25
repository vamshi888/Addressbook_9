package day9empwage;

public class day9uc1 {

	void a()
	  {    
		   int emppresent=1; 
	       double empcheck = Math.floor(Math.random() * 10) %2;
	       
		  if(empcheck==1)
			{   
			  System.out.println("employee is present");
			}
		  
		  else 
			  System.out.println("employee is absent");
	}
		public static void main(String[] args) {
			day9uc1 obj = new day9uc1();
			obj.a();

		}

	}