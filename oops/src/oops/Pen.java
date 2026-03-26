package oops;

public class Pen {
	String colour;
	float height;
	String name;

	public void write() {
		System.out.println("writing");
	}

	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.colour = "black";
		pen.height = 10.5f;
		pen.name = "cello";

		Pen pen1 = new Pen();
		pen1.colour = "blaack";
		pen1.name = "reyanld";

		{

			System.out.println(pen.colour);
			System.out.println(pen.name);
			pen.write();
		}
	}
}