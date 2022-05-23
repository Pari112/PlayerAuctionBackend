package com.example.Player.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Player.model.Player1;

public interface PlayerRepository extends JpaRepository<Player1,Integer> {
	
	public List<Player1> findByTeamId(int teamId);
		
	

}
