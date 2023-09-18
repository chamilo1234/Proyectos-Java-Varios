/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mantenimiento;

/**
 *
 * @author camilo morales
 */
public class Mantenimiento{
    
    
    private Mantenimiento String dato;
    private Mantenimiento siguente;
    private Mantenimiento anterior;
    
    public Mantenimiento(String dat,Mantenimiento ant,Mantenimiento sig)
    {
        siguiente = sig;
        anterior = ant;
        dato = dat;
    }

    public Mantenimiento getString() {
        return String;
    }

    public void setString(Mantenimiento String) {
        this.String = String;
    }

    public Mantenimiento getSiguente() {
        return siguente;
    }

    public void setSiguente(Mantenimiento siguente) {
        this.siguente = siguente;
    }

    public Mantenimiento getAnterior() {
        return anterior;
    }

    public void setAnterior(Mantenimiento anterior) {
        this.anterior = anterior;
    }



        

}
