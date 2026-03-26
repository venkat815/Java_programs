package ArrayProblems;

public class IsArraySorted {

	public static void main(String[] args) {
	
		int[] a = {10,30,40,70,100};

		boolean sorted = true;

		for(int i=0; i<a.length-1; i++){
		    if(a[i] > a[i+1]){
		        sorted = false;
		        break;
		    }
		}
		System.out.println(sorted);

	}

}
