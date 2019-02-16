
import java.util.Iterator;

/**
 * Lista Simplemente encadenada
 * @param <E> un genérico
 */
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */
public class SinglyLinkedList<E> extends AbstractList<E>{

    protected int count;
    protected Node<E> head;

    public SinglyLinkedList()

    {
        head = null;
        count = 0;
    }

    @Override
    public int size()

    {
        return count;
    }

    @Override
    public void addFirst(E value)

    {

        head = new Node<>(value, head);
        count++;
    }
    @Override
    public E removeFirst()

    {
        Node<E> temp = head;
        head = head.next();
        count--;
        return temp.value();
    }

    @Override
    public E getFirst()

    {
        return head.value();
    }
    @Override
    public void addLast(E value)

    {
        Node<E> temp = new Node<>(value,null);
        if (head != null)
        {

            Node<E> finger = head;
            while (finger.next() != null)
            {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;

        count++;

    }

    @Override
    public boolean contains(E value)

    {
        Node<E> finger = head;

        while (finger != null &&
                !finger.value().equals(value))
        {
            finger = finger.next();
        }
        return finger != null;
    }

    //Métodos de la clase Stack

    @Override
    public void push(E item) {
        addFirst(item);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public E peek() {
        return getFirst();
    }



}