package com.danigr.pccomponentes;

public class Monitor {

    private Integer id;
    private String marca;
    private String fabricante;
    private String velocidadMaxRefresco;
    private String tamano;
    private String resolucion;


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

    public String getVelocidadMaxRefresco() {
        return velocidadMaxRefresco;
    }

    public void setVelocidadMaxRefresco(String velocidadMaxRefresco) {
        this.velocidadMaxRefresco = velocidadMaxRefresco;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
}
