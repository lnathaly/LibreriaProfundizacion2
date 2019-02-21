/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Inventario {
    private int inventario;
    private int idLibro;
    private int cantidad;
    private double precio;
    private int minimo;

    public Inventario(int inventario, int idLibro, int cantidad, double precio, int minimo) {
        this.inventario = inventario;
        this.idLibro = idLibro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.minimo = minimo;
    }

    

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
        
    public void agregarLibro(){
        
    }
    
    public void editarLibro(){
        
    }
    
    public void eliminarLibro(){
        
    }
    
    public void consultarLibro(){
        
    }
    public void consultarInven(){
        
    }
    
    public void consultarCostoso(){
        
    }
    
    public void consultarBarato(){
        
    }
    
    
}
