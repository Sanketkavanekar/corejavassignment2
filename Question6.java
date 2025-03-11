import java.util.*;
class Question6{
    public static void main(String [] args){
	
	int a=10,b=25,c=15;
	
	int l=(a>b) ? ( a > c ? a : c) : (b > c ? b : c );
	System.out.println("largest is ; " + l);
	}
	}