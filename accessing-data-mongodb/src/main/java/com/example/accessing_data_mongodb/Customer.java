package com.example.accessing_data_mongodb;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private Customer() {

    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id = '%s', firstName = '%s', lastName = '%s']",
                id, firstName, lastName
        );
    }
}
