package com.example.explorecalijpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.explorecalijpa.model.Difficulty;
import com.example.explorecalijpa.model.Tour;
import com.example.explorecalijpa.model.Region;

public interface TourRepository extends JpaRepository<Tour, Integer> {
  List<Tour> findByDifficulty(Difficulty diff);
  List<Tour> findByRegion(Region region);
  List<Tour> findByTitle(String title);
  List<Tour> findByTourPackageCode(String code);
}