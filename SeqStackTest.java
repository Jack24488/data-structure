package admin;

public class SeqStackTest {
	public static void main(String args[]){
        SeqStack stack1=new SeqStack(50);
        System.out.println("stack1 is empty: "+stack1.isEmpty());
        char ch='a';
        for(int i=0;i<5;i++){
        char str=(char)(ch+i);
        stack1.push(str);}
        System.out.println("stack1 is empty: "+stack1.isEmpty());
        System.out.println("��ջ����Ϊ:"+stack1.pop()+stack1.pop()+stack1.pop()+stack1.pop());
        System.out.println("��ʱջ��Ԫ��Ϊ:"+stack1.peek());
        System.out.println("��ʱջ��Ԫ�صĸ���Ϊ:"+stack1.count);
	}
	 
}
