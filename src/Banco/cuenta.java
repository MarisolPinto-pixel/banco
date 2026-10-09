/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Hp
 */
public class cuenta {
    private Long id;
    private String nrcuenta;
    private Double saldo;
    
    public cuenta(){}

    public cuenta(Long id, String nrcuenta, Double saldo) {
        this.id = id;
        this.nrcuenta = nrcuenta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrcuenta() {
        return nrcuenta;
    }

    public void setNrcuenta(String nrcuenta) {
        this.nrcuenta = nrcuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
