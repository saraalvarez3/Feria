package feria;

import java.util.Date;

public class Festivalfolclorico extends Feria {

    private int cantidadDeGente;
    private boolean diasSabados;
    private String ubicacion;

    public Festivalfolclorico(int cantidadDeGente, boolean diasSabados, String ubicacion, int numerodePersonas, Date fechadeinicio, String nombredelorganizador, boolean tienecaminatas, int numerodesillas) {
        super(numerodePersonas, fechadeinicio, nombredelorganizador, tienecaminatas, numerodesillas);
        this.cantidadDeGente = cantidadDeGente;
        this.diasSabados = diasSabados;
        this.ubicacion = ubicacion;
    }

    public void fechasProgramadas() {
        this.diasSabados = true;

    }

    public void fechasProgramadas(int cantidadDeGente) {
        this.diasSabados= true;
        this.cantidadDeGente += cantidadDeGente;
    }

    public int getcantidaddegente() {
        return cantidadDeGente;
    }

    public void setcantidaddegente(int cantidaddegente) {
        this.cantidadDeGente = cantidaddegente;
    }

    public boolean getdiadeinicio() {
        return diasSabados;
    }

    public void setdiadeinicio(boolean diasSabados) {
        this.diasSabados= diasSabados;
    }

    public String getubicacion() {
        return ubicacion;
    }

    public void setubicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
