/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergi
 */
public class Zona {
    private String tipo; // Aquí se escoge si es VIP o General
    private int espacios; // Aquí se ingresa el número de espacios para el VIP
    private int filas; // Aquí se ingresa el número de filas
    private int columnas; // Aquí se ingresa el número de columnas para la sección general
    private char[][] mapa; // Aquí se va a utilizar "A" para Asiento y "P" para pasillo

    // Constructor para inicializar una zona VIP
    public Zona(String tipo, int espacios) {
        this.tipo = tipo;
        this.espacios = espacios;
        this.filas = 1; // Zona VIP tiene una sola fila
        this.columnas = espacios; // Zona VIP tiene espacios en una fila
        this.mapa = new char[filas][columnas];
        // Configurar los espacios para los asientos
        for (int i = 0; i < espacios; i++) {
            this.mapa[0][i] = 'A';
        }
    }

    // Constructor para inicializar una zona General con filas y columnas
    public Zona(String tipo, int filas, int columnas) {
        this.tipo = tipo;
        this.filas = filas;
        this.columnas = columnas;
        this.mapa = new char[filas][columnas];
        // Configurar el espacio de los asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.mapa[i][j] = 'A';  //Configurar cada posición del mapa como asiento 
            }
        }
    }

    // Getters para obtener el tipo de zona
    public String getTipo() {
        return tipo;
    }

    // Getter para obtener el mapa
    public char[][] getMapa() {
        return mapa;
    }

    // Método para asignar el tipo de espacio, ya sea "A" o "P" usando una posición específica
    public void asignarEspacio(int fila, int columna, char tipo) {
        this.mapa[fila][columna] = tipo;
    }
}
