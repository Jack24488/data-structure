package admin;

public class Path {           //�Զ���ģ��ͣ������ĵ�·������������ṹʵ��
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
	            throw new RuntimeException("��·��С��������");
	        }
	    }
	    
	    public boolean isEmpty(){   //�жϵ�·���Ƿ�Ϊ��
	        return rear==front;
	    }
	    public boolean add(Car car){   //����ͣ�ڵ�·��
	        if(rear== maxSize){
	            throw new RuntimeException("��·������ͣ���³�");
	        }else{
	            cars[rear++]=car;
	            return true;
	        }
	    }
	    public Car peek(){    
	        if(this.isEmpty()){
	            throw new RuntimeException("��·�쳣");
	        }else{
	            return cars[front];
	        }    
	    }
	    
	    public Car poll(){
	        if(this.isEmpty()){
	            throw new RuntimeException("��·�쳣");
	        }else{
	            Car car = cars[front];  
	            cars[front++] = null;                 
	            return car;
	        }            
	    }
	    
	    public int length(){     //��·��ͣ�ĳ�������
	        return rear-front;
	    }
	}


