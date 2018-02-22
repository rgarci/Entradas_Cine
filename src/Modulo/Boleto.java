/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura

Boleto es una superclase de CuentaCliente
 */
package Modulo;

import App.FUNCION;
import java.util.ArrayList;

public class Boleto implements calcularPrecio{
    private Funcion funcion = FUNCION.sele;
    private double precio=65.00;
    private int cantidad = FUNCION.cant;
    private ArrayList<Butaca> asientos = new ArrayList(FUNCION.buts);
    private char tipo = FUNCION.tipo;
    private String tsala= "Tradicional";
    private double total=0;
    private String impresion="";
    private String sinCuenta = "";      //STRING PARA IMPRESIÓN DEL PRECIO TOTAL EN EL TICKET(sin cuenta cliente especial)

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
    
    @Override
    public void calcularPrecio() {
        switch(tipo){
            case '3':
                precio=(precio*1.2);
                tsala="3D";
                break;
            case '4':
                precio = (precio*1.35);
                tsala="4D";
                break;
            default:
                break;
        }
        setTotal(precio*cantidad);
    }
    
    
    public String imprimir(){
        //DATOS DE LOS AUTORES DEL PROGRAMA-EQUIVALENTE A LOS DATOS DE LA SUCURSAL Y DEL EMPLEADO QUE LE ATENDIÓ EN LA COMPRA:
        impresion += "\t*****CINE FMAT*****\n-Facultad de Matemáticas UADY.\n\n-Programación orientada a objetos.\n-Licenciatura en Ingeniería de Software.";
        impresion += "\t\n\nLe atendieron:\n\tEliezer_Fernando_Couoh_Balam\n\tHilda_Beatriz_Cruz_Sanguino\n\tRosaura_Irizell_Garcilazo_Cuevas\n\n";
        //DATOS DE LA FUNCION ELEGIDA:
        impresion += ("\n\n\t*****Función Elegida*****\n");        
        impresion += ("\n\tPelícula: " + funcion.getPelicula());
        impresion += ("\n\tHora: " + funcion.getHora());
        impresion += ("\n\tClasificación: " + funcion.getClasificacion());
        impresion += ("\n\tTipo de Sala: " + tsala);
        impresion += ("\n\tSala: " + funcion.getSala());
        //DATOS DE LOS ASIENTOS ELEGIDOS:
        impresion += ("\n\n\t***Asientos elegidos***\n");
        
        for(int i=0;i<FUNCION.buts.size();i++){
           
            String letra="";
            int fila=FUNCION.buts.get(i).getFila();
            int columna=FUNCION.buts.get(i).getColumna()+1;

            switch(fila){
                case 0: letra="A";
                break;
                case 1: letra="B";
                break;
                case 2: letra="C";
                break;
                case 3: letra="D";
                break;
                case 4: letra="E";
                break;
                default: break;
            }
            impresion+=("\t\t"+letra + "-"+ columna +"\n");
        }
        
        //DATOS GENERALES DEL PRECIO POR UNIDAD Y LA CANTIDAD DE BOLETOS COMPRADOS:
        impresion += ("\n\tCantidad: " + cantidad + " boletos.");
        impresion += ("\n\tPrecio unitario: $ " + precio + "MXN"); 
        
        return impresion; //REGRESA TODO LO ANTERIOR EN UNA SOLA VARIABLE STRING
    }
    
    //MÉTODO QUE IMPRIME (en ticket de compra) EL PRECIO TOTAL CUANDO NO SE TIENE CUENTA ESPECIAL. 
    public String totalSC(){ //precio total sin cuenta cliente
        sinCuenta += ("\n\tTotal: $" + total + "MXN");  
        return sinCuenta;
    }
    
}

