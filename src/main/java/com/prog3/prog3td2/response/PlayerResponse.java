package com.prog3.prog3td2.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class PlayerResponse {
  private Integer id;
  private String name;
  private String team;
}
