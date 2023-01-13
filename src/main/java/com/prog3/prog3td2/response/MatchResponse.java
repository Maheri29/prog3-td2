package com.prog3.prog3td2.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class MatchResponse {
  private Integer id;
  private TeamResponse teamA;
  private TeamResponse teamB;
  private LocalDateTime datetime;
}
