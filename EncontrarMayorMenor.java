/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sergio Pedraza
 */
public class EncontrarMayorMenor {
    public static void main(String[] args) {
        int[]numero = {50, 70, 75, 12, 45};
        int mayor = numero [0];
        int menor = numero [0];
        
        for (int i = 1 ; i < numero.length ; i++) { 
            if (numero [i] > mayor) {
                mayor = numero[i];
            }  else if (numero [i] < menor) {
                menor = numero [i];
            }       
                    
      
        
           
         
            
        }   
           
         System.out.println("el numero mayor es: " + mayor);
            System.out.println("el numero menor es: " + menor);
                            
        
        
          
    }
        
    }
