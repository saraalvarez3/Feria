package feria;

import java.util.Date;

public class Carnavaldebarranquilla extends Feria {

    private int cantidadDePersonas;
    private boolean creadores;
    private String diversidaddegente;
    private String nombreCreadores;

    public Carnavaldebarranquilla(int cantidadDePersonas, boolean creadores, String diversidaddegente, String nombreCreadores, int numerodePersonas, Date fechadeinicio, String nombredelorganizador, boolean tienecaminatas, int numerodesillas) {
        super(numerodePersonas, fechadeinicio, nombredelorganizador, tienecaminatas, numerodesillas);
        this.cantidadDePersonas = cantidadDePersonas;
        this.creadores = creadores;
        this.diversidaddegente = diversidaddegente;
        this.nombreCreadores = nombreCreadores;
  
    }
    public void renombrarCreadores(String nuevoNombre) {
        this.nombreCreadores = nuevoNombre;
    }

    public void renombrarCreadores(String nuevoNombre,String especialidad){
        this.nombreCreadores = nuevoNombre + " de " + especialidad;
    }

    public int getcantidaddepersonas() {
        return cantidadDePersonas;
    }

    public void setcantidaddepersonas(int cantidaddepersonas) {
        this.cantidadDePersonas = cantidaddepersonas;
    }

    public boolean creadores() {
        return creadores;
    }

    public void setcreadores(boolean creadores) {
        this.creadores = creadores;
    }

    public String getdiversidaddegente() {
        return diversidaddegente;
    }

    public void setdiversidaddegente(String diversidaddegente) {
        this.diversidaddegente = diversidaddegente;
    }
}
