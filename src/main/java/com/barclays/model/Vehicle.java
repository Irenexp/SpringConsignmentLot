package com.barclays.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter

public abstract class Vehicle {
    @Id
    @GeneratedValue
    Integer id;
    String model;
    Integer askingPrice;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Person owner;
}
