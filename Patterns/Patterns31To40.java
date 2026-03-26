package Patterns;

public class Patterns31To40 {
	

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 31 - Star Triangle
	        System.out.println("Pattern 31");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 32 - Reverse Star Triangle
	        System.out.println("\nPattern 32");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 33 - Number Triangle
	        System.out.println("\nPattern 33");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 34 - Reverse Number Triangle
	        System.out.println("\nPattern 34");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 35 - Same Row Numbers
	        System.out.println("\nPattern 35");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 36 - Reverse Same Row Numbers
	        System.out.println("\nPattern 36");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 37 - Alphabet Triangle
	        System.out.println("\nPattern 37");
	        for(char i='A';i<='E';i++){
	            for(char j='A';j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 38 - Same Alphabet
	        System.out.println("\nPattern 38");
	        for(char i='A';i<='E';i++){
	            for(char j='A';j<=i;j++){
	                System.out.print(i+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 39 - Continuous Numbers
	        System.out.println("\nPattern 39");
	        int k=1;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(k+" ");
	                k++;
	            }
	            System.out.println();
	        }

	        // Pattern 40 - Square Stars
	        System.out.println("\nPattern 40");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	    }
	}

