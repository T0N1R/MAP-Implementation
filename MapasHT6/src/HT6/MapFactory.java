/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT6;
import java.util.*;

/**
 *Clase Factory donde se va a decidir que tipo de Mapa se va a utilizar.
 * @author Antonio #17273
 * @author Andres Perez #16362
 */
public class MapFactory {
    
    public MapFactory(){
    
    }
    
    Map nuevo = null;
    public Map crearMapa(String opcion){
        
        if(opcion.equals("H") || opcion.equals("h")){
            nuevo = new HashMap<>();
            System.out.println("Se hizo un HashMap");
        }
        
        if(opcion.equals("T") || opcion.equals("t")){
            nuevo = new TreeMap<>();
            System.out.println("Se hizo un TreeMap");
        }
        
        if(opcion.equals("L") || opcion.equals("l")){
            nuevo = new LinkedHashMap<>();
            System.out.println("Se hizo un LinkedHashMap");
        }
        
        return nuevo;
    }
    
}
