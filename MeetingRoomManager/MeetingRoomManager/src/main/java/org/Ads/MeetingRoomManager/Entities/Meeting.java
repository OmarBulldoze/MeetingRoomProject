package org.Ads.MeetingRoomManager.Entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Meeting  implements Serializable{
	
	public MeetingInitiator meetingInitiator; 
	public List<Employee> partipants;
	public Date preferredDate ;
	

}
