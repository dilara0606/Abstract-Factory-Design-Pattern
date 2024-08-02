package com.example.AbstractFactory.factory;

import com.example.AbstractFactory.furniture.Chair;
import com.example.AbstractFactory.furniture.Sofa;
import com.example.AbstractFactory.furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
