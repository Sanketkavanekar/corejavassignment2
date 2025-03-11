import java.util.*;
class Question3{
    public static void main(String [] args){
	 //  Implement a program that calculates the  sum of digits  of an integer using  modulus 
     //(  %  ) and division (  /  ) operators  . 
	Scanner st=new Scanner (System.in);
	int digit=st.nextInt();
	
	if(digit < 0){
		System.out.println("number is negative");
	}
	int sum=0;
    while(digit>0){
		sum+=digit%10;
		digit/=10;
	}
	
	



	
	System.out.println("sum of digits :" + sum);
	
	
	
	
	}

}