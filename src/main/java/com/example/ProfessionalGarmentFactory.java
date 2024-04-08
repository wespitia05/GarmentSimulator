package com.example;

// this class is a child of GarmentFactory and is responsible for
// creating professional garments
public class ProfessionalGarmentFactory implements GarmentFactory {
    // creates new instance of a professional top
    public Garment createTop() {
        // returns the top with the type of garment: professional
        return new Tops("Professional");
    }
    // creates new instance of professional pants
    public Garment createPants() {
        // returns the pants with the type of garment: professional
        return new Pants("Professional");
    }
    // creates new instance of professional shoes
    public Garment createShoes() {
        // returns the shoes with the type of garment: professional
        return new Shoes("Professional");
    }
}

