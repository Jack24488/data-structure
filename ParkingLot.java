 package admin;

public class ParkingLot {      //以栈模拟停车场，栈以顺序存储结构实现
	    private Car[] cars;
	    private int top;
	    private Integer maxSize;
	    
	    public Car[] getCars() {
	        return cars;
	    }
	    public ParkingLot(int size) {
	        if (size < 1) {
	            throw new RuntimeException("请输入正确的停车场大小");
	        }
	        this.cars = new Car[size];
	        this.maxSize = size;
	        this.top = -1;
	    }
	    public boolean isEmpty() {  //判断停车场是否为空
	        return top == -1 ;
	    }
	    public int getSize() {
	        return top+1;
	    }
	    public boolean push(Car car) {    //车辆进入停车场
	        if (this.top == this.maxSize - 1) {
	            throw new RuntimeException("停车场已满，无法停车");
	        } else {
	            this.cars[++top] = car;
	            return true;
	        }
	    }
	    public Car pop() {            //  车辆离开停车场
	        if (top == -1) {
	            throw new RuntimeException("停车场为空");
	        } else {
	            return cars[top--];
	        }
	    }
	    
	    public boolean isFull(){     //判断停车场是否已满
	        return top==maxSize-1;
	    }
	    
	    public Car getCar(String carId) {
	        for(int i=0;i<this.getSize();i++) {
	            if(carId.equals(cars[i].getId())) {
	                return cars[i];
	            }
	        }
	        return null;
	    }
}
