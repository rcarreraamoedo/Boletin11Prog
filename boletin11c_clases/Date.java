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
public class Date {
    private int dia;
    private int mes;
    private int any;

    public Date(int d, int m, int a) {
        dia = d;
        mes = m;
        any = a;
    }

    public Date() {
        dia = 0;
        mes = 0;
        any = 0000;
    }
    
    public int getDia() {
        return dia;
    }

   public void setDia(int d) {
        if (mirarFecha(d) == true) {
            dia = d;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        if (m < 13) {
            mes = m;
        }
    }

    public int getAny() {
        return any;
    }

    public void setAny(int a) {
        any = a;
    }
     public boolean mirarFecha(int dia) {
        if (((dia < 32 && dia > 0) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
                || ((dia < 31 && dia > 0) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
                || (((dia < 29 && dia > 0) && (mes == 2)))) {
            return true;
        } else {
            System.out.println("La fecha es incorrecta");
            return false;
        }
     }
}
