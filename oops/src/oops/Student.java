package oops;

public class Student {
	
		private int age;
		private String name;
		private char city;
		private String state;
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void setCity(char city) {
			this.city=city;
		}
		public char getCity () {
			return city;
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return state;
		}
		
		static{
			int a=10;
			int b=20;
			System.out.println(a+b);
			System.out.println("satic block executed");
		}
		static{
			System.out.println("satic block executed1");
		}
		static{
			System.out.println("satic block executed2");
		}
		{
			System.out.println("non static bloc");
		}
		{
			System.out.println("non static bloc1");
		}
		{
			System.out.println("non static bloc11");
		}
		{
			System.out.println("non static bloc11");
		}
		
		//default const
		Student(){
			System.out.println("constrcutor called");
		}
		
		//parameter const
		Student(int age,String name){
			this.name=name;
			this.age=age;
			System.out.println("value");
		}

		public static void main(String[] args) {
			System.out.println("welcome");
			Student s=new Student();
		s.setAge(15);
			
			
			Student ss=new Student(20,"dhinesh");
		 System.out.println(ss.getAge());

		Student s2=new Student();
		 s2.setCity( 'T');
		 
		
		 System.out.println(s2.getCity());
		 
		 Student s3=new Student();
		 s3.setState("Tamil Nadu");
		 
		 System.out.println(s3.getState());
		 
		}

	}

