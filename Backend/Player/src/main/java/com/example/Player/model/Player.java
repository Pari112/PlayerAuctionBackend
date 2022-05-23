//package com.example.Player.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="player")
//public class Player {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private long id;
//	@Column(name="player_name")
//	private String playerName;
//	
//	@Column(name="budget_price")
//	private long budgetPrice;
//	
//	@Column(name="team_id")
//	private int teamId;
//	
//	public Player(long id, String playerName, long budgetPrice, int teamId) {
//		super();
//		this.id = id;
//		this.playerName = playerName;
//		this.budgetPrice = budgetPrice;
//		this.teamId = teamId;
//	}
//	public int getTeamId() {
//		return teamId;
//	}
//	public void setTeamId(int teamId) {
//		this.teamId = teamId;
//	}
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getPlayerName() {
//		return playerName;
//	}
//	public void setPlayerName(String playerName) {
//		this.playerName = playerName;
//	}
//	public long getBudgetPrice() {
//		return budgetPrice;
//	}
//	public void setBudgetPrice(long budgetPrice) {
//		this.budgetPrice = budgetPrice;
//	}
//	
//	public Player()
//	{
//		
//	}
//	
//	
//	public Player( String playerName, long budgetPrice) {
//		super();
//		this.playerName = playerName;
//		this.budgetPrice = budgetPrice;
//	}
//	
//	
//
//}
