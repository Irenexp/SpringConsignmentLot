package com.barclays.service;

import com.barclays.model.Truck;

import java.util.List;

public interface TruckService {

    List<Truck> findAllTrucksOrderedByPrice();
    List<Truck> findTrucksOfSameModel(String model);
}
