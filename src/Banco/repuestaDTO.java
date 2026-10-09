/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Hp
 */
public class repuestaDTO <T> {
    private boolean exito;
    private String mensaje;
    private T datos;
    
    public repuestaDTO(){}

    public repuestaDTO(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }

    @Override
    public String toString() {
        return "repuestaDTO{" + "exito=" + exito + ", mensaje=" + mensaje + ", datos=" + datos + '}';
    }
   

    
}
