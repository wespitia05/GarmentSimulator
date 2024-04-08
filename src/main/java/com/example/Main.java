package com.example;

// driver class of the garmentsimulator project
public class Main {
    // main method will create instances of garment factories for different
    // clothing, then uses the factories to create the different garments for
    // each type of clothing
    public static void main(String[] args) {
        // creates garment factories for each garment
        GarmentFactory prof = new ProfessionalGarmentFactory();
        GarmentFactory cas = new CasualGarmentFactory();
        GarmentFactory party = new PartyGarmentFactory();

        // creates instances of professional garments for each clothing item
        Garment professionalTop = prof.createTop();
        Garment professionalPants = prof.createPants();
        Garment professionalShoes = prof.createShoes();
        // creates instances of casual garments for each clothing item
        Garment casualTop = cas.createTop();
        Garment casualPants = cas.createPants();
        Garment casualShoes = cas.createShoes();
        // creates instances of party garments for each clothing item
        Garment partyTop = party.createTop();
        Garment partyPants = party.createPants();
        Garment partyShoes = party.createShoes();

        // prints outfit for professional
        System.out.println("wearing professional outfit: ");
        professionalTop.wear();
        professionalPants.wear();
        professionalShoes.wear();
        // prints outfit for casual
        System.out.println("\nwearing casual outfit: ");
        casualTop.wear();
        casualPants.wear();
        casualShoes.wear();
        // prints outfit for party
        System.out.println("\nwearing party outfit: ");
        partyTop.wear();
        partyPants.wear();
        partyShoes.wear();
    }
}