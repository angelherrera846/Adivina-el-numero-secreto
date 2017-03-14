/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumerosecreto;

import Modelo.Juego;
import Modelo.NumeroSecreto;
import java.util.Scanner;

/**
 *
 * @author Angel Herrera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero ;
        boolean seAdivinoElNumeroSecreto = false;
        Juego juego = new Juego (1, 100, 5);
        while (juego.puedoIntentarDeNuevo()==true
                && !seAdivinoElNumeroSecreto){
            System.out.print("Adivine el numero secreto:");
            numero=entrada.nextInt();
            seAdivinoElNumeroSecreto= juego.esElNumeroSecreto(numero);
            if(seAdivinoElNumeroSecreto){
                System.out.println("Felicidades, has adivinado el numero secreto");
            }
            else{
                System.out.println("Fallaste, el numero secreto es "
                        +juego.getTextoDeAyuda(numero)
                        + " que el numero proporcionado");
                System.out.println("Intenta de nuevo.");
            }            
        }
        System.out.println("El numero secreto es " + juego.getNumeroSecreto());
    }
}
