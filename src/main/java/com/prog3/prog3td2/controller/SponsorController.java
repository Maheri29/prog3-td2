package com.prog3.prog3td2.controller;

import com.prog3.prog3td2.controller.mapper.SponsorMapper;
import com.prog3.prog3td2.response.SponsorResponse;
import com.prog3.prog3td2.service.SponsorService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SponsorController {
  private final SponsorService service;
  private final SponsorMapper mapper;

  @GetMapping("/sponsors")
  public List<SponsorResponse> findAll() {
    return service.findAll()
        .stream().map(mapper::toRest).toList();
  }
}
