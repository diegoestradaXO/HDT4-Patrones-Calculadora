
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */
/**
 * Nodo
 * @param <E> generico
 */
class Node<E> {
    protected E data;
    protected Node<E> nextElement;

    /**
     * @param v es un dato
     * @param next es un dato
     */

    public Node(E v, Node<E> next)

    {
        data = v;
        nextElement = next;
    }

    /**
     * @param v es un dato
     */
    public Node(E v)

    {
        this(v,null);
    }

    /**
     * @return el siguiente elemento
     */
    public Node<E> next()

    {
        return nextElement;
    }

    /**
     * @param next elemento
     */
    public void setNext(Node<E> next)

    {
        nextElement = next;
    }

    /**
     * @return datos
     */
    public E value()

    {
        return data;
    }

    /**
     * @param value valor del elemento
     */
    public void setValue(E value)

    {
        data = value;
    }
}
