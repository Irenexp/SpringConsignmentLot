package com.barclays.service;

import com.barclays.model.Car;
import com.barclays.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllCarsOrderedByPrice(){
        return carRepository.findAllByOrderByAskingPriceAsc();
    }

    @Override
    public List<Car> findCarsOfSameModel(String model) {
        return carRepository.findByModel(model);
    }
}
