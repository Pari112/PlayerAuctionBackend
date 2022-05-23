package com.example.Team.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NoSuchTeamException extends RuntimeException {
	
	public NoSuchTeamException(String message)
	{
		super(message);
	}
	
	

}
