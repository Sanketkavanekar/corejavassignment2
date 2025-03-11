import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
		Scanner st =new Scanner(System.in);
		
		System.out.print("enter a number:");
		int n=st.nextInt();
		
		int result=n<<3;
		
		System.out.println(n + "multiplies by 8 is "+result);
	}
}