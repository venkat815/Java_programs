package Patterns;

public class Patterns71To80 {

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 71 - Hollow Square of Alphabets
	        System.out.println("Pattern 71");
	        for(char i='A'; i<'A'+n; i++){
	            for(char j='A'; j<'A'+n; j++){
	                if(i=='A' || i=='A'+n-1 || j=='A' || j=='A'+n-1)
	                    System.out.print(i + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 72 - Hollow Right Triangle Stars
	        System.out.println("\nPattern 72");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 73 - Hollow Left-Aligned Number Triangle
	        System.out.println("\nPattern 73");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 74 - Hollow Pyramid Stars
	        System.out.println("\nPattern 74");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 75 - Hollow Diamond Stars
	        System.out.println("\nPattern 75");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=n-1;i>=1;i--){
	            for(int j=n;j>i;j--) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 76 - Hollow Number Pyramid
	        System.out.println("\nPattern 76");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print(i);
	            }
	            System.out.println();
	        }

	        // Pattern 77 - Hollow Reverse Right Triangle
	        System.out.println("\nPattern 77");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 78 - Hollow Reverse Number Triangle
	        System.out.println("\nPattern 78");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 79 - Hollow Alphabet Triangle
	        System.out.println("\nPattern 79");
	        for(char i='A'; i<'A'+n; i++){
	            for(char j='A'; j<=i; j++){
	                if(j=='A' || j==i || i=='E') System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 80 - Hollow Square Numbers
	        System.out.println("\nPattern 80");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n) System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	    }
	}

