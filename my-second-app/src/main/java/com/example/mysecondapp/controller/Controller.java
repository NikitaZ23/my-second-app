package com.example.mysecondapp.controller;

import com.example.mysecondapp.model.CustomerDTO;
import com.example.mysecondapp.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@ResponseBody преобразует все данные в JSON
@RestController
@AllArgsConstructor
public class Controller {//Обрабатывает запросы которые приходят на определенный адрес

    private CustomerService customerService;//заинжектим наш бин||сервис, используем интерфейс, чтобы потом можно было поменять на БД класс

    //@RequestMapping //какой тип реквеста мы хотим обрабатывать в данном методе
    @PostMapping //в ней находится рек мап с методом post
    public void addCustomer(@RequestParam int id, @RequestParam String name){//аннотация отвечает за добавление параметров в строку http
        customerService.addCustomer(id, name);
    }//нельзя передавать закрытую информацию

    @GetMapping
    public CustomerDTO getCustomer(@RequestParam int id){
        return customerService.getCustomer(id);
    }

    @GetMapping("/{number}")
    public String sayHello(@PathVariable(name = "number") int number){
        return String.valueOf(number * number);
    }

}


//Сильвет фильтер посмотри