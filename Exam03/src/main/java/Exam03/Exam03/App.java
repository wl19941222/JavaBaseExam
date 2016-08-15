package Exam03.Exam03;

import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天
 * 请输入日期
 * 你输入的日期为当年的第**天
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
		  System.out.print("请输入年份：");
		  int year = s.nextInt();
		  System.out.print("请输入月份：");
		  int month = s.nextInt();
		  System.out.print("请输入日期：");
		  int day = s.nextInt();
		  
		  int sum = 0;
		  month = month-1;
		  
		  for(int m=month; m>0; m--){
			  
			  if(m==1||m==3||m==5||m==7||m==8||m==10){
				  sum += 31;				  
			  }
			  
			  else if(m==2){
				  if((year%400==0)||(year%4==0)&&(year%100!=0)){
					  sum += 29;
				  }else{
					  sum += 28;
				  }
			 }
			  
			  else{
					  sum += 30;
				  }
			  
			  }
		  
		  sum += day;
		  System.out.println( "你输入的日期为当年的第"+sum+"天！" );  
		  
		  
		  }
    }

