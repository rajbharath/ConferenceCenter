package main;

import java.util.Date;
import java.util.List;

public class ConferenceRoom {
	String roomName;
	BookingHistory bookingHistory;
	Integer capacity;
	List<Date> maintenanceDates;

	public ConferenceRoom(String roomName) {
		this.roomName = roomName;
		bookingHistory = new BookingHistory();
	}

	public boolean isAvailableFor(Event event) {
		//TO DO find whether the room is available for this event or not
		return false;
	}
}

class BookingHistory {
	List<Event> bookedEvents;

	public void book(Event event) {
		bookedEvents.add(event);
	}

	public void cancelBooking(Event event) {
		bookedEvents.remove(event);
	}

	public boolean isAnyOverLappingEventFor(Event inputEvent) {
		//TO DO find whether booked events has any event in the time of inputevent
		return false;
	}
}
