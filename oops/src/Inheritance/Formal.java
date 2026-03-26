package Inheritance;

public class Formal extends Cloths{
	 void iron() {
	        System.out.println("Ironing the formal clothes");
	    }

	    void tuckShirt() {
	        System.out.println("Tucking the formal shirt");
	    }
	public static void main(String[] args) {
		Formal f = new Formal();
		f.wear();

	}

}
