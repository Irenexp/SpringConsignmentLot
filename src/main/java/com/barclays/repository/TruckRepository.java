package com.barclays.repository;

import com.barclays.model.Car;
import com.barclays.model.Truck;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TruckRepository extends CrudRepository<Truck, Integer> {
    List<Truck> findAllByOrderByAskingPriceAsc();
    List<Truck> findByModel(String model);
}
