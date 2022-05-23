package com.example.Team.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.Team.Entity.Team;
import com.example.Team.Exception.NoSuchTeamException;
import com.example.Team.Exception.ServiceException;
import com.example.Team.Service.TeamService;
import com.example.Team.Service.TeamServiceImpl;
import com.example.Team.dto.Teamdto;
import com.example.Team.repository.TeamRepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/v2/")
public class TeamController {
	@Autowired
	private TeamServiceImpl teamServiceImpl;
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	 RestTemplate restTemplate;
	
	@PostMapping("/Team")
	public ResponseEntity<Map<String,Object>> insertTeam(@RequestBody Teamdto teamdto){
		Map<String,Object> response=new LinkedHashMap<>();
		response.put("header", "Team");
		response.put("Error", false);
		response.put("message", teamServiceImpl.addTeamToDatabase(teamdto));
		response.put("http",HttpStatus.OK);
		return new ResponseEntity<Map<String,Object>> (response,HttpStatus.OK) ;
		
		}
	
	
//	@GetMapping("/Team/{id}")
//	
//		public Teamdto getTeam(@PathVariable("id") int id )throws ServiceException
//		{
//		
//		Teamdto td= teamServiceImpl.findById(id);
//		return td;
//	}
	
	
	//get team by id restapi
	@GetMapping("/Team/{id}")
	public ResponseEntity<Team>  getPlayerById(@PathVariable int id) {
		Team team=teamRepository.findById(id).
				orElseThrow(()-> new NoSuchTeamException("Player not exist with id" +id));
		     return ResponseEntity.ok(team);
	}
	
	

	
	@GetMapping("/Team")
	public List<Team> getAllTeam()
	{
	return teamRepository.findAll();
}

	

}
