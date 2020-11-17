package admin;

public final class SeqQueue {
	private Object element[]; 
    private int front,rear;
    public int count=0;
    public SeqQueue(int length){
        if(length<64)
            length=64;
        this.element=new Object[length];
        this.front=this.rear=0;
    }
    public SeqQueue(){
        this(64);
    }
    public boolean isEmpty(){
        return this.front==this.rear;
    } 
    public boolean add(Object x){ 
        if(x==null)
            return false;
        if(this.front==(this.rear+1)%this.element.length){
            Object[] temp=this.element;         
            this.element=new Object[temp.length*2];
            int j=0;
            for(int i=this.front;i!=this.rear;i=(i+1)%temp.length)
                this.element[j++]=temp[i];
            this.front=0;
            this.rear=j;
            
        }
        this.count++;
        this.element[this.rear]=x;
        this.rear=(this.rear+1)%this.element.length;
    	return true;
    } 
    public Object peak(){
        //return this.isEmpty()?null:(Object)this.element[this.front];
    	if(this.isEmpty())
      	  return null;
        else{
      	  return (Object)this.element[this.front];
        }
    }
    public Object poll(){ //³ö¶Ó
        if(this.isEmpty()) 
            return null;
        Object temp=(Object)this.element[this.front];
        this.count--;
        this.front=(this.front+1)%this.element.length;
        
        return temp;
    }
    public String toString(){
        StringBuffer strbuf=new StringBuffer(this.getClass().getName()+"( ");
        for(int i=this.front;i!=this.rear;i=(i+1)%this.element.length)
            strbuf.append(this.element[i].toString()+",");
        strbuf.setCharAt(strbuf.length()-1,')');
        return new String(strbuf);
    }
}       


