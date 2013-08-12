package co.edu.um.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 11/08/13
 * Time: 09:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodoLeg<W> {

    W dato;
    NodoLeg <W> siguiente;
    NodoLeg (W dato){
        this (dato, null);
    }
    NodoLeg(W dato, NodoLeg<W> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
