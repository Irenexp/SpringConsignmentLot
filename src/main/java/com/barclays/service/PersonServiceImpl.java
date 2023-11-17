package com.barclays.service;

import com.barclays.model.Person;
import com.barclays.model.Vehicle;
import com.barclays.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Vehicle> findAllVehiclesOwned(String name) {
        List<Person> personList = personRepository.findByName(name);
        List<Vehicle> vehicles = new ArrayList<>();

        for(Person person : personList) {
            vehicles.addAll(person.getVehiclesOwned());
        }
        return vehicles;
    }
}
