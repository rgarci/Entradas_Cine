/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura

La classe Funcion calcula todos los datos elegidos por el cliente para
que la clase Boleto pueda calcular el precio total de acuerdo las variables
establecidas.
 */

package Modulo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Funcion implements Serializable{
    private String pelicula;
    private String hora;
    private String clasificacion;
    private String sala;
    
    
    public ArrayList<Butaca> butacas = new ArrayList();
    
    //CONSTRUCTOR
    public Funcion(String pelicula, String hora, String clasificacion, String sala) {
        setPelicula(pelicula);
        setHora(hora);
        setClasificacion(clasificacion);
        setSala(sala);
    }
    //METODOS GET Y SET
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }

    public void setButacas(ArrayList<Butaca> butacas) {
        this.butacas = butacas;
    }
    
   
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nPelícula: " + getPelicula() + "\nHora: " + getHora() + "\nClasificacion: " + getClasificacion() + "\nSala: " + getSala();
    }
    
    
    
}
