package com.example.AbstractFactory.furniture.classic;

import com.example.AbstractFactory.furniture.Table;

public class ClassicTable implements Table {
    @Override
    public void create() {
        System.out.println("Creating a classic table");
    }
}
