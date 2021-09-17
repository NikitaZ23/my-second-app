package com.example.mysecondapp.service.impl;

import com.example.mysecondapp.model.CustomerDTO;
import com.example.mysecondapp.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustServMemory implements CustomerService { //класс отвечает за сохранение данных. за место нее надо бд делать
    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}

//Надо пометить наш сервис как БИН. Есть 3 способа: 1. Пометить в xml 2.Написать в отдельном конфигурационном файле 3. Пометить как сервис
