package Exam01.Exam01;

/**
 * 判断101--200之间有多少个素数，并输出这些素数
 * 101-200之间有**个素数，分别是：****
 * 
 */

public class App 
{
    public static void main( String[] args )
    {
    	int count=0;
    	for (int i=101;i<=200;i++){
    		for(int j=2;j<i;j++){
    			if(i%j==0){
    				break;
    			}
    			if(j==i-1){
   	    	      System.out.print(i+"是素数\n");
    	    	      count++;	      
    		}
    
    	}
    		
    }
    	
       System.out.println( "101-200之间共有"+count+"个素数" );
        
   
  }
}


/*
package sushu.exam1;


public class App 
{
    public static void main( String[] args )
    {
    	 int count=0;
    	    for(int x=101;x<=200;x++){
    	       for(int y=2;y<x;y++){
    	        if(x%y==0){
    	              break;
    	       }
    	       if(y==x-1){
    	      System.out.print(x+",");
    	      count++;    
    	       }    
    	      } 
    	   }
    	     System.out.println("101-200之间一共有"+count+"个素数");
    	} 
    }


*/