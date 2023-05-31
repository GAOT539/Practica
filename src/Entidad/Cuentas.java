/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author GAOT
 */
public class Cuentas {
    private int id;
    private TipoCuenta tipo;
    private double saldo;
    private String Cedula;

    public Cuentas(int id, TipoCuenta tipo, double saldo, String Cedula) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
        this.Cedula = Cedula;
    }

    public Cuentas () {
    }

    public int getId() {
        return id;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
}
