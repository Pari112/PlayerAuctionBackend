//package com.example.Player.controller;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.Player.exception.ResourceNotFoundException;
//import com.example.Player.model.Player;
//import com.example.Player.repository.PlayerRepository;
//@CrossOrigin(origins="http://localhost:4200")
//@RestController
//@RequestMapping("/api/v1/")
//public class PlayerController {
//	
//	@Autowired
//	private PlayerRepository playerRepository;
//	
//	@GetMapping("/players")
//	public List<Player> getAllPlayers()
//	{
//		return playerRepository.findAll();
//	}
//	
//	//create player restapi
//	@PostMapping("/players")
//	public Player createPlayer(@RequestBody Player player)
//	{
//	
//		Player p = playerRepository.save(player);
//		
//		return p;
//		
//	}
//	
//	//get player by id restapi
//	@GetMapping("/players/{id}")
//	public ResponseEntity<Player>  getPlayerById(@PathVariable Long id) {
//		Player player=playerRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Player not exist with id" +id));
//		     return ResponseEntity.ok(player);
//	}
//	
//	
//	//update player restapi
//	@PutMapping("/players/{id}")
//	public ResponseEntity<Player> updatePlayer(@PathVariable Long id,@RequestBody Player playerDetails)
//	{
//		Player player=playerRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Player not exist with id" +id));
//		player.setPlayerName(playerDetails.getPlayerName());
//		player.setBudgetPrice(playerDetails.getBudgetPrice());
//		Player updatePlayer=playerRepository.save(player);
//		     return ResponseEntity.ok(updatePlayer);
//	}
//	
//	//delete player restapi
//	@DeleteMapping("/players/{id}")
//	public ResponseEntity<Map<String,Boolean>> deletePlayer(@PathVariable Long id){
//		Player player=playerRepository.findById(id).
//				orElseThrow(()-> new ResourceNotFoundException("Player not exist with id" +id));
//		playerRepository.delete(player);
//		Map<String,Boolean> response=new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return ResponseEntity.ok(response);
//	}
//	
//
//}
