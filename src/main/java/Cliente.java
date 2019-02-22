/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 * 1
 * 
 */
/**
 * 
 * @author Laura
 * Esta clase se encarga de almacenar los datos de los cientes de la libreria
 */
public class Cliente {
    /**
     * Esta variable se encarga de almacenar la cedula de cada cliente
     */
    private int cedula;
    /**
     * Esta variable se encarga de almacenar el nombre de cada cliente
     */
    private String nombre;
    /**
     * Esta variable se encarga de almacenar la direccion de cada cliente 
     */
    private String direccion;
    /**
     * Esta variable se encarga de almacenat el telefono de cada cliente
     */
    private int telefono;
    /**
     * Esta variable se encarga de almacenar el correo de cada cliete
     */
    private String correo;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
     }
