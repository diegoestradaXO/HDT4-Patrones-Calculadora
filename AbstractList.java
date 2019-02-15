/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Clase abstracta para Lista
 */
public abstract class AbstractList<E> implements List<E>{
    /**
     * Este es el constructor
     */
   public AbstractList()
   {
   }

    @Override
   public boolean isEmpty()

   {
      return size() == 0;
   }


   @Override
   public boolean empty(){
       return size()==0;
   }




}
