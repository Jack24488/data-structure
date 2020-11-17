package admin;

public class LinkList implements List {
	    public Node head;//��������
	    int count=0;
	   public LinkList(){
	      head=new Node();//Ϊ���������� (public Node head= new Node())
	   }
	   public void CreatLinkListR(int [] a){//β�巨
	      Node head=new Node();
	      Node rear=head;
	      for(int i=0;i<a.length;i++){
	         Node p=new Node(a[i],null);
	         rear.next=p;
	         rear=p;
	      }
	   }
	   public void CreatLinkList(int[] a){ //ͷ�巨
	      Node head=new Node();
	      for(int i=0;i<a.length;i++){
	         Node p=new Node(a[i],null);//����ͷ���
	         p.next=head.next;
	         head.next=p;
	         this.count++;  
	      }
	   }
	   public boolean isEmpty(){
	      return this.head.next==null;
	   }
	   public int size(){
	     Node p= new Node ();
	      p=head.next;
	      int size=0;
	      while(p!=null){
		  p=p.next;
		  size++;
	      } 
	      return size;
	   }
	   public Object get(int i) throws Exception{
	      Node p=head.next;
	      int j=0;
	      while(p!=null&&j<i){
		 p=p.next;
		 j++; 
	      }
	      if(j>i||p==null){
		 throw new Exception("��������");// ����쳣
	      }
	      return p.data;
	   }
	   public void set(int i,Object x){
	      Node p=head.next;
	      int j=0;
	      while(p!=null&&j<i){
	         p=p.next;
		        ++j;
	      }
	      if(j>i||p==null){
		 //throw new Exception("��������");
		 throw new java.lang.IndexOutOfBoundsException("������Χ��");
	      } 
	      p.data=x;
	   }
		
	   public void insert(int i,Object obj) throws Exception{//��i��Ԫ��֮ǰ����
	      Node p=head;
	      int j=-1;
	      while(p!=null&&j<i-1){
		 p=p.next;
	         j++;
	      }
	      if(j>i-1||p==null)
	         throw new Exception("����λ�ò�����");
	      Node q=new Node(obj, p);
	      q.next=p.next;
	      p.next=q;
	   }
	   public Object delete(int i) throws Exception{
	      Node p=head;
	      int j=-1;
	      while(p.next!=null&&j<i-1){
	         p=p.next;
	         j++;
	      }
	      if(j>i-1||p.next==null){
	         throw new Exception("ɾ��λ�ò�����");
	      }
	      Object obj=p.data;
	      p.next=p.next.next;
	      return obj;
	   }
		   
	   public void display(){
	      Node p=head.next;
	      while(p!=null){
	         System.out.print(p.data+" ");
	         p=p.next;
	      }
	      System.out.println();
	   }
	   public int locate(Object obj){
	      Node p=head.next;
	      int j=0;
	      while(p!=null&&!p.data.equals(obj)){
	         p=p.next;
	         j++;
	      }
	      if(p!=null)
	         return j;
	      else
	         return -1;
	   }
	   public void clear(){
	      head.data=null;
	      head.next=null;
	   }
}


		
	


