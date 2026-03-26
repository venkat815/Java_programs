package ArrayProblems;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] a = {1,22,22,3,44,5};

		for(int i=0; i<a.length; i++){
		    boolean isDuplicate = false;
		    for(int j=0; j<i; j++){
		        if(a[i] == a[j]){
		            isDuplicate = true;
		            break;
		        }
		    }
		    if(!isDuplicate){
		        System.out.print(a[i] + " ");
		    }
		}

	}

}
