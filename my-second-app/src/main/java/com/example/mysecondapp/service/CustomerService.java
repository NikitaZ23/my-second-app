package com.example.mysecondapp.service;

import com.example.mysecondapp.model.CustomerDTO;

public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
}
