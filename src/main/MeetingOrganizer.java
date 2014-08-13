package main;

public class MeetingOrganizer {

	public static void main(String[] args) {

		Conference conference = new Conference("Hackathon", "13-08-2014-09-00",
				"15-08-2014-12-00");
		Event event1 = new Event("event 1", "13-08-2014-09-00",
				"15-08-2014-12-00", 40);
		conference.addEvent(event1);
		
		ConferenceCenterOwner conferenceCenterOwner = new ConferenceCenterOwner();

		Plan plan = conferenceCenterOwner.getPlan(conference);

		// TODO print the plan
	}

}
