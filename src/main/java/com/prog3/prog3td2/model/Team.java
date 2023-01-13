package com.prog3.prog3td2.model;

import static jakarta.persistence.GenerationType.IDENTITY;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
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
public class Team {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private int id;
  @Column(name = "\"name\"")
  private String name;
  @JsonIgnoreProperties("teams")
  @ManyToMany
  @JoinTable(
      name = "have_sponsor",
      joinColumns = @JoinColumn(name = "id_team", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "id_sponsor", referencedColumnName = "id")
  )
  private List<Sponsor> sponsors;
  @OneToMany(mappedBy = "team")
  @OrderBy("number")
  private List<Player> players;
}
