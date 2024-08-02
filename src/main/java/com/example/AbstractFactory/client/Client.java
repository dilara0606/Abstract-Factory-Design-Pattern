package com.example.AbstractFactory.client;

import com.example.AbstractFactory.factory.ClassicFurnitureFactory;
import com.example.AbstractFactory.factory.FurnitureFactory;
import com.example.AbstractFactory.factory.ModernFurnitureFactory;
import com.example.AbstractFactory.furniture.Chair;
import com.example.AbstractFactory.furniture.Sofa;
import com.example.AbstractFactory.furniture.Table;

public class Client {
    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void createFurniture() {
        Chair chair = furnitureFactory.createChair();
        Table table = furnitureFactory.createTable();
        Sofa sofa = furnitureFactory.createSofa();

        chair.create();
        table.create();
        sofa.create();
    }

}
