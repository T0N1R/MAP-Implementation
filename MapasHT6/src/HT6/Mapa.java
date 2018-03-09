package HT6;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Antonio #17273
 * @author Andres Perez #16362
 */
public class Mapa{
    
        
        
    /**
     * Metodo que se utiliza para agregar una carta al deck
     * @param nombre
     * @param cartas
     * @param deck
     * @param cantidadDeck 
     */
    public void agregarCarta(String nombre, Map cartas, Map deck, Map<String, Integer> cantidadDeck, TreeMap tipoNombreDeck){
        
        /**
         * En el caso de que exista un valor al llamar a la llave con el nombre proveído 
         * por el usuario, se va a utilizar "put" para agregar es nombre de la carta como llave 
         * y se va a llamar al tipo de carta al deck.
         * 
         */
        if(cartas.get(nombre) != null){
            String tipo = (String) cartas.get(nombre);
            deck.put(nombre, tipo);
            
            
            /**
             * En el caso de que la carta agregada al deck no esté en el mapa de cantidadDeck,
             * se va a utilizar put para agregar el nombre de la carta como llave y se
             * va a poner un 1 mostrando que esa carta sólo se enuentra una vez en el deck.
             */
            if(cantidadDeck.get(nombre) == null){
                cantidadDeck.put(nombre, 1);
                
                /*
                
                //la llave va a ser el tipo y el valor va a ser el nombre de la carta
                tipoNombreDeck.put(cartas.get(nombre),nombre);
                
                */
                
                System.out.println(nombre+": "+deck.get(nombre));
                System.out.println("Cantidad en deck: "+": "+cantidadDeck.get(nombre));
            }
            
            /**
             * En el caso de que la carta ya esté en cantidadDeck, se realizará un push donde el 
             * nombre de la llave será el nombre de la carta y como valor será el cantidad.Deck de la
             * carta con el mismo nombre + 1. De esta forma, se actualizarán los valores.
             */
            else{
                cantidadDeck.put(nombre, cantidadDeck.get(nombre)+1);
                System.out.println(nombre+": "+cantidadDeck.get(nombre));
            }
            
        }
        

    }
    
    /**
     * Método para mostrar todas las cartas de la base de datos. Se mostrará el 
     * nombre de la carta y su tipo
     * @param cartas 
     */
    public void mostrarTodas(Map<String, String> cartas){
        for(String llave: cartas.keySet()){
            System.out.println(llave + " -> " + cartas.get(llave));
        }
    }
    
    
    public void mostrarDeck(Map<String, String> deck, Map<String, Integer> cantidadDeck){
        for(String llave: deck.keySet()){
            System.out.println("\n"+"Nombre: " + llave + "\n" + "Tipo: " + deck.get(llave) + "\n" +
                    "Cantidad en deck: " + cantidadDeck.get(llave) + "\n");
        }
    }
    
    public void ordenarDeck(Map<String, String>deck){
        
        List<Entry<String, String>> orden = new LinkedList<>(deck.entrySet());
        Collections.sort(orden, new Comparator<Entry<String, String>>() {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        }); 
        
        for(Entry<String, String> item:orden){
            System.out.println(item);
        }

    }
    
    
    public void ordenarDB(Map<String, String> cartas){
        List<Entry<String, String>> orden = new LinkedList<>(cartas.entrySet());
        Collections.sort(orden, new Comparator<Entry<String, String>>() {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        }); 
        
        for(Entry<String, String> item:orden){
            System.out.println(item);
        }
    }
}
