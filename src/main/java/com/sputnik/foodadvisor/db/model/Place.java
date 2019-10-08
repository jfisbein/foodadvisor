package com.sputnik.foodadvisor.db.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
@Entity
public class Place {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @CreatedDate
  private LocalDateTime createdDate;

  @ManyToOne
  private User creator;

  private String name;
  private String address;
  private String phoneNumber;
  private String googlePlacesId;

  @OneToMany
  private List<Review> reviews;

  private Float rating;
  private int reviewsCount = 0;
}
