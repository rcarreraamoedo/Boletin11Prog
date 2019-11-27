/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11b_clases;

/**
 *
 * @author rcarreraamoedo
 */
public class Boletin11B_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Media obx = new Media("Nombre","Autor",222);
        String n = obx.getNombre();
        String a = obx.getAutor();
        int d = obx.getDuradaSegons();
        System.out.println("El objeto inicial es--> "+n+ "," +a+ "," +d);
        System.out.println("***Asignación de valores***");
        obx.setNombre("Alguien");
        obx.setAutor("Juan");
        obx.setDuradaSegons(500);
        n = obx.getNombre();
        a = obx.getAutor();
        d = obx.getDuradaSegons();
        System.out.println("El objeto modificado es --> "+n+ "," +a+ "," +d);
    }  
}
