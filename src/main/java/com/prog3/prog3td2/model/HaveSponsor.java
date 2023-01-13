package com.prog3.prog3td2.model;

import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class HaveSponsor {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private int id;
  @OneToOne
  private Team team;
  @OneToOne
  private Sponsor sponsor;
}
