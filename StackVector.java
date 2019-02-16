import java.util.Vector;
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */

/**
 * Implementación de Pila para ArrayList
 * @param <E> generico
 */
public class StackVector<E> implements Stack<E>{
    protected Vector<E> data;

    /**
     * Metodo StackVextor
     */
    public StackVector() {
        data= new Vector<>();
    }

    /**
     * @param item nombre de la pila
     */
    @Override
    public void push(E item) {
        data.addElement(item);
    }

    /**
     * @return elimina un objeto
     */
    @Override
    public E pop() {
        return data.remove(size()-1);
    }

    /**
     * @return el tamano de los datos
     */
    @Override
    public E peek() {
        return data.get(size()-1);
    }

    /**
     * @return devuelve si esta vacio
     */
    @Override
    public boolean empty() {
        return size()==0;
    }

    /**
     * @return size
     */
    @Override
    public int size() {
        return data.size();
    }

}