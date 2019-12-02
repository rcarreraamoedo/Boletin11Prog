/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11c_clases;

/**
 *
 * @author usuario
 */
public class Boletin11C_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date a=new Date();
        a.setAny(2020);
        a.setMes(12);
        a.setDia(31);
        System.out.println("Dia "+a.getDia()+"\nMes "+a.getMes()+"\nAño "+a.getAny());
    }
    
}
