
package mcd_ejercicio;

/**
 *
 * @author Dulce
 */
public class Procedimiento {
  
    public  static int mcd(int x, int y, int z ){
        
        
        if(z==0){
            return x;
        }else{
           return mcd(z,y, x%z );
        }
        
    }
}

    
    
