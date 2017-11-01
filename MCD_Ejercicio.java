/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcd_ejercicio;
import java.util.Scanner;
/**
 *
 * @author Dulce
 */
public class MCD_Ejercicio {

 
    public static void main(String[] args) {
    
     Scanner num = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Ingrese primer número entero: ");
        x= num.nextInt();
        System.out.println("Ingrese segundo número entero: ");
        y= num.nextInt();
        System.out.println("Ingrese el tercer número: ");
        z=num.nextInt();
        //System.out.printf(" El mcd es: %d" + "\n", mcd(x,z,y));
     Procedimiento.mcd(x, y, z);
        System.out.println("El resultado es: "+ Procedimiento.mcd(x, y, z));
        
        
        
        
        
    }
    
}
