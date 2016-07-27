package org.Ads.MeetingRoomManager.Entities;

import java.io.Serializable;
import java.util.Collection;

public class Employee implements Serializable{
	public long empid ;
	public String firstName;
	public String lastName;
	public String userName;
	public String password;
	public String email;
	public Employee supEmployee;
	public Collection<Team> team;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee getSupEmployee() {
		return supEmployee;
	}

	public void setSupEmployee(Employee supEmployee) {
		this.supEmployee = supEmployee;
	}

	public Collection<Team> getTeam() {
		return team;
	}

	public void setTeam(Collection<Team> team) {
		this.team = team;
	}
	
	

}
