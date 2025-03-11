import java.util.*;
class Question13{
    public static void main(String [] args){
	    Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        int mask = num >> 31;
        int abs = (num + mask) ^ mask;

        
        System.out.println("The absolute value of " + num + " is " + abs);
	
	}
}