package com.example.AbstractFactory.furniture.classic;

import com.example.AbstractFactory.furniture.Chair;

public class ClassicChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating a classic chair");
    }
}
