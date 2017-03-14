/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Angel Herrera
 */
public class Juego {

    
    //Declaracion de variables de instancia
    
    
    private NumeroSecreto numeroSecreto ;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    
   
    
    //implementamos el metodo setrangodenumerosecreto
    
    public void setRangoDeNumeroSecreto(int limiteInferior,int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior,this.limiteSuperior);
    }  
    
    //Declaración del constructor
    
    public Juego (int limiteInferior,int limiteSuperior,int intentos){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.numeroDeIntentos = intentos;
        numeroSecreto= new NumeroSecreto(this.limiteInferior,this.limiteSuperior);
        this.intentosRealizados = 0 ;
    }
    
    //Declarar el metodo set para numero de intentos
    
    public void setNumerodeIntentos(int intentos){
        this.numeroDeIntentos = intentos;
    }
    
    //DEclararemos el metodo para saber si acertaron al numero secreto
    
    public boolean esElNumeroSecreto(int numero){
        this.intentosRealizados ++;
        return numeroSecreto.esIgual(numero);
    }
            
    
    // delcaramos el metodo puedoIntentarDeNuevo
    
    public boolean puedoIntentarDeNuevo(){
        boolean hayMasOportunidades = this.intentosRestantes()>0;
        return hayMasOportunidades;
    }
   
     //Declaramos el metodo de intentos restandes
    
    public int intentosRestantes(){
        int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
        return (numeroDeIntentosRestantes);
    }
    
    
   //Se declara el metodo para el texto de ayuda
    
    public String getTextoDeAyuda(int numero){
        String texto = null ;
        if(this.numeroSecreto.esMayor(numero)== true){
            texto = "mayor";
        }
        else {
            if (this.numeroSecreto.esMenor(numero)==true){
                texto="menor";
            }
        }
        return texto;
    }
    public int getNumeroSecreto(){
       int ns= this.numeroSecreto.getNumeroSecreto();
        return ns;
    }
}
