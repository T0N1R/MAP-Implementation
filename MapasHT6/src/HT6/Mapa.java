package HT6;

import java.util.*;

/**
 *
 * @author Antonio
 */
public class Mapa {
    
        
    
    /**
     * Metodo que se utiliza para agregar una carta al deck
     */
    public void agregarCarta(String nombre, Map cartas, Map deck, Map<String, Integer> cantidadDeck){
        if(cartas.get(nombre) != null){
            System.out.println(cartas.get(nombre));
            String tipo = (String) cartas.get(nombre);
            deck.put(nombre, tipo);
            System.out.println(deck.get(nombre));
            
            if(cantidadDeck.get(nombre) == null){
                cantidadDeck.put(nombre, 1);
                System.out.println(nombre+": "+deck.get(nombre));
                System.out.println("Cantidad en deck: "+": "+cantidadDeck.get(nombre));
            }
            
            else{
                cantidadDeck.put(nombre, cantidadDeck.get(nombre)+1);
                System.out.println(nombre+": "+cantidadDeck.get(nombre));
            }
            
        }
        

    }
    
    
    public void mostrarDeck(Map deck){
        
    }
    
}