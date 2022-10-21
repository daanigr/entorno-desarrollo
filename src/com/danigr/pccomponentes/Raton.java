package com.danigr.pccomponentes;

public class Raton {

    private Integer id;
    private String marca;
    private String fabricante;
    private Integer botones;
    private String peso;
    private Integer dpi;


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

    public Integer getBotones() {
        return botones;
    }

    public void setBotones(Integer botones) {
        this.botones = botones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }
}
