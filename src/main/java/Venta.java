/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 * @version 1
 * Esta clase sen encarga de almacenar los datos de las ventas realizadas en la libreria 
 */

public class Venta {
    /**
     * En esta variable se almacena el codigo de la venta realizada 
     */
   private int idVenta;
   /**
    * En esta variable se almacena el codigo de la factura
    */
   private int factura;
   /**
    * En esta variable se almacena el codigo del libro vendido
    */
   private int idLibro;
   /**
    * En esta variable se almacena la cantidad de libros vendidos
    */
   private int cantidad;
   /**
    * En esta variable se almacena el total de la venta realizada
    */ 
   private double total;

    public Venta(int idVenta, int factura, int idLibro, int cantidad, double total) {
        this.idVenta = idVenta;
        this.factura = factura;
        this.idLibro = idLibro;
        this.cantidad = cantidad;
        this.total = total;
    }
   
    /**
     * Con este metodo se puede identificar cual es el libro mas vendido
     */
    
   public void consulMasVend (){
       
   }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
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
   
   
   
}
