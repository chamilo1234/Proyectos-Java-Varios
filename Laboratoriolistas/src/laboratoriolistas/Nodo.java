/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriolistas;

/**
* @author Camilo Morales
* @version 1.0
* Creacion del nodo y sus constructores.
*/

public class Nodo {
    String dato;
    Nodo siguiente;
    Nodo anterior;
    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public String VerNodo()     
    {
 
        return "Orden de lista("+ this.dato+") , -> "+ ((siguiente!=null)?siguiente.getDato():null)+ " <- "+ ((anterior!=null)?anterior.getDato():null)+" -> "+ ((siguiente!=null)?siguiente.getDato():null)+ " <- "+ ((anterior!=null)?anterior.getDato():null)+" ";
    }   
     
}
