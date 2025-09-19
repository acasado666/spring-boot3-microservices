package com.example.explorecalijpa.business;

import java.util.List;
import java.util.Optional;

import com.example.explorecalijpa.model.*;
import org.springframework.stereotype.Service;

import com.example.explorecalijpa.repo.TourPackageRepository;
import com.example.explorecalijpa.repo.TourRepository;

@Service
public class TourService {
    private TourPackageRepository tourPackageRepository;
    private TourRepository tourRepository;

    public TourService(TourPackageRepository tourPackageRepository, TourRepository tourRepository) {
        this.tourPackageRepository = tourPackageRepository;
        this.tourRepository = tourRepository;
    }

    public Tour createTour(String tourPackageName, String title,
                           String description, String blurb, Integer price, String duration,
                           String bullets, String keywords, Difficulty difficulty, Region region) {

        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName)
                .orElseThrow(() -> new RuntimeException("Tour Package not found for id:" + tourPackageName));
        return tourRepository.save(new Tour(title, description, blurb,
                price, duration, bullets, keywords, tourPackage, difficulty, region));
    }

    public List<Tour> lookupByDifficulty(Difficulty difficulty) {
        return tourRepository.findByDifficulty(difficulty);
    }

    public List<Tour> lookupByPackage(String tourPackageCode) {
        return tourRepository.findByTourPackageCode(tourPackageCode);
    }

    public Optional<ShowTourProjection> lookupByProjection(Difficulty difficulty, Integer price) {
        var byDifficultyAndPrice = Optional.ofNullable(tourRepository.findByDifficultyAndPrice(difficulty, price));
        return byDifficultyAndPrice.get().stream().findFirst();
    }

//    public List<ShowTourProjection> lookupByProjection(Difficulty difficulty, Integer price) {
//        return tourRepository.findByDifficultyAndPrice(difficulty, price);
//    }

//  public Optional<ShowTourProjection> findNameProjectionFirst(String tourPackageCode) {
//    return java.util.Optional.ofNullable(tourRepository.findFirstByTourPackageCodeProjection(tourPackageCode));
//  }

    public long total() {
        return tourRepository.count();
    }
}
