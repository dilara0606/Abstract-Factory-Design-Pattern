package com.example.AbstractFactory.furniture.modern;

import com.example.AbstractFactory.furniture.Table;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Creating a modern table");
    }
}