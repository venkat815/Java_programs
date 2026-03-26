package ArrayProblems;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] a = {10,20,100,70,50,80};

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int num : a){
		    if(num > first){
		        second = first;
		        first = num;
		    } else if(num > second && num != first){
		        second = num;
		    }
		}
		System.out.println("Second Largest: " + second);
	}

}
