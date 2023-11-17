package com.barclays.repository;

import com.barclays.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Integer> {
    List<Car> findAllByOrderByAskingPriceAsc();
    List<Car> findByModel(String model);
}
