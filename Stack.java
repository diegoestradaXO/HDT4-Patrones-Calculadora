/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */

/**
 * Interfaz para pila
 * @param <E> generico
 */
public interface Stack<E> {
    //Métodos de la interfaz Stack
    public void push(E item);

    public E pop();

    public E peek();

    public boolean empty();

    public int size();

}