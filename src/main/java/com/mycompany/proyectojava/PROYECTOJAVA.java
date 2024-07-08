/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectojava;

import javax.swing.JOptionPane;
import Clases.Login;
import Clases.Usuario;
import Clases.Salon;
import Clases.Zona;
import Clases.Eventos;

public class PROYECTOJAVA {

    public static void main(String[] args) {
        
        Login login = new Login();

        do {
            String opcion = JOptionPane.showInputDialog(null, "Ingrese una opción:\n"
                    + "1.- Iniciar sesión\n"
                    + "2.- Registrarse\n"
                    + "3.- Salir\n");
            switch (opcion) {
                case "1":
                    boolean autenticado = false;
                    Usuario usuarioAutenticado = null;
                    do {
                        String nombreUsuario = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                        String contraseña = JOptionPane.showInputDialog(null, "Digite su contraseña");
                        usuarioAutenticado = login.autenticacion(nombreUsuario, contraseña);
                        if (usuarioAutenticado != null) {
                            autenticado = true;
                            System.out.println("¡Inicio de sesión exitoso!");
                            do {
                                String opcion2 = JOptionPane.showInputDialog(null, "Ingrese una opción:\n"
                                        + "1.- Gestionar salón\n"
                                        + "2.- Gestionar zonas\n"
                                        + "3.- Registrar eventos\n"
                                        + "4.- Visualizar eventos\n"
                                        + "5.- Salir");
                                switch (opcion2) {
                                    case "1":
                                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del salón:");
                                        Salon nuevoSalon = new Salon(nombre);
                                        System.out.println("Este es el salón: " + nuevoSalon.getNombre());
                                        break;
                                    case "2":
                                        //Gestionar zonas es para el avance #2
                                       
                                        break;
                                    case "3":
                                        String nombreEvento = JOptionPane.showInputDialog(null, "Ingrese el nombre del evento que desea crear:");
                                        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del evento DD/MM/AA: ");
                                        String lugar = JOptionPane.showInputDialog(null, "Ingrese el lugar del evento:");
                                        double precioEntradaVip = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la entrada VIP:"));
                                        double precioEntradaGeneral = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la entrada general:"));
                                        String seleccionSalon = JOptionPane.showInputDialog(null, "Ingrese el nombre del salon que desea utilizar para este evento");
                                        Eventos nuevoEvento = new Eventos(nombreEvento);
                                        System.out.println("Evento creado exitosamente");
                                        break;
                                    case "4":
                                        System.out.println("Los eventos disponibles son: "+ for);
                                        
                                        break;
                                    case "5":
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Opción inválida. Inténtalo nuevamente.");
                                        break;
                                }
                            } while (true);
                        } else {
                            System.out.println("Credenciales incorrectas. Inténtalo nuevamente.");
                        }
                    } while (!autenticado);
                    break;
                case "2":
                    Login registrar = new Login();
                    Usuario nuevoUsuario = new Usuario("nombreUsuario", "contraseña", "rol");
                nuevoUsuario.setnombreUsuario(JOptionPane.showInputDialog(null, "Digite su nombre de usuario"));
                nuevoUsuario.setcontraseña(JOptionPane.showInputDialog(null, "Digite su contraseña"));
                nuevoUsuario.setrol(JOptionPane.showInputDialog(null, "Digite su rol (USUARIO O ADMIN)"));
                registrar.registrarUsuario();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (true);
    }
}