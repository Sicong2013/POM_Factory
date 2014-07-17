package test;

public class test {

	public static void main(String[] args)
	{	//object of bathroom first
		bathroom b = new bathroom();
		b.setMirrors(3);
		
		//pass this inside house class
		House h = new House(b);
		h.Color();
		System.out.println(h.b.getMirrors());
	}

}
