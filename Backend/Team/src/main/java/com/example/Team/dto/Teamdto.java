package com.example.Team.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Teamdto {
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
	
	public Teamdto()
	{
		
	}
	public Teamdto(int teamId, String teamName, int maxBudget) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.maxBudget = maxBudget;
	}
	private int maxBudget;
	

}
