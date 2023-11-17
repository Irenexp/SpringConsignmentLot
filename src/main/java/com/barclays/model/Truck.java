package com.barclays.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Truck extends Vehicle{
    private Integer payloadCapacity;
}
