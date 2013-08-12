package co.edu.um.LEG;

/**
 * Created with IntelliJ IDEA.
 * User: Usuario
 * Date: 11/08/13
 * Time: 09:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestLista {
    public static void main (String args[]){
        LEG<Integer> l = new LEG<Integer>();
        l.insertar(new Integer(9));
        l.insertar(new Integer(12));
        System.out.println ("Lista de integer actual:\n" + l.toString());
        System.out.println ("Borrando de la lista el 10");
        if (l.eliminar(new Integer(10))){
            System.out.println("Elemento inexistente");
        }
    }
}
