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
public class Media {
    private String nombre;
    private String autor;
    private int duradaSegons;

    public Media(String n, String a, int d) {
        nombre = n;
        autor = a;
        duradaSegons = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int d) {
        duradaSegons = d;
    }
}
