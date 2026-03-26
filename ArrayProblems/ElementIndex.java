package ArrayProblems;

public class ElementIndex {

	public static void main(String[] args) {
		
		int[] a = {2,3,4,5,7,2,5,8};
		int element = 7;

		for(int i=0; i<a.length; i++){
		    if(a[i] == element){
		        System.out.println("Index: " + (i+1));
		        break;
		    }
		}

	}

}
