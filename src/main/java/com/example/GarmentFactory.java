package com.example;

// garmentFactory interface represents creation
// of different garments
public interface GarmentFactory {
    // creates new instance of top garment
    Garment createTop();
    // creates new instance of pants garment
    Garment createPants();
    // creates new instance of shoes garment
    Garment createShoes();
}
