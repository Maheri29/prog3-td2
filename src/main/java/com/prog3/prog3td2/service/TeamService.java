package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.Team;
import com.prog3.prog3td2.repository.TeamRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TeamService {
  private final TeamRepository repository;

  public List<Team> findAll() {
    return repository.findAll();
  }
}
