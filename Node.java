/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Nodo
 */
class Node<E> {
     protected E data;
   protected Node<E> nextElement;

   public Node(E v, Node<E> next)

   {
       data = v;
       nextElement = next;
   }

   public Node(E v)

   {
      this(v,null);
   }

   public Node<E> next()

   {
      return nextElement;
   }

   public void setNext(Node<E> next)

   {
      nextElement = next;
   }

   public E value()

   {
      return data;
   }

   public void setValue(E value)

   {
      data = value;
   }
}
