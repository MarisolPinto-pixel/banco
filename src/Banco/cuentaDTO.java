/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Hp
 */
public class cuentaDTO {
    private Long id;
    private String nrcuenta;
    private Double saldo;

    public cuentaDTO() {
    }

    public cuentaDTO(Long id, String nrcuenta, Double saldo) {
        this.id = id;
        this.nrcuenta = nrcuenta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public String getNrcuenta() {
        return nrcuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "cuentaDTO{" + "id=" + id + ", nrcuenta=" + nrcuenta + ", saldo=" + saldo + '}';
    }
    
    
}
