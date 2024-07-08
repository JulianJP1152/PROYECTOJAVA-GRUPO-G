/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Jose Julián
 */
public class Usuario {
    
    private String nombreUsuario;
    private String contraseña;
    private String rol; // se refiere al admin o al usuario.
    
    // Constructor para configurar lo que pondra el usuario: su nombre, contraseña y su roll
    public Usuario(String nombreUsuario, String contraseña, String rol){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    //Getters para acceder a los metodos privados
    public void setnombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public void setcontraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public void setrol(String rol){
        this.rol = rol;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public String getRol() {
        return rol;
    }
}
