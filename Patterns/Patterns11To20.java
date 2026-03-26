package Patterns;

public class Patterns11To20 {

    // Pattern 11: Left-aligned pyramid of stars
    public void pattern11() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 12: Right-aligned triangle
    public void pattern12() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print("*");
            System.out.println();
        }
    }

    // Pattern 13: Square of stars
    public void pattern13() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // Pattern 14: Hollow square
    public void pattern14() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Pattern 15: Right-angled triangle numbers descending
    public void pattern15() {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // Pattern 16: Left triangle of letters
    public void pattern16() {
        for(char i='A';i<='E';i++){
            for(char j='A';j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }

    // Pattern 17: Reverse alphabet triangle
    public void pattern17() {
        for(char i='E';i>='A';i--){
            for(char j='A';j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }

    // Pattern 18: Pyramid numbers
    public void pattern18() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print(k + " ");
            System.out.println();
        }
    }

    // Pattern 19: Inverted pyramid numbers
    public void pattern19() {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print(k + " ");
            System.out.println();
        }
    }

    // Pattern 20: Diamond numbers
    public void pattern20() {
        int n=5;
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