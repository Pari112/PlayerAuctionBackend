package com.example.Player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Player1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int playerId;
	private int teamId;
	private String playerName;
	private int playerPrice;
	
	public Player1()
	{
		
	}
	public Player1(int playerId, int teamId, String playerName, int playerPrice) {
		super();
		this.playerId = playerId;
		this.teamId = teamId;
		this.playerName = playerName;
		this.playerPrice = playerPrice;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
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
	

}
