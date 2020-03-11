package colecciones;

public class ListaEnlazada {
    public nodo nodoRaiz;
    public int tamano;

    public ListaEnlazada() {
    this.tamano=0;
    this.nodoRaiz=new nodo();
    }

    //Tamaño de la lista
    public int getTamanoLista() {
        return this.tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    //Agregar nuevo nodo
    public void agregarNuevoNodo(int Identificador){
        nodo nuevonodo=new nodo(Identificador);
        nodo nodoactual=this.nodoRaiz;
        while(nodoactual != null){
            if(nodoactual.siguientenodo==null){
                nodoactual.siguientenodo=nuevonodo;
                this.tamano++;
                break;
            }
        }
    }
    
    //Remover nodo
    public boolean removerNodo(int Identificador){
        nodo nodoactual=this.nodoRaiz;
        nodo nodoanterior=null;
        while(nodoactual !=null){
            if(nodoactual.Id==Identificador){
                nodoanterior.siguientenodo=nodoactual.siguientenodo;
                this.tamano--;
                return true;
            }else{
                nodoanterior=nodoactual;
                nodoactual=nodoactual.siguientenodo;
            }
        }
        return false;        
    }
    
    //Buscar nodo
    public nodo buscarnodo(int Id){
        nodo nodoactual=this.nodoRaiz;
         while(nodoactual != null){
            if(nodoactual.Id==Id){
               return nodoactual;
            }else{
                nodoactual=nodoactual.siguientenodo;
            }
        }
        return null;        
    }
    
    public void imprimirlista(){
        nodo nodoactual=this.nodoRaiz;
        while(nodoactual != null){
                System.out.println("Id: "+nodoactual.Id);
                nodoactual=nodoactual.siguientenodo;
            
        }
    }
    
}
