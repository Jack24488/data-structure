package admin;

public class SeqQueueTest {
	public static void main(String args[]){
        SeqQueue que=new SeqQueue();
        System.out.println("que is Empty:"+que.isEmpty());
        char ch='a';
        for(int i=0;i<5;i++){
         char str=(char)(ch+i);
          que.add(str);
        }
        System.out.println("que is Empty:"+que.isEmpty());
        System.out.println("队首元素为:"+que.peak());
        System.out.println("出队序列为:"+que.poll()+que.poll()+que.poll()+que.poll()+que.poll());
        System.out.println("此时队列中元素的个数为:"+que.count);
        
        
	}
}
