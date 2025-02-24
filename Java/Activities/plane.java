package activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
	private List<String> passengers;
	private int maxpassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	public plane(int maxpassengers){
		this.maxpassengers=maxpassengers;	
		this.passengers=new ArrayList<>();
		
	}

	public List<String> getPassesngers() {
		return passengers;
	}

	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}

	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}

	public Date takeoff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}

	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}
}
