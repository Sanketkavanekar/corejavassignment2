import java.util.*;
class Question4{
    public static void main(String [] args){
	  
	Scanner st=new Scanner (System.in);
	
    int num = st.nextInt();
        
       
    int originalNum = num;
        
      
    if (num < 0) {
        num = -num;  
    }
        
        
    while (num > 2) {
        num = num - ((1 << 1) + 1);  // 
    }
        
        
    boolean isDivisible = (num == 0);
        
        
    System.out.println(originalNum + " is" + 
    (isDivisible ? " " : " not ") + 
        "divisible by 3");
        
       
    }
}