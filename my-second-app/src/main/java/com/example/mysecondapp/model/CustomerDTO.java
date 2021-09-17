package com.example.mysecondapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //переопределит методы equals, hashcode идр
@AllArgsConstructor //создает конструкторы для переменных
public class CustomerDTO {
    private int id;
    private String name;
}
