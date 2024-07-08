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

public class Eventos {
    private ArrayList<Eventos> cantidadEventos; //Lista de eventos
    private String nombreEvento;
    private String fecha;
    private String lugar;
    private double precioEntradaVip;
    private double precioEntradaGeneral;
    private String seleccionSalon;
    
    
    // Constructor para configurar lo que pondra el usuario para crear el evento
    public Eventos(String nombreEvento){
        this.cantidadEventos = new ArrayList<>();
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.precioEntradaVip = precioEntradaVip;
        this.precioEntradaGeneral = precioEntradaGeneral;
        this.seleccionSalon = seleccionSalon;
    }

    //Metodo para 
        public String getNombreEvento() {
            return nombreEvento;
        }

        public void setNombreEvento(String nombreEvento) {
            this.nombreEvento = nombreEvento;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public double getPrecioEntradaVip() {
            return precioEntradaVip;
        }

        public void setPrecioEntradaVip(double precioEntradaVip) {
            this.precioEntradaVip = precioEntradaVip;
        }

        public double getPrecioEntradaGeneral() {
            return precioEntradaGeneral;
        }

        public void setPrecioEntradaGeneral(double precioEntradaGeneral) {
            this.precioEntradaGeneral = precioEntradaGeneral;
        }

        public String getSeleccionSalon() {
            return seleccionSalon;
        }

        public void setSeleccionSalon(String seleccionSalon) {
            this.seleccionSalon = seleccionSalon;
        }

    public ArrayList<Eventos> getCantidadEventos() {
        return cantidadEventos;
    }

    public void setCantidadEventos(ArrayList<Eventos> cantidadEventos) {
        this.cantidadEventos = cantidadEventos;
    }
        
    
    
    
}
