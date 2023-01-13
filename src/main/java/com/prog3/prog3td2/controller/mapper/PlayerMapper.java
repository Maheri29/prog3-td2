package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Player;
import com.prog3.prog3td2.response.PlayerResponse;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

  public PlayerResponse toRest(Player player) {
    return PlayerResponse.builder()
        .id(player.getId())
        .name(player.getName())
        .team(player.getTeam() == null ? null : player.getTeam().getName())
        .build();
  }
}
