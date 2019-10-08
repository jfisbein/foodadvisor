package com.sputnik.foodadvisor.db.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

@Data
@Entity
public class Review {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @CreatedDate
  private LocalDateTime createdDate;

  @ManyToOne
  private User author;

  private int rating;

  private String comment;
}
