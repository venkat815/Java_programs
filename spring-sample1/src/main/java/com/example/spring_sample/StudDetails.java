package com.example.spring_sample;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	@Configuration


public class StudDetails {
	@Bean
	public Student Student()
	{
		Student s= new Student ();
		 s.setName("venkat `");
		    s.setAge(21);
		    return s;
		    
		    
	}

	    

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(StudDetails.class);

		Student s=context.getBean(Student.class);
		System.out.println("Name " + s.getName());
		System.out.println("Age " + s.getAge());
		
	}

	}
