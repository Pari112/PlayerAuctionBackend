package com.example.Player.VO;

import java.util.List;

import com.example.Player.model.Player1;

public class ResponseTemplateVO2 {
	private Team team;
	private List<Player1> player;
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public List<Player1> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player1> player) {
		this.player = player;
	}

}
