package com.danigr.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();

        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());


        PlacaBase asus = new PlacaBase();

        asus.setId(1);
        asus.setMarca("ROG Z690");
        asus.setFabricante("ASUS");
        asus.setRanurasram(4);

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());
        System.out.println(asus.getRanurasram());

    }
}
