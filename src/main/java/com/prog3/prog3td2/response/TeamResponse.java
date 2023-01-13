package com.prog3.prog3td2.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class TeamResponse {
  private Integer id;
  private String name;
  private List<String> sponsors;
  private List<PlayerResponse> players;
}
