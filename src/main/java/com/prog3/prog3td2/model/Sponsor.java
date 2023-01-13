package com.prog3.prog3td2.model;

import static jakarta.persistence.GenerationType.IDENTITY;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sponsor {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private int id;
  @JsonIgnoreProperties("sponsors")
  @ManyToMany(mappedBy = "sponsors")
  private List<Team> teams;
  @Column(name = "\"name\"")
  private String name;
}
