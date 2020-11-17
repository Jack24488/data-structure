package admin;

import java.util.Scanner;

public class LinkListTest1{
	private static Scanner  reader;
	public static void main (String args[]) throws Exception{
		LinkList list = new LinkList();
		 final int y=10;
		int [] a = new int [5];
		 for(int k=0;k<=4;k++){
			a[k]=(int)(Math.random()*100)+1;
		}
		list.CreatLinkList(a);//调用头插法
		System.out.println("逆序显示单链表的全部元素:");
	     list.display();
	    list.CreatLinkListR(a);//调用尾插法
	    System.out.println("顺序显示单链表的全部元素:");
	     list.display();
	     int length =list.size();	   
	     System.out.println("单链表长度为:"+length);	 
	     reader = new Scanner(System.in);
	     System.out.println("请输入0-4之内任意一个整数");
	       int n= reader.nextInt();
	       System.out.println("单链表中次序为"+n+"的数是:"+a[n]);//头插入得到的单链表
	       int max=a [0],min=a [0];
        for (int i=0;i<=a.length-1;i++){//求链表中的最大元素和最小元素
        	if(max<a[i]){
        		max=a[i];
        	}
        	if(min>a[i]){
        		min=a[i];
        	}
        }	
         System.out.println("单链表中最大元素："+max);
    	 System.out.println("单链表中最小元素："+min);
    	    int sum = 0;
         for(int x :a){//求链表元素的平均值
        	sum = sum+x;  
        }
          System.out.println("链表元素的平均值是"+(double)sum/a.length);
            int sum1=0;
          for(int x :a){
        	  sum1=sum1+x;
          }
         System.out.println("单链表元素的累加和为:"+sum1);     
 	     list.delete(1);	    	    
         list.display();
	     list.insert(1,y);	        
	     list.display();
         int index=list.locate(a[2]);
          System.out.println("index="+index); 
         list.set(1,y);
         list.display();
         System.out.println(list.isEmpty());
	}
}	
         
        	 
         
       
        
        
	

	
        
	          	
	   
        		

        		
        	
        	
        
        
        
           
	    		
	    
	    	
	
	     
	 
	
	
		
		
		


