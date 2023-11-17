package com.barclays.repository;

import com.barclays.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
    List<Vehicle> findByOrderByAskingPriceAsc();
}
