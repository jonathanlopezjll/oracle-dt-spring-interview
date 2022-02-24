package com.oracle.opa.interview.review.domain.persistence.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Person owner;

    @Embedded
    private Address address;

    @Embedded
    private Price price;

    public House(Person owner, Address address, Price price) {
        this.owner = owner;
        this.address = address;
        this.price = price;
    }

    public House() {}

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}