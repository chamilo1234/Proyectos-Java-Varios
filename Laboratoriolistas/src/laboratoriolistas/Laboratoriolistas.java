/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriolistas;
/**
 *Esta clase contiene el menu del programa
 * @author Camilo Morales 
 * @version 1.0
 */

public class Laboratoriolistas {
        public static void main(String[] args) {
        Lista_doble Milista=new Lista_doble();
        Lista_doble Pc = new Lista_doble();
        System.out.println("Hola por favor agrega el nombre de los clientes en este caso maximo 4 clientes.");
        System.out.println("Hola por favor ingresa el nombre del primer cliente.");
        Milista.insertarNodo();
        System.out.println("Ahora ingresa la marca del computador del primer cliente");
        Pc.insertarNodo();
        System.out.println("Por favor ingresa el nombre del segundo cliente.");
        Milista.insertarNodo();
        System.out.println("Ahora ingresa la marca del computador del segundo cliente");
        Pc.insertarNodo();
        System.out.println("Lista de clientes en espera");
        Milista.VerLista();
        System.out.println("Lista de la marca de los computadores");
        Pc.VerLista();
        System.out.println("Por favor ingresa el nombre del tercer cliente.");
        Milista.insertarNodo();
        System.out.println("Ahora ingresa la marca del computador del tercer cliente");
        Pc.insertarNodo();
        System.out.println("Lista de clientes en espera");
        Milista.VerLista();
        System.out.println("Lista de la marca de los computadores");
        Pc.VerLista();
        System.out.println("Hola por favor ingresa el nombre del cuarto cliente.");
        Milista.insertarNodo();
        System.out.println("Ahora ingresa la marca del computador del cuarto cliente");
        Pc.insertarNodo();
        System.out.println("Lista de clientes en espera");
        Milista.VerLista();
        System.out.println("Lista de la marca de los computadores");
        Pc.VerLista();
        System.out.println("El cliente  numero 3 decidio pagar servicio premiun entonces por ende se da prioridad");
        System.out.println("Ingresa por favor el nombre del cliente numero 3 para ser buscado en la lista: ");
        Milista.Reemplazarnodo();
        System.out.println("El nuevo orden de la lista de clientes en espera es :");
        Milista.VerLista();
        System.out.println("Ahora ingresa el nombre de la marca del 3 cliente para ser buscado en la lista");
        Pc.Reemplazarnodo();
        System.out.println("El nuevo orden de la lista de computadores es :");
        Pc.VerLista();
        System.out.println("Ahora el tecnico desea saber cuantos computadores tiene en lista de espera");
        Pc.contarelem();
        System.out.println("Hubo un error tecnico en el sistema por ende la secretaria desea si el cliente carlos se encuenta en la lista de espera.");
        Milista.BuscarDato();
        System.out.println("El primer cliente fue antendido con exito entonces se elimina de la lista de espera");
        Milista.SacarElemento();
        Pc.SacarElemento();
        System.out.println("la secretaria de sea ver la listas para saber cuantos clientes y computadores tiene.");
        System.out.println("los clientes en espera son: ");
        Milista.VerLista();
        System.out.println("la lista de computadores es: ");
        System.out.println("los computadores en espera son: ");
        Pc.VerLista();
        System.out.println("El cuarto cliente tuvo un improvisto y se tuvo que ir por lo tanto eliminado la posicion en la lista donde estaba");
        Milista.SacardatoPos();
        System.out.println("Ahora debemos la poscion que ocupa el computador del cliente");
        Pc.SacardatoPos();
        System.out.println("Volvemos a imprimir la lista de clientes y de compuadores debido a que el cuarto cliente salio.");
        Milista.VerLista();
        Pc.VerLista();
        System.out.println("Un nuevo tecnico llego para apoyar entonces desea saber en que posicion cual cliente se encuentra en la posicion numero 1.");
        Milista.Elementociertapos();
        System.out.println("Ahora se unen las dos listas tanto de cleintes como el nombre de sus equipos.");
        Milista.concatenar(Pc);
        System.out.println("lista concatenada ");
        Pc.VerLista();
        Milista.VerLista();
    }

}