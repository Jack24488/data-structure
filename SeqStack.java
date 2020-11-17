package admin;

public class SeqStack {
	 private Object element[];
	 private int top;
	 int count=0;
	 public SeqStack(int size){
	      this.element=new Object[Math.abs(size)];
	      this.top=-1;
	 }
	 public SeqStack(){
	      this(64);
	 }
	 public boolean isEmpty(){
	      return this.top==-1;
	    } 
	 public void push(Object x){
	      if(x==null)
	        return; 
	      if(this.top==element.length-1){
	        Object[] temp=this.element;         
	        this.element=new Object[temp.length*2];
	        for(int i=0;i<temp.length;i++)
	          this.element[i]=temp[i];
	        
	      }
	      this.top++;
	      this.count++;
	      this.element[this.top]=x;
	    } 
	 public Object pop(){
	      //return this.top==-1?null:(Object)this.element[this.top--];
	      if(this.top==-1)
	    	  return null;
	      else{
	    	  this.count--;
	    	  return (Object)this.element[this.top--];
	    	  
	      }
	    }
	 public Object peek(){
	      //return this.top==-1?null:(Object)this.element[this.top];
	      if(this.top==-1)
	        return null;
	      else{
	        return (Object)this.element[this.top];
	      }
	    }
	 public String toString(){
	      String str="(";  
	      if(this.top!=-1)
	        str+=this.element[this.top].toString();
	      for(int i=this.top-1;i>=0;i--)
	        str+=", "+this.element[i].toString();
	      return str+")";
	    }
	    public Object clear (){
	    	return this.top=-1;
	    }
   }


	    		
    	
	    



