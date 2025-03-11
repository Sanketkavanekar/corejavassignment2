import java.util.Scanner;

class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        
        boolean isPowerOfTwo = n > 0 && (n & (n - 1)) == 0;

        
        System.out.println(n + " is a power of 2: " + isPowerOfTwo);

        }
		}
    