/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author Angel Herrera
 */
public class NumeroSecreto {
    
    
    //DEclaración de las variables de instancia 
    
   private int numero;
   private int limiteInferior;
   private int limiteSuperior;
   private Random generador;
   
   //Declarar las constantes simbolicas
   
   private static final int LIM_INF_PREDET =1;
   private static final int LIM_SUP_PREDET =100;
   
   //Declarar el metodo set.rango para inicializar las variables de instancia 
   
   public void setRango (int limiteInferior , int limiteSuperior){
       if(limiteInferior > limiteSuperior){
           limiteInferior = LIM_INF_PREDET;
           limiteSuperior = LIM_SUP_PREDET;
       }else{
           limiteInferior = limiteInferior;
           limiteSuperior = limiteSuperior;
       }
   }
   
   //Declarar el metodo generar
   
   public void Generar (){
       this.numero =generador.nextInt(limiteSuperior)+1;
   }
   
   //Declare un constructor con dos parametros para la clase
   
   public NumeroSecreto(int limiteInferior,int limiteSuperior){
       this.setRango(limiteInferior,limiteSuperior);
       this.generador= new Random();
       this.Generar();
   }
   
   //Declare el segundo constructor sin parametros para que delegue el trabajo al primer constructor
   
   public NumeroSecreto(){
       this(LIM_INF_PREDET,LIM_SUP_PREDET);
   }
   
   //Declarar getters para variables de instancia
   
   public int getNumeroSecreto(){
       return this.numero;
   }
   
   public int getLimiteIferior (){
       return this.limiteInferior;
   }
   
   public int getLimiteSuperior (){
       return this.limiteSuperior;
   }
   
   //Declarar la clase es mayor
   
   public boolean EsMayor(int numero){
       boolean elNumeroSecretoEsMayor;
       if(this.numero > numero ){
           elNumeroSecretoEsMayor = true;
       }else{
           elNumeroSecretoEsMayor = false ;
       }
       return elNumeroSecretoEsMayor;
   }
   
   //Declarar la clase es menor
   
   public boolean EsMenor (int numero){
       boolean elNumeroSecretoEsMenor = false;
       if (this.numero < numero){
           elNumeroSecretoEsMenor = true ;
       }
       return elNumeroSecretoEsMenor;
   }
   
   //Declarar la clase es igual
   
   public boolean EsIgual (int numero){
       return (this.numero == numero);
   }
   
   
}
