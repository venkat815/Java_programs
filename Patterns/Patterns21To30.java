package Patterns;

public class Patterns21To30 {

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 21 - 1 to 5 Triangle
	        System.out.println("Pattern 21");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 22 - Reverse 5 to 1 Triangle
	        System.out.println("\nPattern 22");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 23 - Increasing Row Numbers
	        System.out.println("\nPattern 23");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 24 - Reverse Row Numbers
	        System.out.println("\nPattern 24");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 25 - Alphabet Triangle
	        System.out.println("\nPattern 25");
	        for(char i='A'; i<='E'; i++){
	            for(char j='A'; j<=i; j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 26 - Same Alphabet
	        System.out.println("\nPattern 26");
	        for(char i='A'; i<='E'; i++){
	            for(char j='A'; j<=i; j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 27 - Star + Number
	        System.out.println("\nPattern 27");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("*"+j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 28 - Reverse Star + Number
	        System.out.println("\nPattern 28");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print("*"+j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 29 - Number Pyramid
	        System.out.println("\nPattern 29");
	        for(int i=1;i<=n;i++){

	            for(int j=i;j<n;j++){
	                System.out.print(" ");
	            }

	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }

	            System.out.println();
	        }

	        // Pattern 30 - Reverse Number Pyramid
	        System.out.println("\nPattern 30");
	        for(int i=n;i>=1;i--){

	            for(int j=n;j>i;j--){
	                System.out.print(" ");
	            }

	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }

	            System.out.println();
	        }

	    }
	}

