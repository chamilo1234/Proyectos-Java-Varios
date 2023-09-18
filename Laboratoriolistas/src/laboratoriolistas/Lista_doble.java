package laboratoriolistas;

/**
* Esta clase contiene  metodos de la clase nodo
* @author Camilo Morales
* @version 1.0
*/


import java.util.Scanner;

public class Lista_doble {
    Scanner Teclado = new Scanner(System.in);
    Nodo inicio;
    Nodo fin;
    public Lista_doble()
    {
        inicio=null;  //Declaramos el inicio null y el fin null por que lña lista esta vacia.
        fin=null;
    }
    
    /**
    * Metodo para  contar elementos de la lista
    * @return retorna contador
    */
    
    public int contarelem(){  //Creamos metodo para contar los elementos de la lista en este caso publico de tipo int(entero).
        Nodo actual = new Nodo(); //Creamos un nuevo objeto o nodo de nombre actual 
        int con=0;  //Creamos un contador y lo iniciamos en ceros para luego empezar a contar los elementos.
        for(actual=inicio; actual!=null; actual = actual.siguiente) //Luego creamos un ciclo for con el nodo nuevo llamado actual y le definimos varibales para que si se cumplen este se ejecute o de lo contario me retorne la varibale contador en ceros. en general aca se pretende que la lista este llena para que se ejecute.
            con++; //Luego de haber iterado en el ciclo se suma uno al contador que es la iteracion para contar los elementos.
              System.out.println("la cantidad es : \n " +con); //Se imprime un mensaje despues de haber iterado con los elementos que conto y tiene en la varibale contador.                  
        return con;//En caso de que no se cumpla las condiciones del ciclo for se sale y se retorna a contador que en este caso inicia en ceros.
    }
    
    /**
    * Metodo para insertar un elemento en la lista
    */
    
    
    public void insertarNodo()//Creamos un metodo de nombre insertarInicio para agregar un nuevo elemento en este caso publico de tipo void (vacio).
    {
        Nodo nuevo = new Nodo();// Se crea un nuevo objeto o nodo de nombre nuevo para agregar elemento.
        nuevo.dato = Teclado.next();//Mediante este metodo que pertenece a la libreria Scanner se ingresa el dato.
        if(inicio == null)//Se crea un ciclo de tipo if  para validar que el inicio sea nulo o este vacio para agregar el dato que fue ingresado en la linea anterior.
        { //Si la condicion se cumple entra a iterar.
            inicio = nuevo;//Declaramos que el inicio o cabeza sea igual al dato que fue ingresado para agregarlo.
            inicio.siguiente = null;//En el puntero de incio o cabeza se declara igual a null por que solo fue ingresado un nuevo dato por ende va a puntar a null ya que solo existe un dato.
            inicio.anterior = null;//hacemos lo mismo que en la linea anterior solo que en este caso es con el puntero que va para atras definidi como anterior.
            fin = nuevo;//El final o la cola decimoa que va a ser igual al nuevo dato ingresado para asi cuando se ingrese otro dato no genere conflicto al no tener definido a que equivale la cola o el fin de esta manera generamos un ciclo.
        }else//Si no se cumple la condicon de que inicio sea nulo o no tenga nada entonces esto quiere decir que ya existe un elemento y debemos agrar otro para que en la lista queden dos por ejemplo o tres.
        {//Esto se crea para agregrar elementos despues de ya tener el primer dato agregado.
            fin.siguiente = nuevo; //Para el fin o la cola se iguala que el puntero siguiente de esta sea igual al nuevo dato ingresado.
            nuevo.siguiente = null;//Como ya tenemos un dato en el nodo de nombre nuevo entonces el puntero de este lo igualamos a null debido a que no tiene nada adelante de el por que no existe o aun no se ah ingresado.
            nuevo.anterior = fin;//Ahora hacemos lo mismo para el puntero anterior de este elemento pero en este caso lo igualamos al fin o a la cola debido a que pasa a ser el ultimo dato despues del que ya fue ingresado.
            fin = nuevo;//La cola o el final lo igualamos al nuevo dato debido a que pasa a ser lo ultimo de la lista teniendo antes que el otro elemento que fue ingresado despues de que entrara dicho dato.
        }
    }
    
    /**
    * Metodo para Buscar elemento en la lista
    */
    
    public void  BuscarDato()//Creamos un metodo para buscar un dato en este caso publico y de tipo void(vacio).
    {
        Nodo actual = new Nodo();//Se crea un nuevo nodo con nombre actual.
        actual = inicio;//A este nuevo nodo de nombre actual le decimos que sea inicio o la cabeza.
        boolean encontrado = false;//Con un primito de java en este caso boolean que solo acpeta valores de tipo verdadero o falso, decimos que la plaabra encontrado sea igual a falso osea que no exista para despues implementarla en el codigo.   
        System.out.println("Ingrese el nombre del cliente  que desea buscar: ");//mensaje para ingresar el dato.
        String Buscado = Teclado.next();//Mediante el uso del metodo Teclado.next ingresamos un dato en este caso a buscado que es de tipo String(caracter).
        if(inicio!=null){  //Creamos un ciclo if en el cual definimos si la cabeza o el incio es igual o diferente de null para que si esta condicion se cumple entre a iterar.
            while(actual!=null && encontrado!=true){ //Dentro del ciclo if creamos un ciclo while con las variables de que actual sean igual o diferente de nulo y como ya itero en el ciclo if entonces contrado tiene que ser true por que por ende ya encontro un elemento.               
                if(actual.dato.equals(Buscado)){ //Dentro de ciclo while creamos un ciclo if el cual tiene como instruccion que si el dato que encontro es igual a que se ingreso o se tiene en la varibale buscando entonces entre a iterar con el mensaje siguiente. 
                    System.out.println("El nombre ("+Buscado+") fue encontrado en la lista de espera");//Mensaje que indica el valor de dato y que fue encontrado.
                    encontrado = true;//como ya fue encontrado entonces esta varibale pasa a ser verdadera debido a que ya existe.
                }
                actual = actual.siguiente;//retornamos el dato de nodo llamado actual y de indica que sea igual al puntero siguiente para con ello seguir el ciclo en caso de que se desee buscar mas elementos
                if(!encontrado){ //Se crea otro if en caso de que la varibale encontrado sea falso esto indica que el dato no existe en la lista o no fue agregado.
                    
                }
            }
        }else{//Si no del ciclo inicial if, si ninguna de los anteriores ciclos se cumple o se cumplena cada una de las indicaciones entonces por ende se indica que la lista esta vacia.         
            System.out.println("La lista esta vacia");//Mensaje que retorna que la lista no tiene datos.
        }
    }
    
    /**
    * Metodo para imprimir el total de elementos en la lista
    * @return temporal
    */
    
    public String VerLista ()//Se crea un mentodo para ver los elementos que contiene la lista en este caso public y de tipo String(caracter) ya que fue como se pidio la implementacion del codigo.
    {
    String temp=" ";//Definimos la palabra temp de tipo string(caracter) y que no contenga ningun mensaje.
    for (Nodo i=inicio; i!=null; i=i.getSiguiente())//Creamos un ciclo while con las varaibles de que i sea igual a la cabeza o inicio y sea diferente o iogual de nulo y el puntero de este dato se devuelva. 
    {
    temp=temp+i.VerNodo()+" ";//Entra a iterar y la varibale temp se indica que sea ver el dato. 
    System.out.printf("\t %s ",i.VerNodo());//Se imprime la lista con los argumentos despues de haber encontrado los datos y tenerlos en orden.
    }
    System.out.println();//Se imprime mensaje vacio para dejar espacio
    return temp;//En caso de que no se cumplan las condicones de los ciclos se retorna temp que es el inicio del metodo, tambien indicaria que la lista esta vacia.
    }
    
    /**
    * Metodo para Reemplazar un  elemento en la lista
    */
    
    public void Reemplazarnodo()//Creamos un metodo para reemplazar un nodo de la lista en este caso publico de tipo void(vacio)
    {
        Nodo actual = new Nodo();//Cremoa un nuevo objeto de nombre actual.
        actual = inicio;//Indicamos que este nodo de nombre actual sea la cabeza o el inicio.
        boolean encontrado = false;//Con un primito de java en este caso boolean que solo acpeta valores de tipo verdadero o falso, decimos que la plaabra encontrado sea igual a falso osea que no exista para despues implementarla en el codigo.    
        String Ntemp = Teclado.next();//Mediante el uso del metodo Teclado.next ingresamos un dato en este caso a Ntemp que es de tipo String(caracter).
        if(inicio!=null){//Creamos un ciclo if en el cual definimos si la cabeza o el incio es igual o diferente de null para que si esta condicion se cumple entre a iterar.
            while(actual!=null && encontrado!=true){//Dentro del ciclo if creamos un ciclo while con las variables de que actual sean igual o diferente de nulo y como ya itero en el ciclo if entonces contrado tiene que ser true por que por ende ya encontro un elemento.
                if(actual.dato.equals(Ntemp)){//Dentro de ciclo while creamos un ciclo if el cual tiene como instruccion que si el dato que encontro es igual a que se ingreso o se tiene en la varibale buscado entonces entre a iterar con el mensaje siguiente.
                    System.out.println("El dato ("+Ntemp+") fue encontrado");//mensaje para imprimir el dato encontrado.
                    System.out.println("Ingresa el nombre del cliente o el nombre de la marca del computador para ser puesto como prioridad en la lista de espera :");//mensaje para ingresar el nuevo dato.
                    actual.dato=Teclado.next();//mediante el uso de Teclado.next ingresamos el nuevo dato para reemplzar el anterior en la varibale actual.dato.
                    encontrado = true;//Como ya fue encontrado entonces esta varibale pasa a ser verdadera debido a que ya existe.
                }
                actual = actual.siguiente;//retornamos el dato de nodo llamado actual y de indica que sea igual al puntero siguiente para con ello seguir el ciclo en caso de que se desee buscar mas elementos
                if(!encontrado){ //Se crea otro if en caso de que la varibale encontrado sea falso esto indica que el dato no existe en la lista o no fue agregado.
                 
                }
            }
        
        }else{//Si no del ciclo inicial if, si ninguna de los anteriores ciclos se cumple o se cumplena cada una de las indicaciones entonces por ende se indica que la lista esta vacia.
            
            System.out.println("La lista esta vacia");//Mensaje que retorna que la lista no tiene datos.
        }
    }
    
    /**
    * Metodo para sacar un elemento en la lista
    */
    
    public void SacarElemento()//Creamos un metodo para sacar un dato en este caso publico y de tipo void(vacio).
    {
        Nodo actual = new Nodo();//Se crea un nuevo nodo con nombre actual.
        actual = inicio;//A este nuevo nodo de nombre actual le decimos que sea inicio o la cabeza.
        Nodo Auxsacar = new Nodo();//Se crea un nuevo nodo con nombre Auxsacar.
        Auxsacar = null;//A este nuevo nodo se le indica que sea nulo o que no contega nada.
        boolean encontrado = false;   //Con un primito de java en este caso boolean que solo acpeta valores de tipo verdadero o falso, decimos que la plaabra encontrado sea igual a falso osea que no exista para despues implementarla en el codigo.     
        System.out.println("Ingrese el nombre del cliente y la marca del computador que ya fue atendido : ");//mensaje de buscar dato para eliminar
        String Buscado = Teclado.next();//Mediante el uso del metodo Teclado.next ingresamos un dato a buscar en este caso a buscado que es de tipo String(caracter).
        if(inicio!=null){ //Creamos un ciclo if en el cual definimos si la cabeza o el incio es igual o diferente de null para que si esta condicion se cumple entre a iterar.
            while(actual!=null && encontrado!=true){ //Dentro del ciclo if creamos un ciclo while con las variables de que actual sean igual o diferente de nulo y como ya itero en el ciclo if entonces contrado tiene que ser true por que por ende ya encontro un elemento.
                if(actual.dato.equals(Buscado)){//Dentro de ciclo while creamos un ciclo if el cual tiene como instruccion que si el dato que encontro es igual a que se ingreso o se tiene en la varibale buscado entonces entre a iterar con el mensaje siguiente.
                    System.out.println("El cliente ("+Buscado+") fue encontrado");
                    if(actual==inicio){ //Creamos un ciclo if con la varibale que si actual es igual a inicio o cabeza entre a interar.
                        inicio = inicio.siguiente;//definimos que inicio sea igual inicio y el puntero siguiente o que equivalga.
                        inicio.anterior = null;//Y el puntero anterior sea igual a null para sacar o qutiar el enlace con la lista.
                    }
                    else if(actual==fin){ //Ahora si el actual es igual o se encuentra en la cola o el final entonces entre a iterar.
                        Auxsacar.siguiente = null;//Implementamos la varibale con el puntero siguiente de Auxsacar y lo igualamos a nulo para eliminar la conexion.
                        fin = Auxsacar;//Decimos que la cola o el final sea igual al valor de Auxsacar pero como se corto en enlace o se igualo a nulo entonces se corta de la lista y por ende se oculta o desaparece.
                    }
                    else{//de otra manera o forma entonces itere.
                        Auxsacar.siguiente = actual.siguiente;//que el Auxsacar que es nulo sea actua.siguiente que por ende entendemos que es nulo o no apunta a nada.
                        actual.siguiente.anterior = Auxsacar;//los punteros de actual tanto el siguiente como el anterior sean igual a Auxsacar pero este es igual a null entonces por ende deja de existir.
                    }
                    System.out.println("El cliente fue eliminado");//Mensaje de que fue eliminado,
                    encontrado = true;//como ya fue encontrado entonces esta varibale pasa a ser verdadera debido a que ya existe.
                
                }actual =actual.siguiente; //retornamos el dato de nodo llamado actual y de indica que sea igual al puntero siguiente para con ello seguir el ciclo en caso de que se desee buscar mas elementos
                if(!encontrado){ //Se crea otro if en caso de que la varibale encontrado sea falso esto indica que el dato no existe en la lista o no fue agregado.
                    
                    System.out.println("El cliente no fue encontrado");//por ende se imprime mensaje de que el dato no fue encontrado.
                }
            }
        }else{//Si no del ciclo inicial if, si ninguna de los anteriores ciclos se cumple o se cumplena cada una de las indicaciones entonces por ende se indica que la lista esta vacia.
            
            System.out.println("la lista esta vacia");//Mensaje que retorna que la lista no tiene datos.
        }
    }
    
    /**
    * Metodo para sacar un elemento en cierta posicon de la lista
    * @return nulo
    */
    
    public String Elementociertapos(){ //Creamos un metodo para elimar un elemento de una cierta posicion.
        int Contador = 0;//Definimos un contador de tipo entero que empiece desde cero.
        Nodo Actual = inicio;//El nodo actual le decimos que sea igual a la cabeza o el inicio.
        System.out.println("Ingrese la posicon del cliente a buscar :" );//mensaje de dato a buscar.
        int Posicion = Teclado.nextInt();//Se ingresa un numero de la lista para buscarlo entonces con el metodo Teclado.nextInt que es para ingresar numeros enteros se inserta en la variable Posicion.
        while (Actual != null) { //Se crea un ciclo while con la variable de que Actual sea diferente de nulo osea que contenga algo para que entre a iterar.
            if (Contador == 0 && Posicion == 0) {//Se crea dentro del ciclo while un ciclo if con variables de que el contador y la posicion esten en cero y entre a iterar. 
                Actual = inicio;//Deicmos que el nodo de nombre actual sea igual a la cabeza.
                System.out.println("El cliente : ("+ Actual.dato +") se encuentra en la posicion ("+   Posicion   +   ";");//imprimos el elemento encontrao y su posicion.
                return Actual.dato;//retornamos el dato actual que fue encontrado.
            }
            else if (Contador == Posicion ){//Ahora si el contador es igual a la posicion entonces entra a iterar.
                System.out.println("El cliente : ("+ Actual.dato +") se encuentra en la posicion ("+   Posicion   +   ";");//mensaje de elemento encontrado y posicion.
                return Actual.dato;//retonramos el dato actual que fue encontrado. 
            }                
            Actual= Actual.siguiente;//retornamos el dato de nodo llamado actual y de indica que sea igual al puntero siguiente para con ello seguir el ciclo en caso de que se desee buscar mas elementos
           Contador++;//como ya se itero una vez por que estas condicones se cumplieron entonces se agrega un dato al contador  o un numero.
        }
        return null;//En caso de que ninguno de estas condicones se cumplan se retorna a nulo o nada y se sale del programa.    
} 
    
    /**
    * Metodo para Sacar un elemento especifido  la lista
    * @return nulo
    */
    
    public String SacardatoPos(){//Creamos un  metodo para sacar un dato de una posicion en especifico de la lista que es publico el metodo y de tipo String(caracter).
        int Contador=0;//Definimos un contador de tipo entero que empiece desde cero.
        Nodo actual = inicio;//Se crea un nuevo nodo con nombre actual.
        Nodo Auxanterior = new Nodo();//Se crea un nuevo nodo con nombre Auxanterior.
        Auxanterior = null;//A este nuevo nodo se le indica que sea nulo o que no contega nada.
        System.out.println("Ingrese la posicion del cliente o la marca del pc  que desea sacar de la lista:");//mensaje de ingresar posicion
        System.out.println("Recuerda que el programa empieza desde el numero cero (0).");//mensaje para saber desde donde indexa java
        int Posicion=Teclado.nextInt();//Se ingresa un numero de la lista para buscarlo entonces con el metodo Teclado.nextInt que es para ingresar numeros enteros se inserta en la variable Posicion.
        while (actual != null) {
            if (Contador == 0 && Posicion == 0) {//cfreamos un ciclo if dentro del while que contanga las variables de contador igual a cero y posicion igual a cero para que entre a iterar.
                actual = inicio;//definimos que el nodo de nombre actual 
                System.out.println("En la Posicion (" + Posicion + ") se encontro el cliente o la marca del pc (" + actual.dato + ") que sera Eliminado");//Imprima mensaje de la posicion donde se cuentra el elemento y el nombre.
                inicio = inicio.siguiente;//definimos que inicio sea igual inicio y el puntero siguiente o que equivalga.
                inicio.anterior = null;//Y el puntero anterior sea igual a null para sacar o qutiar el enlace con la lista.
                return actual.dato;//retornamos el dato actual. 
            }
            else if (Contador == Posicion ){//Ahora si el contador es igual a la posicion entonces entra a iterar.
                System.out.println("En la Posicion (" + Posicion + ") se encontro el cliente o la marca del pc (" + actual.dato + ") que sera Eliminado");//Imprima mensaje de la posicion donde se cuentra el elemento y el nombre.
               Auxanterior = actual.anterior;//Auxanterior sea igual a acutal.anterior para igualar los datos.
               Auxanterior.siguiente = actual.siguiente;//se igualan los punteros como en la linea anterior se indican que se cree la union asi mismos.
               Auxanterior.anterior = null;//se define que Auxanterior sea nulo con ello se completa la elimiancion del elemento.   
               return actual.dato;//retornamos el dato actual. 
            }                              
            actual= actual.siguiente;//retornamos el dato de nodo llamado actual y de indica que sea igual al puntero siguiente para con ello seguir el ciclo en caso de que se desee buscar mas elementos
            Contador++;//como ya intero entonces se incremente en 1 en contador que fue la iteracion que hizo.
        }
        System.out.println("la lista esta vacia");//mensaje de que la lista no tiene nada.
        return null;//En caso de que ninguna de las condiciones se cumplan retorne nulo y salga del programa o metodo.
}
    
    /**
     * Metodo auxiliar creado para el metodo concatenar lista.
     * @param dato 
     */
    
    
    public void AuxDlist(String dato){  //la explicacion de este metod es identica al metodo de insertarNoda.
        Nodo nuevo = new Nodo();
        nuevo.dato=dato;
                
        if(inicio == null){
            fin = nuevo;
            inicio.siguiente = null;
            inicio.anterior = null;
            fin = nuevo;
        }
        else{
            fin.siguiente = nuevo;
            nuevo.siguiente = null;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }
    
    /**
    * Metodo para unir dos listas.
    *@param listanueva
    *@return 
    */
    public String concatenar(Lista_doble  listanueva){ //Creamos un metodo publico de tipo string y se le anexa nombre concatenar el cual nos va a unir las dos litas.
        Nodo nuevo = listanueva.inicio; //se crea un nodo nuevo y se le asigna a la variable lista nueva que sera el inicio. 
    while (nuevo != null){ //Creamos un ciclo while para saber si el nuevo es diferente de nulo esto quiere decir si existe un dato en la lista.
        AuxDlist(nuevo.dato); //llamamos a metodo anerior mente creado para validar.
        nuevo=nuevo.siguiente; //igualamos que el dato nuevo siga la lista con siguiente para los demas datos que tenemos.
}
        return null; //en caso de que la varibale no se cumpla retornamos nulo para que vuelva a iniciar.
    
    }
}