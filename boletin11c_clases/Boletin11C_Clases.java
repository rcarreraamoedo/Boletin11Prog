/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11c_clases;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin11C_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date obx = new Date(12,04,2011);
        int d = obx.getDia();
        int m = obx.getMes();
        int a = obx.getAny();
        System.out.println("El objeto de fecha inicial--> "+d+ "," +m+ "," +a);
        System.out.println("***Asignación de valores***");
        obx.setDia(24);
        obx.setMes(12);
        obx.setAny(2019);
        d = obx.getDia();
        m = obx.getMes();
        a = obx.getAny();
        System.out.println("El objeto modificado es --> "+d+ "," +m+ "," +a);
        
    }
    
}
