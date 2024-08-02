package com.example.AbstractFactory.factory;

import com.example.AbstractFactory.furniture.Chair;
import com.example.AbstractFactory.furniture.Sofa;
import com.example.AbstractFactory.furniture.Table;
import com.example.AbstractFactory.furniture.classic.ClassicChair;
import com.example.AbstractFactory.furniture.classic.ClassicSofa;
import com.example.AbstractFactory.furniture.classic.ClassicTable;

public class ClassicFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
