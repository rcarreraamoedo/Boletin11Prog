/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11a_clases;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin11A_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase A =  new Clase ( );
        Clase B =  new Clase (20);
        Clase C =  new Clase ( 20 , 40 );
        System.out.println ( "El objeto _A: _ contiene:"  + A.getPrimari ( )  +  ","  + A.getSecundari ( ) ) ;
        System.out.println ( "El objeto _B: _ contiene:"  + B.getPrimari ( )  +  ","  + B.getSecundari ( ) ) ;
        System.out.println ( "El objeto _C: _ contiene:"  + C.getPrimari ( )  +  ","  + C.getSecundari ( ) ) ;
    }
}
    

