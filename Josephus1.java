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
	    	 System.out.println("请输入总人数N!");
	    	 int N= scanner.nextInt(); 
	    	 System.out.println("请输入报的数M!");
	    	 int M= scanner.nextInt();      
	         Node n=new Node(1);//头节点单列出来，方便形成循环链表 
	         Node x=n;
	         for(int i=2;i<=N;i++)
	        	 x=(x.next=new Node(i));//建立单向链表
	             x.next=n;//最后一个节点的next指向第一个节点，形成循环链表
	         System.out.println("出圈的顺序为:");
	         while(x!=x.next){
	             for(int i=1;i<M;i++)
	                 x=x.next;
	                        //此时x是将出列的节点的前一个节点
	             System.out.print(x.next.m+" ");
	             x.next=x.next.next;
	         }
	         System.out.println();
	         System.out.println("最终幸存的人的位置是: "+x.m);
	     }
	 }


