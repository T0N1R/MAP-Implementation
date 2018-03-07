/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT6;
import java.util.*;

/**
 *Clase Factory donde se va a decidir que tipo de Mapa se va a utilizar.
 * @author Antonio
 */
public class MapFactory {
    
    public MapFactory(){
    
    }
    
    Map nuevo = null;
    public Map<String, String> crearMapa(String opcion){
        
        if(opcion.equals("H")){
            nuevo = new HashMap<String, String>();
        }
        
        if(opcion.equals("T")){
            nuevo = new TreeMap<>();
        }
        
        if(opcion.equals("L")){
            nuevo = new LinkedHashMap<>();
        }
        
        return nuevo;
    }
    
}
