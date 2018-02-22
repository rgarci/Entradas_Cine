/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura
*/

package Modulo;

import App.FUNCION;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class BoletoEspecial extends Boleto{
    
    private String impresionE;
    Cliente cli = new Cliente("", "", "", Date.valueOf(LocalDate.MAX));
    private String conCuenta = "";
    private double totalE;

    @Override
    public void calcularPrecio() {
        super.calcularPrecio();
        totalE = (super.getTotal()*.7); //^^PRECIO TOTAL CON DESCUENTO DEL 30%
    }
    public int comprobar(String matri){
        ArrayList<String> linea = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        int resultado=0;
        try{
            
            FileInputStream fis = new FileInputStream("clientes.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>) ois.readObject();
            
            for(int i=0; i<clientes.size();i++){
                if(clientes.get(i).getMat().equals(matri)){
                    resultado=1;
                    cli = clientes.get(i);
                }
            }
            ois.close();
        }
        catch(FileNotFoundException e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
        catch(IOException e2){
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        catch(ClassNotFoundException e3){
            JOptionPane.showMessageDialog(null, e3.getMessage());
        }
        return resultado;
    }

    @Override
    public String imprimir() {
        //IMPRIME LOS DATOS DE LA FUNCIÓN HEREDADOS DE LA SUPERCLASE 'Boleto' E IMPRIME LOS DATOS DE LA CUENTA
        impresionE += ("\n\n\t*****Cuenta Invitado especial*****\n");        
        impresionE += ("\n\tNombre del alumno: " + cli.getNombre()+" "+cli.getApellido());
        impresionE += ("\n\tMatrícula: " + cli.getMat());
        impresionE += ("\n\nNOTA: Al invitado especial se le aplica\nun 30% de descuento en su compra final.\n");
        return super.imprimir() + impresionE; 
    }
    //MÉTODO QUE IMPRIME  (en ticket de compra) EL PRECIO TOTAL CUANDO SE TIENE CUENTA ESPECIAL. 
    public String totalCC(){ //precio total con cuenta especial
        conCuenta += ("\n\tTotal: $" + (totalE) + "MXN");  
        return conCuenta;
    }
}
