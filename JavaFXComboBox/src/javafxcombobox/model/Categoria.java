/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxcombobox.model;

/**
 *
 * @author Victor
 */
public class Categoria {
    
    private int id;
    private String cidade;
    private double irradiacao;
    private double lat;
    private double longit;

    public Categoria(int id, String nome, double lat, double longit,double irradiacao) {
        this.id = id;
        this.cidade = nome;
        this.irradiacao = irradiacao;
        this.lat = lat;
        this.longit = longit;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIrradiacao() {
        return irradiacao;
    }

    public void setIrradiacao(double irradiacao) {
        this.irradiacao = irradiacao;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongit() {
        return longit;
    }

    public void setLongit(double longit) {
        this.longit = longit;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public String toString(){
        return getCidade();
    }
    
}
