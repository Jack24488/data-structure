package admin;

public class Path {           //以队列模拟停车场外的道路，队列以链表结构实现
	    private Car[] cars;
	    private int maxSize=0; 
	    private int front;  
	    private int rear; 	    	    
	    public Car[] getCars() {
	        return cars;
	    }
	    public int getMaxSize() {
	        return maxSize;
	    }
	    public int getFront() {    
	        return front;
	    }
	    public int getRear() {
	        return rear;
	    }
	    public Path(int size){     
	        if(this.maxSize >=0){
	            this.maxSize = size;
	            this.cars = new Car[size];
	            front = rear =0;
	        }else{
	            throw new RuntimeException("道路大小设置有误");
	        }
	    }
	    
	    public boolean isEmpty(){   //判断道路上是否为空
	        return rear==front;
	    }
	    public boolean add(Car car){   //车辆停在道路上
	        if(rear== maxSize){
	            throw new RuntimeException("道路已满，停不下车");
	        }else{
	            cars[rear++]=car;
	            return true;
	        }
	    }
	    public Car peek(){    
	        if(this.isEmpty()){
	            throw new RuntimeException("道路异常");
	        }else{
	            return cars[front];
	        }    
	    }
	    
	    public Car poll(){
	        if(this.isEmpty()){
	            throw new RuntimeException("道路异常");
	        }else{
	            Car car = cars[front];  
	            cars[front++] = null;                 
	            return car;
	        }            
	    }
	    
	    public int length(){     //道路上停的车辆总数
	        return rear-front;
	    }
	}


