package com.danigr.pccomponentes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Procesador amd = new Procesador();

        /**
         * Código a ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        amd.setId(1);
        amd.setMarca("Raizen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());

        PlacaBase asus = new PlacaBase();

        /**
         * Código a ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */

        asus.setId(1);
        asus.setMarca("ROG Z690");
        asus.setFabricante("ASUS");

        System.out.println(asus.getId());
        System.out.println(asus.getMarca());
        System.out.println(asus.getFabricante());

        PlacaBase msi = new PlacaBase();
        msi.setId(2);
        msi.setMarca("MPG Z490");
        msi.setFabricante("MSI");

        System.out.println(msi.getId();
        System.out.println(msi.getMarca();
        System.out.println(msi.getFabricante());
    }
}
