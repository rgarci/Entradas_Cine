/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura
*/

package Modulo;

import java.io.Serializable;

public class Butaca implements Serializable{
    private int fila;
    private int columna;

    public Butaca(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    @Override
    public String toString() {
        return "Butaca{" + "fila=" + fila + ", columna=" + columna + '}';
    }
    
    
}
