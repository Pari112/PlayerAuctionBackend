package com.example.Team.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Team.Entity.Team;
import com.example.Team.Exception.NoSuchTeamException;
import com.example.Team.Exception.ServiceException;
import com.example.Team.dto.Teamdto;
import com.example.Team.repository.TeamRepository;
@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	private TeamRepository teamRepository;
	
	public String addTeamToDatabase(Teamdto teamdto) {
		Team team=new Team();
		team.setTeamId(teamdto.getTeamId());
		team.setTeamName(teamdto.getTeamName());
		team.setMaxBudget(teamdto.getMaxBudget());
		teamRepository.save(team);
		return "inserted";
		
	}
	
	
	
	
	
	
	public Teamdto findById(int id)  {
		Team team;
		try {
			team=teamRepository.findById(id).orElseThrow(()->new NoSuchTeamException ("No Team exist"));
		}
		catch(NoSuchTeamException e)
		{
			throw new ServiceException(e.getMessage());
			
		}
		
		Teamdto teamdto=new Teamdto();
		teamdto.setTeamId(team.getTeamId());
		teamdto.setTeamName(team.getTeamName());
		teamdto.setMaxBudget(team.getMaxBudget());
		return teamdto;
	}

}
