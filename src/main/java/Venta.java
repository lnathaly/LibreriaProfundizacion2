/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Venta {
    private int factura;
    private String fecha;
    private int cedula;
    private int idLibro;
    private int cantidad;
    private double total;

    public Venta(int factura, String fecha, int cedula, int idLibro, int cantidad, double total) {
        this.factura = factura;
        this.fecha = fecha;
        this.cedula = cedula;
        this.idLibro = idLibro;
        this.cantidad = cantidad;
        this.total = total;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void vender(){
        
    }
    
    public void imprimir(){
        
    }
}
