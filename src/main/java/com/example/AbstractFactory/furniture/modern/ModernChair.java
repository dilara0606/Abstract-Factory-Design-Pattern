package com.example.AbstractFactory.furniture.modern;

import com.example.AbstractFactory.furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating a modern chair");
    }
}
