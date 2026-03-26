package oops;

public class Animal {
	private String name ;
	private String catagory;
	private int legs;

	public void setName(String name) {
		this.name = name;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public void setLegs(int legs) {
		this.legs=legs;
	}
	public String getName() { 
		return this.name;
	}
	public String getCatagory() {
		return this.catagory;
	}
	public int getLegs() {
		return this.legs;
	}

	public static void main(String[] args) {

		Animal a = new Animal();

		a.setName("Lion");    
		a.setCatagory("wild");
		a.setLegs(4);

		System.out.println("Name    : " + a.getName());      
		System.out.println("Catagory: " + a.getCatagory());
		System.out.println("Legs    : "+ a.getLegs());
	}


}



