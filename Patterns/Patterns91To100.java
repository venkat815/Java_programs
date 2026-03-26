package Patterns;

public class Patterns91To100 {

    public static void main(String[] args) {

        System.out.println("=== Pattern 91: Right-angled triangle of stars ===");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern 92: Inverted right-angled triangle ===");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println("\n=== Pattern 93: Square of numbers ===");
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("\n=== Pattern 94: Hollow square of stars ===");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n=== Pattern 95: Pyramid of stars ===");
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int k=1;k<=2*i-1;k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n=== Pattern 96: Inverted pyramid of stars ===");
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print(" ");
            for(int k=1;k<=2*i-1;k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n=== Pattern 97: Right-angled triangle with numbers ===");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("\n=== Pattern 98: Alphabet triangle ===");
        for(char i='A'; i<='E'; i++){
            for(char j='A'; j<=i; j++) System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("\n=== Pattern 99: Diamond of stars ===");
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int k=1;k<=2*i-1;k++) System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print(" ");
            for(int k=1;k<=2*i-1;k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n=== Pattern 100: Diamond of numbers ===");
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print(k);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print(k);
            System.out.println();
        }
    }
}