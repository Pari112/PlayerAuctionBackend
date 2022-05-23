package com.example.Player.service;

import java.util.List;

import com.example.Player.VO.ResponseTemplateVO2;
import com.example.Player.dto.Playerdto;
import com.example.Player.model.Player1;

public interface TeamService {
	public String addPlayerToDatabase(Playerdto playerdto);
	public Player1 findById(int id);
	public Object assignPlayerToTeam (int teamId,int playerId);
	public ResponseTemplateVO2 getAllPlayersById(int teamId);
	public List<Player1> findByTeamId(int id);
	

}
