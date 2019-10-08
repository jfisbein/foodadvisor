package com.sputnik.foodadvisor.service;

import com.sputnik.foodadvisor.db.model.Place;
import com.sputnik.foodadvisor.db.repository.PlaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlacesService {

  private final PlaceRepository placeRepository;

  public Iterable<Place> getAll() {
    return placeRepository.findAll(Sort.by("rating").descending());
  }

  public Place save(Place place) {
    return placeRepository.save(place);
  }
}
