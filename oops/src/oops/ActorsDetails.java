package oops;

public class ActorsDetails {

    public static void main(String[] args) {

        Actors a = new Actors();

       
        a.setName("M.G.R");
        a.setAge(70);
        a.setGender("Male");
        a.setNationality("Indian");
        a.setMovieCount(136);
        
        a.setAwards(5);
        a.setSalary(500000);

      
        System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
        System.out.println("Gender: " + a.getGender());
        System.out.println("Nationality: " + a.getNationality());
        System.out.println("Movie Count: " + a.getMovieCount());
        System.out.println("Awards: " + a.getAwards());
        System.out.println("Salary: " + a.getSalary());
    }
}


