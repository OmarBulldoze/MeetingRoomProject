package org.Ads.MeetingRoomManager.Entities;

import java.io.Serializable;
import java.util.List;

public class Team  implements Serializable{
	
	public long teamID;
	public String teamName;
	List<Employee> Employees;
	
	
	
	public long getTeamID() {
		return teamID;
	}

	public void setTeamID(long teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public List<Employee> getEmployees() {
		return Employees;
	}

	public void setEmployees(List<Employee> employees) {
		Employees = employees;
	}

	public Team(String teamName, List<Employee> employees) {
		super();
		this.teamName = teamName;
		Employees = employees;
	}

}
