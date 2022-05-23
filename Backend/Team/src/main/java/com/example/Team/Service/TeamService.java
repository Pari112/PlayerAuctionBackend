package com.example.Team.Service;

import com.example.Team.dto.Teamdto;

public interface TeamService {
	
	public String addTeamToDatabase(Teamdto teamdto);
	public Teamdto findById(int id);

}
