package com.example.Player.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Playerdto {
	private int teamId;
	private String playerName;
	private int playerPrice;
	private int playerId;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerPrice() {
		return playerPrice;
	}
	public void setPlayerPrice(int playerPrice) {
		this.playerPrice = playerPrice;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public Playerdto()
	{
		
	}
	
	public Playerdto(int teamId, String playerName, int playerPrice, int playerId) {
		super();
		this.teamId = teamId;
		this.playerName = playerName;
		this.playerPrice = playerPrice;
		this.playerId = playerId;
	}
	
     
	
	
}
