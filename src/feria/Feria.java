package feria;

import java.util.Date;

public class Feria {

    private  int numeroDePersonas; 
    private Date fechaDeInicio;
    private String nombreDelOrganizador;
    private boolean tieneCaminatas;
    private int numeroDeSillas;

    public Feria(int numerodePersonas, Date fechadeinicio, String nombredelorganizador, boolean tienecaminatas, int numerodesillas) {
        this.numeroDePersonas = numerodePersonas;
        this.fechaDeInicio = fechadeinicio;
        this.nombreDelOrganizador = nombredelorganizador;
        this.tieneCaminatas = tienecaminatas;
        this.numeroDeSillas = numerodesillas;
    }
    
    

}