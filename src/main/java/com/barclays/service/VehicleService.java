package com.barclays.service;

import com.barclays.model.Car;
import com.barclays.model.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAllVehiclesOrderedByPrice();
}
