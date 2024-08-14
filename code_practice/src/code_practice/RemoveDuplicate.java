package code_practice;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int numbers[]= {1,12,4,1,5,3,3,4,6};

		int ans[]=new int[numbers.length];
		
		int i,j,k = 0,count =0;
		
        for(i=0;i<ans.length;i++) {
        	boolean isDuplicate =false;
        	for(j=0;j<ans.length;j++) {

        	      if(numbers[i]==ans[j]) {
        	    	  isDuplicate=true;     	    	  	  
        	       } 

        	}
        	if(isDuplicate==false) {
        		count++;
        	ans[k++]=numbers[i];
        	}
        	}
        
    	
    	int result[]=new int[count];
    	
    	for(int a=0;a<result.length;a++) {
    			
    		result[a]=ans[a];

    	}
        Arrays.sort(result);
    	System.out.println("result = "+Arrays.toString(result));
	}

}
