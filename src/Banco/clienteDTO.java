/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Hp
 */
public class clienteDTO {
     private Long id;
    private String nombre;
    private String Apellido;
    private String dni;
    
    public clienteDTO(){}

    public clienteDTO(Long id, String nombre, String Apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "clienteDTO{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + ", dni=" + dni + '}';
    }
    
    
    
}
