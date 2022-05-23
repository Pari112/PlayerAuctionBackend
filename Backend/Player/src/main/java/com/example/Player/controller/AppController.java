package com.example.Player.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Player.VO.ResponseTemplateVO2;
import com.example.Player.dto.Playerdto;
import com.example.Player.exception.ResourceNotFoundException;
import com.example.Player.model.Player1;
import com.example.Player.repository.PlayerRepository;
import com.example.Player.service.TeamService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AppController {
	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private TeamService teamService;
	
	@Autowired
	RestTemplate restTemplate;
	
	//insert the player
	@PostMapping("/player")
	public ResponseEntity<Map<String,Object>> insertPlayer(@RequestBody Playerdto playerdto){
		Map<String,Object> response=new LinkedHashMap<>();
		response.put("header", "Player data");
		response.put("Error", false);
		response.put("message", teamService.addPlayerToDatabase(playerdto));
		response.put("http",HttpStatus.OK);
		return new ResponseEntity<Map<String,Object>> (response,HttpStatus.OK) ;
		
		}
	
	//@GetMapping("/players")
//	public List<Player> getAllPlayers()
//	{
//		return playerRepository.findAll();
//	}
	@GetMapping("/player")
	public List<Player1> getAllPlayers()
	{
	return playerRepository.findAll();
}
	
	
	
	//get team by id
	@GetMapping("/players/{id}")
	
		public Player1 getTeam(@PathVariable("id") int id )throws ServiceException
		{
		Player1 pd= teamService.findById(id);
		return pd;
	}
	
	
	//assigning team to players
	@PostMapping("/player-assign/{teamId}/{playerId}")
	public ResponseEntity<Map<String,Object>> assignTeamToPlayer(@PathVariable int teamId,@PathVariable int playerId) throws ResourceNotFoundException,ServiceException
	{
		Map<String,Object> response=new LinkedHashMap<>();
		response.put("header", "show data");
		response.put("Error", false);
		response.put("message", teamService.assignPlayerToTeam(teamId,playerId));
		response.put("http",HttpStatus.OK);
		return new ResponseEntity<Map<String,Object>> (response,HttpStatus.OK) ;
	}
	
//	//get player by id
//	@GetMapping("/allPlayerById/{id}")
//	public ResponseTemplateVO2 getPlayers(@PathVariable int id) {
//		ResponseTemplateVO2 c=teamService.getAllPlayersById(id);
//		return c;
//	}
//	
	
	//get player by id restapi
	@GetMapping("/player/{id}")
	public ResponseEntity<Player1>  getPlayerById(@PathVariable int id) {
		Player1 player=playerRepository.findById(id).
				orElseThrow(()-> new ResourceNotFoundException("Player not exist with id" +id));
		     return ResponseEntity.ok(player);
	}
	
	

	
}
