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
public class Date {
    private int dia;
    private int mes;
    private int any;

    public Date(int d, int m, int a) {
        dia = d;
        mes = m;
        any = a;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        dia = d;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        mes = m;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int a) {
        any = a;
    }
    
    
    
}
