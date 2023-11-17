package com.barclays.service;

import com.barclays.model.Truck;
import com.barclays.repository.TruckRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckServiceImpl implements TruckService{

    private final TruckRepository truckRepository;

    public TruckServiceImpl(TruckRepository truckRepository) {
        this.truckRepository = truckRepository;
    }

    @Override
    public List<Truck> findAllTrucksOrderedByPrice() {
        return truckRepository.findAllByOrderByAskingPriceAsc();
    }

    @Override
    public List<Truck> findTrucksOfSameModel(String model) {
        return truckRepository.findByModel(model);
    }
}
