package com.example.AbstractFactory;

import com.example.AbstractFactory.client.Client;
import com.example.AbstractFactory.factory.ClassicFurnitureFactory;
import com.example.AbstractFactory.factory.FurnitureFactory;
import com.example.AbstractFactory.factory.ModernFurnitureFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);

		FurnitureFactory modernFactory = new ModernFurnitureFactory();
		Client modernClient = new Client(modernFactory);
		modernClient.createFurniture();

		FurnitureFactory classicFactory = new ClassicFurnitureFactory();
		Client classicClient = new Client(classicFactory);
		classicClient.createFurniture();
	}

}
