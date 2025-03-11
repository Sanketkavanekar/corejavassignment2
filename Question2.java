import java.util.*;
class Question2{
    public static void main(String [] args){
	
	    Scanner st=new Scanner(System.in);
		int num=st.nextInt();
		
	    if ((num & 1)==0){
			System.out.println(num+" :is even");
		}
	    else{
			System.out.println(num+ "is odd");
		}
	
	
   }
}