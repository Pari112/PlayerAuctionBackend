package com.example.Player.service;

import java.util.List;

import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Player.VO.ResponseTemplateVO2;
import com.example.Player.VO.Team;
import com.example.Player.dto.Playerdto;
import com.example.Player.exception.NoSuchPlayerException;
import com.example.Player.model.Player1;
import com.example.Player.repository.PlayerRepository;
@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String addPlayerToDatabase(Playerdto playerdto) {
		Player1 player=new Player1();
		player.setPlayerId(playerdto.getPlayerId());
		player.setPlayerName(playerdto.getPlayerName());
		player.setPlayerPrice(playerdto.getPlayerPrice());
		playerRepository.save(player);
		return "inserted";
	}
	
	public Player1 findById(int id)  {
		Player1 player;
		try {
			player=playerRepository.findById(id).orElseThrow(()->new NoSuchPlayerException ("No Player exist"));
		}
		catch(NoSuchPlayerException e)
		{
			throw new ServiceException(e.getMessage());
			
		}
		
		return player;
		
//		Teamdto teamdto=new Teamdto();
//		teamdto.setTeamId(team.getTeamId());
//		teamdto.setTeamName(team.getTeamName());
//		teamdto.setMaxBudget(team.getMaxBudget());
//		return teamdto;
	}
	//max budget
	public Object assignPlayerToTeam (int teamId,int playerId) throws NoSuchPlayerException{
	
		Optional<Player1> pd=playerRepository.findById(teamId);
		String url="http://team-service/ts/team/";
		Team t1=restTemplate.getForObject(url+teamId, Team.class);
		List<Player1> c=playerRepository.findByTeamId(teamId);
		int sum=0;
		for(Player1 c1:c) {
			sum=sum+c1.getPlayerPrice();
		System.out.println(sum);
		System.out.println(c1.getPlayerId());
		}
		
		if(sum<t1.getMaxBudget()) {
			Player1 player=playerRepository.findById(playerId).get();
			sum=sum+player.getPlayerPrice();
			if(sum<=t1.getMaxBudget()) {
				player.setTeamId(teamId);
				playerRepository.save(player);
				return "assigned";
			}
		}
		
		
		else {
			return "not assigned";
		}
		return "not assigned";
		
	}
	
	
	//get players by id
	public ResponseTemplateVO2 getAllPlayersById(int teamId) {
		String url="http://team-service/ts/team/";
		Team t1=restTemplate.getForObject(url+teamId, Team.class);
		List<Player1> c=playerRepository.findByTeamId(teamId);
		ResponseTemplateVO2 v=new ResponseTemplateVO2();
		v.setTeam(t1);
		v.setPlayer(c);
		return v;
		
	}
	
	public List<Player1> findByTeamId(int id)
	{
		List<Player1> b= playerRepository.findByTeamId(id);
		return b;
	}
	

}
