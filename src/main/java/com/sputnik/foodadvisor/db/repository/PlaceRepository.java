package com.sputnik.foodadvisor.db.repository;

import com.sputnik.foodadvisor.db.model.Place;
import com.sputnik.foodadvisor.db.model.User;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlaceRepository extends PagingAndSortingRepository<Place, Long> {

  List<Place> findByCreator(User creator);
}
