package com.prog3.prog3td2.repository;

import com.prog3.prog3td2.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
