package HT6;

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
 * @author Antonio
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
        
        Map mapa = factory.crearMapa(opcion1);
        
        File all_cards = new File("C:/Users/Antonio/Documents/NetBeansProjects/MapasHT6/MapasHT6/src/HT6/cards_desc.txt");
        FileReader leer = new FileReader(all_cards);
        BufferedReader buff = new BufferedReader(leer);
        
        String linea;
        
        while((linea = buff.readLine()) != null){
            String[] separate = linea.split("\\|");
            String nombre = separate[0];
            String tipo = separate[1];
            
            mapa.put(nombre, tipo);
        }
        
        System.out.println("Numero de cartas: " + mapa.size());
        while(estado != true){
            System.out.println("ELIGA LA ACCION QUE DESEA REALIZAR: ");
            System.out.println("1- Agregar carta al deck");
            System.out.println("2-Datos de carta (TIPO)");
            System.out.println("3-Mostrar cada carta en su propio deck (nombre, tipo, cantidad)");
            System.out.println("4-Mostrar cada carta en su propio deck ordenado por tipo");
            System.out.println("5-Mostrar el nombre y tipo de todas las cartas en la base de datos");
            System.out.println("6-Mostrar el nombre y tipo de todas las cartas del DB ordenadas por tipo");
        }
    }
    
}
