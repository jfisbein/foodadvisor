package com.sputnik.foodadvisor.db.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreatedDate
  private LocalDateTime createdDate;

  private String name;

  @OneToMany(mappedBy = "creator")
  private List<Place> createdPlaces;

  @OneToMany(mappedBy = "author")
  private List<Review> reviews;
}
