package test;

public class testcar {
//main method
	public static void main(String[] args)
	{
		car c = new car();
		c.carModel = "BMW";
		
		c.reg = new registration_num();
		c.reg.regNo = "DL 12345";
		
		System.out.println(c.reg.regNo);
	}

}
