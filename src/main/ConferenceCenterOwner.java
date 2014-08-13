package main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ConferenceCenterOwner {
	List<ConferenceRoom> conferenceRooms;
	List<Date> nonOperationalDates = Collections.emptyList();

	public ConferenceCenterOwner() {
		initializeConferenceRooms();
	}

	private void initializeConferenceRooms() {
		conferenceRooms = new ArrayList<ConferenceRoom>();
		for (int i = 1; i <= 10; i++) {
			conferenceRooms.add(new ConferenceRoom("Room" + i));
		}

	}

	public boolean addNonOperationalDate(Date date) {
		return nonOperationalDates.add(date);
	}

	public boolean removeNonOperationalDate(Date date) {
		return nonOperationalDates.remove(date);
	}


	private boolean isOperationalBetween(Date startDate, Date endDate) {
		//TO DO logic for finding operational between start date and end date
		return true;
	}

	public Plan getPlan(Conference conference) {
		//TO DO iterate through the events in the conference for getting available rooms
		return null;
	}

	private List<ConferenceRoom> getAvailableRooms(Event event) {
		//TO DO finds the available rooms for each event in the conference
		return null;
	}

}
