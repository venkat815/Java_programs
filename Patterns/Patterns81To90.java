package Patterns;

public class Patterns81To90{

	    public static void main(String[] args) {

	        int n = 5;

	        // Pattern 81 - Hollow Right Triangle Stars
	        System.out.println("Pattern 81");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 82 - Hollow Left-Aligned Number Triangle
	        System.out.println("\nPattern 82");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 83 - Hollow Pyramid Stars
	        System.out.println("\nPattern 83");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Pattern 84 - Hollow Diamond Stars
	        System.out.println("\nPattern 84");
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

	        // Pattern 85 - Hollow Number Pyramid
	        System.out.println("\nPattern 85");
	        for(int i=1;i<=n;i++){
	            for(int j=i;j<n;j++) System.out.print(" ");
	            for(int j=1;j<=2*i-1;j++){
	                if(j==1 || j==2*i-1) System.out.print(i);
	            }
	            System.out.println();
	        }

	        // Pattern 86 - Hollow Reverse Right Triangle Stars
	        System.out.println("\nPattern 86");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Pattern 87 - Hollow Reverse Number Triangle
	        System.out.println("\nPattern 87");
	        for(int i=n;i>=1;i--){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 88 - Hollow Alphabet Triangle
	        System.out.println("\nPattern 88");
	        for(char i='A'; i<'A'+n; i++){
	            for(char j='A'; j<=i; j++){
	                if(j=='A' || j==i || i=='E') System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 89 - Hollow Square Numbers
	        System.out.println("\nPattern 89");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){
	                if(i==1 || i==n || j==1 || j==n) System.out.print(j + " ");
	            }
	            System.out.println();
	        }

	        // Pattern 90 - Hollow Right-Angled Triangle Stars with Spaces
	        System.out.println("\nPattern 90");
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(j==1 || j==i || i==n) System.out.print("*");
	                else System.out.print(" ");
	            }
	            System.out.println();
	        }

	    }
	}

