package com.prog3.prog3td2.service;

import com.prog3.prog3td2.model.Player;
import com.prog3.prog3td2.repository.PlayerRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
  private final PlayerRepository repository;

  public List<Player> findAll() {
    return repository.findAll();
  }
}
