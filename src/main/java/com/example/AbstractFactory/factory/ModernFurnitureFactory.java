package com.example.AbstractFactory.factory;

import com.example.AbstractFactory.furniture.Chair;
import com.example.AbstractFactory.furniture.Sofa;
import com.example.AbstractFactory.furniture.Table;
import com.example.AbstractFactory.furniture.modern.ModernChair;
import com.example.AbstractFactory.furniture.modern.ModernSofa;
import com.example.AbstractFactory.furniture.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

