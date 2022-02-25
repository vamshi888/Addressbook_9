package day9empwage;

public class day9uc2 {

	void show()
	{
		int wage=20, hours=8;
		//calculating pay
		int pay = wage*hours;
		
		System.out.println("employee wage is "+pay);
	}
public static void main(String[] args) {
	day9uc2 obj = new day9uc2();
	obj.show();

}

}