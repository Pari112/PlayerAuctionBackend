package com.example.Team.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Team.Entity.Team;

public interface TeamRepository extends JpaRepository<Team,Integer>{

}
