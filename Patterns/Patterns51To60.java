package Patterns;

public class Patterns51To60 {

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 51 - Hollow Square
	        System.out.println("Pattern 51");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n)
	                    System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 52 - Right-Angled Hollow Triangle
	        System.out.println("\nPattern 52");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 53 - Hollow Pyramid
	        System.out.println("\nPattern 53");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" "); // spaces without else
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 54 - Diamond Hollow
	        System.out.println("\nPattern 54");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int i=n-1;i>=1;i--){
	            for(int j=n;j>i;j--)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 55 - Hollow Reverse Triangle
	        System.out.println("\nPattern 55");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 56 - Hollow Rectangle with Numbers
	        System.out.println("\nPattern 56");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n)
	                    System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 57 - Hollow Right-angled Triangle Numbers
	        System.out.println("\nPattern 57");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 58 - Hollow Centered Pyramid
	        System.out.println("\nPattern 58");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 59 - Hollow Diamond Numbers
	        System.out.println("\nPattern 59");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print(i);
	            }
	            System.out.println();
	        }
	        for(int i=n-1;i>=1;i--){
	            for(int j=n;j>i;j--)
	                System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1)
	                    System.out.print(i);
	            }
	            System.out.println();
	        }

	        // Pattern 60 - Hollow Triangle Alphabet
	        System.out.println("\nPattern 60");
	        for(char i='A'; i<'A'+n; i++){
	            for(char j='A'; j<=i; j++){
	                if(j=='A' || j==i || i=='E')
	                    System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	    }
}
	
	  