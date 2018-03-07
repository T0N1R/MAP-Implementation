package HT6;

import java.util.*;

/**
 *
 * @author Antonio
 */
public class Mapa {
    
    
    Map<String, String> deck;
    Map<String, Integer> cantidadDeck;
    
    
    /**
     * Metodo que se utiliza para agregar una carta al deck
     */
    public void agregarCarta(String nombre, Map cartas){
        if(cartas.containsKey(nombre) == true){
            if(deck.containsKey(nombre)== false){
                deck.put(nombre, (String) cartas.get(nombre));
                cantidadDeck.put(nombre, 0);
            }
            
            if(deck.containsKey(nombre) == true){
                cantidadDeck.put(nombre, cantidadDeck.get(nombre) + 1);
            }
        }
    }
    
}
