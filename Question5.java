import java.util.*;
class Question5{
    public static void main(String [] args){
	  
	int a=10,b=20;
	
	System.out.println("Before: a = " + a + ", b = " + b);
	
	a += b;
	b=a-b;
	a-=b;
	
	System.out.println("After : a = " + a + ", b = " + b);
	}
}