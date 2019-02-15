import java.util.Iterator;
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Lista Doble
 * @param <E> un genérico
 */

public interface List<E> extends Stack<E>{
    @Override
    public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void addFirst(E value);
   // post: value is added to beginning of list

   public void addLast(E value);
   // post: value is added to end of list

   public E getFirst();
   // pre: list is not empty
   // post: returns first value in list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list
   
   public boolean contains(E value);
   // pre: value is not null
   // post: returns true iff list contains an object equal to value

  

 
    
}
