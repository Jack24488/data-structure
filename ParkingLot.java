 package admin;

public class ParkingLot {      //��ջģ��ͣ������ջ��˳��洢�ṹʵ��
	    private Car[] cars;
	    private int top;
	    private Integer maxSize;
	    
	    public Car[] getCars() {
	        return cars;
	    }
	    public ParkingLot(int size) {
	        if (size < 1) {
	            throw new RuntimeException("��������ȷ��ͣ������С");
	        }
	        this.cars = new Car[size];
	        this.maxSize = size;
	        this.top = -1;
	    }
	    public boolean isEmpty() {  //�ж�ͣ�����Ƿ�Ϊ��
	        return top == -1 ;
	    }
	    public int getSize() {
	        return top+1;
	    }
	    public boolean push(Car car) {    //��������ͣ����
	        if (this.top == this.maxSize - 1) {
	            throw new RuntimeException("ͣ�����������޷�ͣ��");
	        } else {
	            this.cars[++top] = car;
	            return true;
	        }
	    }
	    public Car pop() {            //  �����뿪ͣ����
	        if (top == -1) {
	            throw new RuntimeException("ͣ����Ϊ��");
	        } else {
	            return cars[top--];
	        }
	    }
	    
	    public boolean isFull(){     //�ж�ͣ�����Ƿ�����
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
