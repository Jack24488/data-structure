package admin;

import java.util.Scanner;
public class Josephus2{
		     private static Scanner scanner;
			public static void main(String[] args) {
		    	 scanner = new Scanner(System.in);
		    	 System.out.println("请输入总人数!");
		    	 int number=scanner.nextInt();
		    	 System.out.println("请输入起始位置!");
		    	 int start=scanner.nextInt();
		    	 System.out.println("请输入终止位置!");
		    	 int distance=scanner.nextInt();
                 Josephus(number,start,distance);
		      }		    
			public  static void Josephus(int number,int start,int distance) {
		         System.out.println
		         ("Josephus("+number+","+start+","+distance+"),");
		         SeqList list =new SeqList(number);		         
		        for (int i = 0; i < number; i++) {
		        	 list.insert(i, i);		             //list.insert(i,(char)('A'+i)+"");
		          }		         
		         list.display();
		         //计算起始位置
		         int i=start; 
		        //找差别distance距离的元素
		          while (list.length()>1) {
		             //处决间隔distance的元素
		              i=(i+distance-1)%list.length();
		              System.out.print("删除"+list.remove(i).toString()+" ");
		              list.display();
		          }
		          System.out.println("最终剩下的是:"+list.get(0).toString());
		      }
}
