package com.barclays.service;

import com.barclays.model.Car;
import com.barclays.model.Vehicle;
import com.barclays.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService{
    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> findAllVehiclesOrderedByPrice() {
        return vehicleRepository.findByOrderByAskingPriceAsc();
    }
}
