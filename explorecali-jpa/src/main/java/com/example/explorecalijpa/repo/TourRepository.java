package com.example.explorecalijpa.repo;

import java.util.List;
import java.util.Optional;

import com.example.explorecalijpa.model.ShowTourProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Difficulty;
import com.example.explorecalijpa.model.Tour;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Override the default PATH of /tours to /tour
 */
@RepositoryRestResource(collectionResourceRel = "tours", path = "tour")
public interface TourRepository extends JpaRepository<Tour, Integer>  {
  List<Tour> findByDifficulty(Difficulty diff);
  List<Tour> findByTourPackageCode(String code);
  Optional<ShowTourProjection> findByDifficultyAndPrice(Difficulty diff, Integer price);

//  ShowTourProjection findFirstByTourPackageCodeProjection(String code);

//  List<Tour> findProjectionByTourPackageCode(String tourPackageCode);
}