package HT6;

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
    public static void main(String[] args) {
        // TODO code application logic here
        
        MapFactory factory = new MapFactory();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Eliga el tipo de Mapa que desea utilizar: ");
        System.out.println("HashMap: H");
        System.out.println("TreeMap: T");
        System.out.println("LinkedHashMap: L");
        String opcion1 = scan.nextLine();
        
        Map mapa = factory.crearMapa(opcion1);
        
        mapa.put("Exodia", "Light");
        mapa.put("Blue Eyes", "Light");
        mapa.put("Black Magician", "Darkness");
        
        System.out.println(mapa.get("Black Magician"));
        System.out.println(mapa.isEmpty());
        System.out.println(mapa.size());
        mapa.put("Antonio", "Light");
        System.out.println("Se agrega Antonio|Light");
        System.out.println(mapa.size());
    }
    
}
