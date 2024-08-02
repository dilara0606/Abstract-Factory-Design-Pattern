package com.example.AbstractFactory.furniture.classic;

import com.example.AbstractFactory.furniture.Sofa;

public class ClassicSofa implements Sofa {
    @Override
    public void create() {
        System.out.println("Creating a classic sofa");
    }
}
