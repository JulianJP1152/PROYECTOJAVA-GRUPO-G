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

public class Login {
    

    private ArrayList<Usuario> usuarios;

    // Constructor que inicializa la lista de usuarios e incluye un usuario admin
    public Login() {
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new Usuario("admin", "admin", "admin")); 
        // El primer "admin" corresponde al nombre de usuario, el segundo a la contraseña y el tercero al rol
    }

    // Método para autenticar un usuario dado su nombre de usuario y contraseña
    public Usuario autenticacion(String nombreUsuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contrasena)) {
                return usuario; // Devuelve el usuario si coincide el nombre de usuario y la contraseña
            }
        }
        return null; // Si no encuentra un usuario que coincida, devuelve null
    }

    // Método para registrar un nuevo usuario
    public void registrarUsuario(String nombreUsuario, String contraseña, String ro) {
        this.usuarios.add(new Usuario(nombreUsuario, contraseña, rol));
    }
}
