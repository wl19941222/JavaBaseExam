package Exam02.Exam02;

import java.util.Scanner;

/**
 *工资个人所得税的计算
 *输入工资
 *要缴纳的税费
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner s = new Scanner(System.in);
		  System.out.print("请输入工资：");
		  int salary = s.nextInt();
		  
		  double tax = 0;
		  if(salary<1500){
			  tax = salary*0.03;
			  System.out.println("需要缴纳的税费为："+tax);		  
		  }
		  else if(1500<salary && salary<4500){
			  tax = salary*0.1;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		  else if(4500<salary && salary<9000){
			  tax = salary*0.2;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		  else if(9000<salary && salary<35000){
			  tax = salary*0.25;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		  else if(35000<salary && salary<55000){
			  tax = salary*0.3;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		  else if(55000<salary && salary<80000){
			  tax = salary*0.35;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		  else {
			  tax = salary*0.45;
			  System.out.println("需要缴纳的税费为："+tax);	
		  }
		     	
//        System.out.println( "Hello World!" );
    }
}
