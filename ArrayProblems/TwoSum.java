package ArrayProblems;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] a = {10,20,70,60,100,120,30};
		int target = 150;

		for(int i=0; i<a.length; i++){
		    for(int j=i+1; j<a.length; j++){
		        if(a[i] + a[j] == target){
		            System.out.println(a[i] + " + " + a[j]);
		        }
		    }
		}

	}

}
