package colecciones;

public class nodo {
    public int Id;
    public nodo siguientenodo;

    //constructor sin parametro
    nodo(){}    
    //constructor con 1 parametro
    public nodo(int Id){
        this.Id=Id;
    }
    //constructor con 2 parametros
    public nodo(int Id, nodo siguientenodo) {
        this.Id = Id;
        this.siguientenodo = siguientenodo;
    }   
}
