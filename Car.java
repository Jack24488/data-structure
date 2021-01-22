package admin;

public class Car {              //车辆类
	    String id;
	    private long reachTime;
	    private long leaveTime;
	    
	    public String getId() {  //车辆牌照
	        return id;
	    }
	    public void setId(String id) {      
	        this.id = id;
	    }
	    public long getReachTime() {      //车辆到达时间
	        return reachTime;
	    }
	    public void setReachTime(long reachTime) {
	        this.reachTime = reachTime;
	    }
	    public long getLeaveTime() {       //车辆离开时间
	        return leaveTime;
	    }
	    public void setLeaveTime(long leaveTime) {    
	        this.leaveTime = leaveTime;
	    }
	    
	}


