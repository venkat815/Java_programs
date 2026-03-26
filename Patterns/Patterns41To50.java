package Patterns;

public class Patterns41To50 {

	    public static void main(String[] args) {

	        int n = 5;

	       

	        // Pattern 41 - Floyd Triangle
	        System.out.println("\nPattern 41");
	        int k=1;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(k+" ");
	                k++;
	            }
	            System.out.println();
	        }

	        // Pattern 42 - Binary Pattern
	        System.out.println("\nPattern 42");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if((i+j)%2==0)
	                    System.out.print("1 ");
	                else
	                    System.out.print("0 ");
	            }
	            System.out.println();
	        }

	        // Pattern 43 - Alphabet Triangle
	        System.out.println("\nPattern 43");
	        for(int i=1;i<=n;i++){
	            char ch='A';
	            for(int j=1;j<=i;j++){
	                System.out.print(ch+" ");
	                ch++;
	            }
	            System.out.println();
	        }

	        // Pattern 44 - Reverse Alphabet
	        System.out.println("\nPattern 44");
	        for(char i='E';i>='A';i--){
	            for(char j='A';j<=i;j++){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 45 - Hollow Triangle
	        System.out.println("\nPattern 45");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print("* ");
	                else
	                    System.out.print("  ");
	            }
	            System.out.println();
	        }

	        // Pattern 46 - Number Pyramid
	        System.out.println("\nPattern 46");
	        for(int i=1;i<=n;i++){

	            for(int j=i;j<n;j++)
	                System.out.print(" ");

	            for(int j=1;j<=i;j++)
	                System.out.print(j+" ");

	            System.out.println();
	        }

	        // Pattern 47 - Reverse Number Pyramid
	        System.out.println("\nPattern 47");
	        for(int i=n;i>=1;i--){

	            for(int j=n;j>i;j--)
	                System.out.print(" ");

	            for(int j=1;j<=i;j++)
	                System.out.print(j+" ");

	            System.out.println();
	        }

	        // Pattern 48 - Diamond
	        System.out.println("\nPattern 48");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++)
	                System.out.print("*");
	            System.out.println();
	        }
	        for(int i=n-1;i>=1;i--){
	            for(int j=n;j>i;j--)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++)
	                System.out.print("*");
	            System.out.println();
	        }

	        // Pattern 49 - Reverse Numbers
	        System.out.println("\nPattern 49");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j>=1;j--){
	                System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 50 - Even Numbers Triangle
	        System.out.println("\nPattern 50");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(2*j+" ");
	            }
	            System.out.println();
	        }

	    }
	}

