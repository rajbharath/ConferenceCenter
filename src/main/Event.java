package main;

public class Event {
	String eventName;
	String startTime;// DD-MM-YYYY-HH-MM format
	String endTime;// DD-MM-YYYY-HH-MM format
	int noOfAttendees;

	public Event(String eventName, String startTime, String endTime,
			int noOfAttendees) {
		this.eventName = eventName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.noOfAttendees = noOfAttendees;
	}

	public String getStartTime() {
		return startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public int getNoOfAttendees() {
		return noOfAttendees;
	}

}
