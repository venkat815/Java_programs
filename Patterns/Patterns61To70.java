package Patterns;

public class Patterns61To70 {

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 61 - Hollow Right Triangle Numbers
	        System.out.println("Pattern 61");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 62 - Hollow Left-Aligned Triangle Stars
	        System.out.println("\nPattern 62");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" "); // spaces
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n)
	                    System.out.print("*");
	                else System.out.print(" ");
	            }
	            System.out.println();
	        }

	        // Pattern 63 - Hollow Centered Pyramid Stars
	        System.out.println("\nPattern 63");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 64 - Hollow Diamond Stars
	        System.out.println("\nPattern 64");
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

	        // Pattern 65 - Number Hollow Pyramid
	        System.out.println("\nPattern 65");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print(i);
	            }
	            System.out.println();
	        }

	        // Pattern 66 - Hollow Rectangle of Stars
	        System.out.println("\nPattern 66");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 67 - Hollow Reverse Triangle
	        System.out.println("\nPattern 67");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 68 - Alphabet Hollow Triangle
	        System.out.println("\nPattern 68");
	        for(char i='A';i<'A'+n;i++){
	            for(char j='A';j<=i;j++){
	                if(j=='A' || j==i || i=='E') System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 69 - Hollow Square Numbers
	        System.out.println("\nPattern 69");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n) System.out.print(j+" ");
	            }
	            System.out.println();
	        }

	        // Pattern 70 - Hollow Right-Angled Triangle Stars with Spaces
	        System.out.println("\nPattern 70");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("*");
	                else System.out.print(" ");
	            }
	            System.out.println();
	        }

	    }
	}


