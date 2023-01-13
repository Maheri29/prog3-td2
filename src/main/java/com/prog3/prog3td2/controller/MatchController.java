package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.controller.mapper.MatchMapper;
import com.prog3.prog3td2.response.MatchResponse;
import com.prog3.prog3td2.service.MatchService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MatchController {
  private final MatchService service;
  private final MatchMapper mapper;

  @GetMapping("/matches")
  public List<MatchResponse> findAll() {
    return service
        .findAll()
        .stream()
        .map(mapper::toRest)
        .toList();
  }
}
