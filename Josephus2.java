package admin;

import java.util.Scanner;
public class Josephus2{
		     private static Scanner scanner;
			public static void main(String[] args) {
		    	 scanner = new Scanner(System.in);
		    	 System.out.println("������������!");
		    	 int number=scanner.nextInt();
		    	 System.out.println("��������ʼλ��!");
		    	 int start=scanner.nextInt();
		    	 System.out.println("��������ֹλ��!");
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
		         //������ʼλ��
		         int i=start; 
		        //�Ҳ��distance�����Ԫ��
		          while (list.length()>1) {
		             //�������distance��Ԫ��
		              i=(i+distance-1)%list.length();
		              System.out.print("ɾ��"+list.remove(i).toString()+" ");
		              list.display();
		          }
		          System.out.println("����ʣ�µ���:"+list.get(0).toString());
		      }
}
