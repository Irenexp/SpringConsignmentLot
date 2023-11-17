package com.barclays.service;

import com.barclays.model.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCarsOrderedByPrice();
    List<Car> findCarsOfSameModel(String model);
}
