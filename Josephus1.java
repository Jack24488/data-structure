package admin;
import java.util.Scanner;
public class Josephus1 {
	    private static Scanner scanner;
		static class Node{
	         int m;
	         Node next;
	         Node(int v){
	             m=v;
	             }
	     }
	     public static void main(String[] args) {
	    	 scanner = new Scanner(System.in);
	    	 System.out.println("������������N!");
	    	 int N= scanner.nextInt(); 
	    	 System.out.println("�����뱨����M!");
	    	 int M= scanner.nextInt();      
	         Node n=new Node(1);//ͷ�ڵ㵥�г����������γ�ѭ������ 
	         Node x=n;
	         for(int i=2;i<=N;i++)
	        	 x=(x.next=new Node(i));//������������
	             x.next=n;//���һ���ڵ��nextָ���һ���ڵ㣬�γ�ѭ������
	         System.out.println("��Ȧ��˳��Ϊ:");
	         while(x!=x.next){
	             for(int i=1;i<M;i++)
	                 x=x.next;
	                        //��ʱx�ǽ����еĽڵ��ǰһ���ڵ�
	             System.out.print(x.next.m+" ");
	             x.next=x.next.next;
	         }
	         System.out.println();
	         System.out.println("�����Ҵ���˵�λ����: "+x.m);
	     }
	 }


