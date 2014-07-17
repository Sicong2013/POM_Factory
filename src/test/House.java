package test;

public class House extends Building {

	//which means house has all the things of a Building
	
	bathroom b = null;
	//create a constructor
	public House(bathroom b){
		this.b = b;
	}
}
