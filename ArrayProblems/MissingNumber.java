package ArrayProblems;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,50,60};

		for(int i=0; i<a.length-1; i++){
		    if(a[i+1] - a[i] != 10){
		        System.out.println("Missing: " + (a[i] + 10));
		    }
		}

	}

}
