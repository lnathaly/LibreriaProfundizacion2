/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 * @version 
 * Esta clase se encarga de almacenar la cantidad de libros
 */

public class Inventario {
    /**
     * En esta variable se almacena el codigo del inventario correspondiente 
     */
    private int inventario;
    /**
     * Esta variable se encarga de almacenar el codigo del libro
     */
    private int idLibro;
    /**
     * Esta variable se encarga de almacenar la cantidad de libros de respectivo inventario
     */
    private int cantidad;
    /**
     * Esta variable se encarga de almacenar el precio de determinado libro
     */
    private double precio;
    /**
     * Esta variable se encarga de almacenar el minimo de libros de cada libro que debe haber en el inventario
     */
    private int minimo;

    public Inventario(int inventario, int idLibro, int cantidad, double precio, int minimo) {
        this.inventario = inventario;
        this.idLibro = idLibro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.minimo = minimo;
    }

    /**
     * Este metodo se encarga de agregar un nuevo libro al inventario 
     */
    public void agregarLibro(){
        
    }
    /**
     * Mediante este metodo se puede editar los datos de determinado libro
     */
    public void editarLibro(){
        
    }
    /**
     * Mediante este metodo se puede eliminar un libro
     */
    public void eliminarLibro(){
        
    }
    //Mediante este metodo se puede Consultar un libro
    public void consultarLibro(){
        
    }
    //Mediante este metodo se puede Consultar la lista de libros del inventario 
    public void consultarInven(){
        
    }
    /**
     * mediante este metodo se puede consultar cual es el libro mas costoso del inventario
     */
    public void consultarCostoso(){
        
    }
    /**
     * Mediante este metodo podermos consultar cual es el libro mas economico del inventario
     */
    public void consultarBarato(){
        
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
    
   
    
}
