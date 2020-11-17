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
        System.out.println("出栈序列为:"+stack1.pop()+stack1.pop()+stack1.pop()+stack1.pop());
        System.out.println("此时栈顶元素为:"+stack1.peek());
        System.out.println("此时栈中元素的个数为:"+stack1.count);
	}
	 
}
