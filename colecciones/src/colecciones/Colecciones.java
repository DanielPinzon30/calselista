package colecciones;

import java.util.LinkedList;

public class Colecciones {

    public static void main(String[] args) {
        //Lista Enlazada
      /*  ListaEnlazada lista=new ListaEnlazada();
        System.out.println("Tamaño lista: "+lista.getTamanoLista());
        lista.agregarNuevoNodo(1);
        System.out.println("Tamaño lista: "+lista.getTamanoLista());
        lista.agregarNuevoNodo(2);
        lista.agregarNuevoNodo(3);
        System.out.println("Tamaño lista: "+lista.getTamanoLista());*/
        
        LinkedList<String> listaenteros=new LinkedList<String>();
         System.out.println("Tamaño Lista: "+listaenteros.size());
        listaenteros.add("daniel");
       
         listaenteros.add("alejandro");
         listaenteros.add("pinzon");
        System.out.println("Tamaño Lista: "+listaenteros.size());
    }
    
}
