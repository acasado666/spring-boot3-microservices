package com.example.explorecalijpa.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "showTourSummary", types = Tour.class)
public interface ShowTourProjection {
    String getDifficulty();

    Integer getPrice();


    default String projectionToString() {
        return "Projection{" +
                "price=" + getPrice() +
                ", difficulty=" + getDifficulty() +
                '}';
    }
}
//curl -X 'GET' \
//        'http://localhost:8080/tour/search/findByDifficultyAndPrice?diff=Easy&price=750' \
//        -H 'accept: application/hal+json'