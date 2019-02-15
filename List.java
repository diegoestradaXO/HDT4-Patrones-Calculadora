import java.util.Iterator;
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Lista Doble
 */

public interface List<E> extends Stack<E>{
    @Override
    public int size();

   public boolean isEmpty();


   public void addFirst(E value);


   public void addLast(E value);


   public E getFirst();


   public E removeFirst();

   public boolean contains(E value);

  

 
    
}
