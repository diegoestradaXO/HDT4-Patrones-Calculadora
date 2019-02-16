
/**
 * Lista Doble
 * @param <E> un genérico
 */
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */
public interface List<E> extends Stack<E>{
        /**
         * @return size
         */
        @Override
        public int size();

        /**
         * @return is empty
         */
        public boolean isEmpty();

        /**
         * @param value addFirst
         */
        public void addFirst(E value);

        /**
         * @param value addLast
         */
        public void addLast(E value);

        /**
         * @return getFirst
         */
        public E getFirst();

        /**
         * @return removeFirst
         */
        public E removeFirst();

        /**
         * @param value valor
         * @return contains
         */
        public boolean contains(E value);

    }
