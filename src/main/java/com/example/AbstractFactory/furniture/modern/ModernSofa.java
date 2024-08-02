package com.example.AbstractFactory.furniture.modern;

import com.example.AbstractFactory.furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Creating a modern sofa");
    }
}
