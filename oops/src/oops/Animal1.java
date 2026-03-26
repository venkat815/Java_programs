package oops;

public class Animal1 {
	
		public void run()
		{
			System.out.print("running");		}
	}
	class Deer extends Animal1{
		public void sleep()
		{
			System.out.println("sleeping");
		}
	

	public static void main(String[] args) {
		Deer d=new Deer();
		d.sleep();
		d.run();
		
		

	} 

}