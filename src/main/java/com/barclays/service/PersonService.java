package com.barclays.service;

import com.barclays.model.Vehicle;

import java.util.List;

public interface PersonService {
    List<Vehicle> findAllVehiclesOwned(String name);
}
