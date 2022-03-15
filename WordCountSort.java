package interviewscenario;

import java.util.Arrays;

public class WordCountSort
{
 public static void main(String[]args)
 {
	 String s1 = "I am Indian . I live in India . India has 27 states";
	 String[] s2 = s1.split(" ");
	 
	 System.out.println(s1);
	 
	 System.out.println(Arrays.toString(s2) + " , ");
	 
	 for (int i = 0 ; i < s2.length ; i++)
	 {
			int count =1;
			for (int j = i+1 ; j < s2.length; j++)
			{
			    
				if(s2[i].equals(s2[j])) {
					count++;
				}
			}
	
			   for(int k = i ; k>0 ; k--) {
			       if(s2[i].equals(s2[k-1])) {
			    	   count = 0;
			       }
			   }
			   if(count >= 1) {
				   System.out.println(s2[i] + " " + count);
					
				}
			   
		}
	 
	 
 }
}
