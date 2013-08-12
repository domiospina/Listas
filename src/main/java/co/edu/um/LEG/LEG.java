package co.edu.um.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 11/08/13
 * Time: 09:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG <W>{
    protected NodoLeg<W> primero;
    protected int talla;
    private NodoLeg<W> ant;

    public LEG (){
        primero = null;
        talla = 0;

    }
    public void talla(){

    }
    public void insertar (W x){
        NodoLeg<W> nuevo= new NodoLeg<W>(x);
        nuevo.siguiente=primero;
        primero=nuevo;
        this.talla ++;

    }
    public void insertarEnFin (W x){
        NodoLeg<W> nl= new NodoLeg<W>(x);
        this.talla ++;
        NodoLeg<W> aux = primero;
        if  (aux == null) {
            primero = nl;
        }
        else {
            while (aux.siguiente != null) {
                aux = aux.siguiente;
                aux.siguiente = nl;
            }
        }


    }
    public void eliminar(W x) {
        NodoLeg<W> aux = primero;

        boolean res = false;
        while (aux != null){
            ant=aux;
            aux=aux.siguiente;
        }
        if (aux != null){
            res = true;
            this.talla -- ;
            if (ant == null) {
                primero =aux.siguiente;


                ant.siguiente = aux.siguiente;

            }

        }


    }
    public String toString(){
        String res ="";
        for (NodoLeg<W> aux = primero;
             aux != null;
             aux=aux.siguiente) {
            res += aux.dato.toString()+"\n";
            //return res;
        }


        return res;
    }
}
