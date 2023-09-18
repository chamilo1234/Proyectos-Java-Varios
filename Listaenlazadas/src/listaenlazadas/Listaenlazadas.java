/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazadas;

/**
 *
 * @author camilo morales
 */
public class Listaenlazadas {
    
     nodo primero;
     nodo ultimo,
    
    public Listaenlazadas(){
        
        primero=null;
        ultimo=null;
        
    }

    /**
     * @param args the command line arguments
     */
    public  void ingresandoimpresion (int dato) {
        nodo nodoaux = new nodo();
        nodoaux.dato= dato;
         
        if(primero ==null){
            primero=nodoaux;
            primero.siguiente=primero;
            nodoaux.anterior = ultimo;
            ultimo= nodoaux;
        }else{
            ultimo.siguiente=nodoaux;
            nodoaux.siguiente=primero;
            nodoaux.anterior=ultimo;
            ultimo=nodoaux;
            primero.anterior=ultimo;
        }    
        
    }
    public void eliminarnodo(int dato){
        nodo actual = new nodo();
        nodo anterior = new nodo();
        actual =primero;
        anterior = ultimo;
        do{
            if(actual.dato==dato){
                if (actual==primero){
                primero=primero.siguiente;
                ultimo.siguiente=primero;
                primero.anterior=ultimo;
             
            }else if(actual==ultimo){
                ultimo=anterior;
                primero.anterior=ultimo;
                ultimo.siguiente=primero;
            }else{
                anterior.siguiente=actual.siguiente;
                actual.siguiente.anterior=anterior;
            }
    }           
                
            anterior=actual,
            actual=actual.siguiente;
                      
        }while(actual!= primero);
    }
    public void buscarnodo(int dato){
        nodo actual= new nodo();
        actual=ultimo;
        boolean encontrado=false;
        do{
            if (actual,dato==dato){
                econtrado=true;
            }
            actual=actual.anterior;
        }while(actual !=ultimo);
        if(encontrado==true){
            System.out.println("nodo encontrado");
        }else{
            System.out.println("nodo no encontrado");
        }
    }
    public verlista(){
        nodo actual=new nodo();
        actual=primero;
        do{
            System.out.println(actual.dato;
            actual=actual.siguiente;
        }while(acttual!=primero)
                
    }
}
