package com.prog3.prog3td2.controller.mapper;

import com.prog3.prog3td2.model.Sponsor;
import com.prog3.prog3td2.model.Team;
import com.prog3.prog3td2.response.SponsorResponse;
import org.springframework.stereotype.Component;

@Component
public class SponsorMapper {
  public SponsorResponse toRest(Sponsor sponsor) {
    return SponsorResponse.builder()
        .id(sponsor.getId())
        .name(sponsor.getName())
        .teams(sponsor
            .getTeams()
            .stream()
            .map(Team::getName)
            .toList())
        .build();
  }
}
