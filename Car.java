package admin;

public class Car {              //������
	    String id;
	    private long reachTime;
	    private long leaveTime;
	    
	    public String getId() {  //��������
	        return id;
	    }
	    public void setId(String id) {      
	        this.id = id;
	    }
	    public long getReachTime() {      //��������ʱ��
	        return reachTime;
	    }
	    public void setReachTime(long reachTime) {
	        this.reachTime = reachTime;
	    }
	    public long getLeaveTime() {       //�����뿪ʱ��
	        return leaveTime;
	    }
	    public void setLeaveTime(long leaveTime) {    
	        this.leaveTime = leaveTime;
	    }
	    
	}


