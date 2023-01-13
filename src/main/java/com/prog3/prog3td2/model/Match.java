package com.prog3.prog3td2.model;

import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "play_against")
public class Match {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private int id;
  @ManyToOne
  @JoinColumn(name = "id_home")
  private Team teamA;
  @ManyToOne
  @JoinColumn(name = "id_opponent")
  private Team teamB;
  private LocalDateTime datetime;
  private String stadium;
}
