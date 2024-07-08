/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jose Julián
 */

import java.util.ArrayList;

public class Salon {
    private String nombre; // Nombre del salón
    private ArrayList<Zona> zonaVip; // Lista de las zonas VIP
    private ArrayList<Zona> zonaGeneral; // Lista de las zonas generales

    // Constructor para inicializar el salón con un nombre y listas vacías de zonas
    public Salon(String nombre) {
        this.nombre = nombre;
        this.zonaVip = new ArrayList<>();
        this.zonaGeneral = new ArrayList<>();
    }

    // Métodos getters para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Zona> getZonaVip() {
        return zonaVip;
    }

    public ArrayList<Zona> getZonaGeneral() {
        return zonaGeneral;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setZonaVip(ArrayList<Zona> zonaVip) {
        this.zonaVip = zonaVip;
    }

    public void setZonaGeneral(ArrayList<Zona> zonaGeneral) {
        this.zonaGeneral = zonaGeneral;
    }
    
}
