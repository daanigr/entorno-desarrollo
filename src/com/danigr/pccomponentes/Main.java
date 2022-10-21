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


        TarjetaGrafica gigabyte = new TarjetaGrafica();

        gigabyte.setId(1);
        gigabyte.setMarca("GeForce RTX 3060");
        gigabyte.setFabricante("Gigabyte");
        gigabyte.setMemoria("12GB");

        System.out.println(gigabyte.getId());
        System.out.println(gigabyte.getMarca());
        System.out.println(gigabyte.getFabricante());
        System.out.println(gigabyte.getMemoria());


        CajaPC msi = new CajaPC();

        msi.setId(1);
        msi.setMarca("MAG Forge");
        msi.setFabricante("MSI");
        msi.setDimensiones("421x210x499mm");

        System.out.println(msi.getId());
        System.out.println(msi.getMarca());
        System.out.println(msi.getFabricante());
        System.out.println(msi.getDimensiones());


        VentiladorCPU tempest = new VentiladorCPU();

        tempest.setId(1);
        tempest.setMarca("Tempest Cooler 4PW");
        tempest.setFabricante("Tempest");
        tempest.setTamano("120mm");

        System.out.println(tempest.getId());
        System.out.println(tempest.getMarca());
        System.out.println(tempest.getFabricante());
        System.out.println(tempest.getTamano());


        DiscoDuro kingston = new DiscoDuro();

        kingston.setId(1);
        kingston.setMarca("A400");
        kingston.setFabricante("Kingston");
        kingston.setTipo("SSD");
        kingston.setCapacidad("240GB");

        System.out.println(kingston.getId());
        System.out.println(kingston.getMarca());
        System.out.println(kingston.getFabricante());
        System.out.println(kingston.getTipo());
        System.out.println(kingston.getCapacidad());


        FuenteDeAlimentacion nox = new FuenteDeAlimentacion();

        nox.setId(1);
        nox.setMarca("Urano VX");
        nox.setFabricante("NOX");
        nox.setPotencia("650W");

        System.out.println(nox.getId());
        System.out.println(nox.getMarca());
        System.out.println(nox.getFabricante());
        System.out.println(nox.getPotencia());


        MemoriaRAM corsair = new MemoriaRAM();

        corsair.setId(1);
        corsair.setMarca("Vengeance LPX");
        corsair.setFabricante("Corsair");
        corsair.setMemoriaInterna("16GB");
        corsair.setTipo("DDR4");

        System.out.println(corsair.getId());
        System.out.println(corsair.getMarca());
        System.out.println(corsair.getFabricante());
        System.out.println(corsair.getMemoriaInterna());
        System.out.println(corsair.getTipo());


        TarjetaSonido creative = new TarjetaSonido();

        creative.setId(1);
        creative.setMarca("Sound Blaster Z");
        creative.setFabricante("Creative");
        creative.setFrecuenciaMax("192KHz");

        System.out.println(creative.getId());
        System.out.println(creative.getMarca());
        System.out.println(creative.getFabricante());
        System.out.println(creative.getFrecuenciaMax());


        GrabadoraDVD asus2 = new GrabadoraDVD();

        asus2.setId(1);
        asus2.setMarca("DRW-24D5MT");
        asus2.setFabricante("Asus");
        asus2.setDimensiones("146x170x41mm");

        System.out.println(asus2.getId());
        System.out.println(asus2.getMarca());
        System.out.println(asus2.getFabricante());
        System.out.println(asus2.getDimensiones());


        Monitor lg = new Monitor();

        lg.setId(1);
        lg.setMarca("27UL500");
        lg.setFabricante("LG");
        lg.setVelocidadMaxRefresco("60Hz");
        lg.setTamano("27 pulgadas");
        lg.setResolucion("3840x2160 pixeles");

        System.out.println(lg.getId());
        System.out.println(lg.getMarca());
        System.out.println(lg.getFabricante());
        System.out.println(lg.getVelocidadMaxRefresco());
        System.out.println(lg.getTamano());
        System.out.println(lg.getResolucion());


        Teclado newskill = new Teclado();

        newskill.setId(1);
        newskill.setMarca("Serike Ivory");
        newskill.setFabricante("Newskill");
        newskill.setTipo("Mecanico");

        System.out.println(newskill.getId());
        System.out.println(newskill.getMarca());
        System.out.println(newskill.getFabricante());
        System.out.println(newskill.getTipo());


        Raton logitech = new Raton();

        logitech.setId(1);
        logitech.setMarca("G102");
        logitech.setFabricante("Logitech");
        logitech.setBotones("6 botones");
        logitech.setPeso("85g");
        logitech.setDpi("8000 dpi");

        System.out.println(logitech.getId());
        System.out.println(logitech.getMarca());
        System.out.println(logitech.getFabricante());
        System.out.println(logitech.getBotones());
        System.out.println(logitech.getPeso());
        System.out.println(logitech.getDpi());


        Altavoces logitech2 = new Altavoces();

        logitech2.setId(1);
        logitech2.setMarca("Multimedia Speaker Z200");
        logitech2.setFabricante("Logitech");
        logitech2.setPotencia("10W");

        System.out.println(logitech2.getId());
        System.out.println(logitech2.getMarca());
        System.out.println(logitech2.getFabricante());
        System.out.println(logitech2.getPotencia());
    }
}
