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
		list.CreatLinkList(a);//����ͷ�巨
		System.out.println("������ʾ�������ȫ��Ԫ��:");
	     list.display();
	    list.CreatLinkListR(a);//����β�巨
	    System.out.println("˳����ʾ�������ȫ��Ԫ��:");
	     list.display();
	     int length =list.size();	   
	     System.out.println("��������Ϊ:"+length);	 
	     reader = new Scanner(System.in);
	     System.out.println("������0-4֮������һ������");
	       int n= reader.nextInt();
	       System.out.println("�������д���Ϊ"+n+"������:"+a[n]);//ͷ����õ��ĵ�����
	       int max=a [0],min=a [0];
        for (int i=0;i<=a.length-1;i++){//�������е����Ԫ�غ���СԪ��
        	if(max<a[i]){
        		max=a[i];
        	}
        	if(min>a[i]){
        		min=a[i];
        	}
        }	
         System.out.println("�����������Ԫ�أ�"+max);
    	 System.out.println("����������СԪ�أ�"+min);
    	    int sum = 0;
         for(int x :a){//������Ԫ�ص�ƽ��ֵ
        	sum = sum+x;  
        }
          System.out.println("����Ԫ�ص�ƽ��ֵ��"+(double)sum/a.length);
            int sum1=0;
          for(int x :a){
        	  sum1=sum1+x;
          }
         System.out.println("������Ԫ�ص��ۼӺ�Ϊ:"+sum1);     
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
         
        	 
         
       
        
        
	

	
        
	          	
	   
        		

        		
        	
        	
        
        
        
           
	    		
	    
	    	
	
	     
	 
	
	
		
		
		


