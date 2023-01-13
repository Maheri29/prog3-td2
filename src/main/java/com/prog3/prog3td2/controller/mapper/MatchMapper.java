package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Match;
import com.prog3.prog3td2.response.MatchResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchMapper {
  private final TeamMapper teamMapper;

  public MatchResponse toRest(Match match) {
    return MatchResponse.builder()
        .id(match.getId())
        .datetime(match.getDatetime())
        .teamA(teamMapper.toRest(match.getTeamA()))
        .teamB(teamMapper.toRest(match.getTeamB()))
        .build();
  }
}
