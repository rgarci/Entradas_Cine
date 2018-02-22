/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura

Asiento obtiene la fila y el numero se silla de cada ciente. Esta clase es usada por 
la clase Función. 
*/


package Modulo;

import App.FUNCION;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Asiento extends JToggleButton implements ActionListener{
    
    int i=0,  fila, columna, asiento;
    //CONSTRUCTOR
   public Asiento(int posx, int posy, int ancho, int alto){
       setBounds(posx, posy,  ancho,  alto);
       addActionListener(this);
       setBackground(Color.GREEN); 
       /*try{
        setIcon((Icon) new ImageIcon(getClass().getResource("../icono/asiento.png")).getImage());
        }
             catch(Exception e){
            
        }*/
   }
    
   public void CambiarNombre(int x, int y){
       String letra="";
      //le asigno nombre segun su fila y columna de un formato LETRA-#, al asiento creado
       fila=x;
       columna=y;
      
       
       switch(x){
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
       
       setText( letra +"-"+(y+1));
   }
   
    //Esta clase no implementa el método toString.

    @Override
    public void actionPerformed(ActionEvent e) {
        //los asientos disponibles estan en color verde, los que el cliente elija 
        //se ponen en color amarillo y los que ya no se encuentren disponibles no se pueden elegir 
        boolean band=true ;
        i++;
        if(((i%2)!=0) && (FUNCION.aux>0)&&(FUNCION.aux<=FUNCION.cant)&&(getBackground().equals(Color.GREEN))){
            //verifico si el cliente puede elegir otro asiento, segun la cantida que compra
            FUNCION.aux--;//le resto la cantida de asientos que tiene para ocupar
            band=false;
            setBackground(Color.YELLOW);
            FUNCION.buts.add(new Butaca(fila,columna)); //agrego el asiento que eligio para que no lo puedan elegir de nuevo
            
        }
        if(((i%2)==0)&& (FUNCION.aux>=0)&&(FUNCION.aux<FUNCION.cant)&&(getBackground().equals(Color.YELLOW))){
            //verifico si el cliente ya no quiere el asiento que eligio antes de terminar la compra
            FUNCION.aux++;//le suma la cantida de asientos que tiene para ocupar
            band=false;
            setBackground(Color.GREEN); 
            
            for(int j=0;j<FUNCION.buts.size();j++){
                //encuentro el asiento que ya no quiere para quitarlo de la lista y tenerlo disponible
                if((FUNCION.buts.get(j).getColumna()==columna) && FUNCION.buts.get(j).getFila()==fila){
                    FUNCION.buts.remove(FUNCION.buts.get(j));
                }
            }  
        }
        if(band){
            //si no ocurrio ninguno de los dos anteriores, regresa a un estado nosmar el contador
            i--;
        }
    
        
    }
}