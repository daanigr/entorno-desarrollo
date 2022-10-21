package com.danigr.pccomponentes;

public class TarjetaSonido {

    private Integer id;
    private String marca;
    private String fabricante;
    private String memoria;
    private String frecuenciaMax;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getFrecuenciaMax() {
        return frecuenciaMax;
    }

    public void setFrecuenciaMax(String frecuenciaMax) {
        this.frecuenciaMax = frecuenciaMax;
    }
}
