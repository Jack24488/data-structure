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
        System.out.println("����Ԫ��Ϊ:"+que.peak());
        System.out.println("��������Ϊ:"+que.poll()+que.poll()+que.poll()+que.poll()+que.poll());
        System.out.println("��ʱ������Ԫ�صĸ���Ϊ:"+que.count);
        
        
	}
}
