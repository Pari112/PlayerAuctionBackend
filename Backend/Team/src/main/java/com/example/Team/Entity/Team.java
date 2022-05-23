package com.example.Team.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teamId;
	private String teamName;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getMaxBudget() {
		return maxBudget;
	}
	public void setMaxBudget(int maxBudget) {
		this.maxBudget = maxBudget;
	}
	
	public Team()
	{
		
	}
	public Team(int teamId, String teamName, int maxBudget) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.maxBudget = maxBudget;
	}
	private int maxBudget;
	


}
