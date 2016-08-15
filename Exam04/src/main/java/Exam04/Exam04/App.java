package Exam04.Exam04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 
 * 随机生成50个小于100的整数,放入List中,
 * 将List中的 数据除以10,以结果的整数值作为key放入Map中,
 * 得到如 {1=>[11,10,12],2=>[21,24,23]}的Map,
 * 再将Map中key对应的 数组进行排序,得到如{1=>[10,11,12],2=>[21,23,24]}	
 * 输出的形式如下:	随机生成 50 个小于 100 的数,
 * 分别为:	xxx,xxxx,xxxx	
 * Map 中的数据为:	{1=>[11,10,12],2=>[21,24,23]}	
 * 排序后的 Map 为:	{1=>[10,11,12],2=>[21,23,24]}		
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	List<Integer> lists = null;
    	lists = new ArrayList<Integer>();
    	
    	Random r = new Random(System.currentTimeMillis());
    	for(int i=0;i<=50;i++){
    		lists.add(r.nextInt(100));
    	}
    	
    	System.out.println("随机生成 50 个小于 100 的数,分别为：");
    	Map<Integer, Integer[]> map = new HashMap<Integer,Integer[]>();
    	for(int i=0;i<=50;i++){
    		
    			System.out.println(lists.get(i)+", ");
    			
    			Integer[] ger={lists.get(i)};	
    	}
    	
//    	Map<Integer, Integer[]> map = new HashMap<Integer,Integer[]>();
//    	Integer[] ger={lists.get(i)};
    	
    	for(int i =0;i<50;i++){
    		Integer[] ger={lists.get(i)};
    			int j;
				if(lists.get(i)/10 == ger[j])
    				    ger[j]= lists.get(i);	
    			}
    	
        map.put(lists.get(i),lists.get(i)/10);
    	Integer intg = map.get();
    	
    	}
    	
    	//打印lists
    	for(int i=0;i<=lists.size();i++){
    		System.out.println(lists.get(i));
    	}
    	

    	
//        System.out.println( "Hello World!" );
    }
}
