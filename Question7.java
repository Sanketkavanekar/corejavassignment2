import java.util.*;
class Question7{
    public static void main(String [] args){
		  int year = 2024;
				if(year%400 == 00 ||(year%4 ==0 && year%100 != 0)) {
            System.out.println( year + " is a leap year.");
					}
					 else{
            System.out.println(  year + "is not a leap year. ");
					}
				}

    }