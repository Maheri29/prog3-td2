package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Sponsor;
import com.prog3.prog3td2.model.Team;
import com.prog3.prog3td2.response.TeamResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamMapper {
  private final PlayerMapper playerMapper;

  public TeamResponse toRest(Team team) {
    return TeamResponse.builder()
        .id(team.getId())
        .name(team.getName())
        .sponsors(team.getSponsors().stream().map(Sponsor::getName).toList())
        .players(team.getPlayers().stream().map(playerMapper::toRest).toList())
        .build();
  }
}
