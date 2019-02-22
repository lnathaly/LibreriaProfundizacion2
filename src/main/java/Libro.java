/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 * @version 1
 * Esta clase se encarga de almacenar los datos de cada libro 
 */

public class Libro {
    /**
     * Esta variable se encarga de almacenar el codigo de cada libro
     */
    private int idLibro;
    /**
     * Esta variable se encarga de almacenar el nombre de cada libro
     */
    private String nombre;
    /**
     * Esvariable se encarga de almacenar el autor de cada libro 
     */
    private String autor;
    /**
     * Esta variable se encarga de almacenar la editorial de cada libro
     */
    private String editorial;
    /**
     * Esta variable se almacena el precio de cada libro
     */
    private double precio;
    /**
     * Constructor de recibe los parametros minimos para ejecutar los metodos de la clase libro
     * @param idLibro
     * @param nombre
     * @param autor
     * @param editorial
     * @param precio 
     */
    public Libro(int idLibro, String nombre, String autor, String editorial, double precio) {
        this.idLibro = idLibro;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }     
}
