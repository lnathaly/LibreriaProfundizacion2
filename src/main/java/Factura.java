/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Esta clase se encarga de lamacenar la factura de cada venta realizada
 * @author Laura
 * @version 1
 */

public class Factura {
    /**
     * En esta variable se almacena el numero de factura correspondiente 
     */
    private int factura;
    /**
     * En esta variable se almacena la fecha de la factura
     */
    private String fecha;
    /**
     * en esta varia ble se almacena el numero de cedula del cliente
     */
    private int cedula;
    /**
     * en esta variable se almacena el codigo de la respectiva venta 
     */
    private int idVenta;

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

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
       
}
