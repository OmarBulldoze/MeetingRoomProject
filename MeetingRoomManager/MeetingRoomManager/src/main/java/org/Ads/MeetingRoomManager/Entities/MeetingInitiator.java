package org.Ads.MeetingRoomManager.Entities;

import java.util.List;

public class MeetingInitiator extends Employee{
	
	public List<Meeting> meetings;
	
	
	
	public MeetingInitiator(String firstName, String lastName)
	{
		super(firstName,lastName);
	}

}
