/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura
*/

package Modulo;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable{
    private String nombre;
    private String mat;
    private String apellido;
    private Date cumple;

    public Cliente(String nombre, String mat, String apellido, Date cumple) {
        this.nombre = nombre;
        this.mat = mat;
        this.apellido = apellido;
        this.cumple = cumple;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCumple(Date cumple) {
        this.cumple = cumple;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMat() {
        return mat;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getCumple() {
        return cumple;
    }

    @Override
    public String toString() {
        return getNombre() + "_" + getMat() + "_" + getApellido() + "_" + getCumple() ;
    }
    
   
    
}
