package HT6;

import static java.awt.PageAttributes.MediaType.A;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6 de marzo, 2018
 * Hoja de Trabajo 6
 *
 * @author Antonio #17273
 * @author Andres Perez #16362	
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        MapFactory factory = new MapFactory();
        Mapa yugi = new Mapa();
        boolean estado = true;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Eliga el tipo de Mapa que desea utilizar: ");
        System.out.println("HashMap: H");
        System.out.println("TreeMap: T");
        System.out.println("LinkedHashMap: L");
        String opcion1 = scan.nextLine();
        
        Map cartas = factory.crearMapa(opcion1);
        Map deck = factory.crearMapa(opcion1);
        Map<String, Integer> cantidadDeck = factory.crearMapa(opcion1);
        
        File all_cards = new File("C:\\Users\\Andres\\Documents\\GitHub\\MAP-Implementation\\MapasHT6\\src\\HT6\\cards_desc.txt");
        FileReader leer = new FileReader(all_cards);
        BufferedReader buff = new BufferedReader(leer);
        
        String linea;
        
        while((linea = buff.readLine()) != null){
            String[] separate = linea.split("\\|");
            String nombre = separate[0];
            String tipo = separate[1];
            
            cartas.put(nombre, tipo);
        }
        
        System.out.println("Numero de cartas: " + cartas.size());
        System.out.println("A Hero Emerges" + cartas.get("A Hero Emerges"));
        //String opcion2 = scan.nextLine();
        while(estado == true){
            System.out.println("ELIGA LA ACCION QUE DESEA REALIZAR: ");
            System.out.println("1- Agregar carta al deck");
            System.out.println("2-Datos una carta (TIPO)");
            System.out.println("3-Mostrar cada carta en su propio deck (nombre, tipo, cantidad)");
            System.out.println("4-Mostrar cada carta en su propio deck ordenado por tipo");
            System.out.println("5-Mostrar el nombre y tipo de todas las cartas en la base de datos");
            System.out.println("6-Mostrar el nombre y tipo de todas las cartas del DB ordenadas por tipo");
            System.out.println("0-Salir");
            String opcion2 = scan.nextLine();
            
            switch (opcion2){
                
                case "0":{
                    estado = false;
                    break;
                }
                
                case "1":{
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    System.out.print("Ingrese el nombre de la carta que desea agregar: ");
                    String nombreCarta = scan.nextLine();
                    yugi.agregarCarta(nombreCarta, cartas, deck, cantidadDeck);
                    System.out.println("*****************************");
                    System.out.println("*****************************");

                    break;
                }
                
                case "2":{
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    System.out.print("Ingrese el nombre de la carta que desea: ");
                    String buscarCarta = scan.nextLine();
                    System.out.println("Nombre de Carta: " + buscarCarta + "\n" + "Tipo de Carta: " + cartas.get(buscarCarta));
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;
                }
                
                case "3":{
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    yugi.mostrarDeck(deck, cantidadDeck);
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;
                }
                
                case "4":{
                    
                    break;
                }
                
                case "5":{
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    yugi.mostrarTodas(cartas);
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;
                }
                
                case "6":{
                    
                    break;
                }                
                
            }
        }
    }
    
}
