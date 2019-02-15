/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Lista Circular
 */
public class CircularList<E> extends AbstractList<E>{

    protected Node<E> tail; 
    protected int count;
    
    /**
     * Constructor de la clase
     */
    public CircularList()
    {
        tail = null;
        count = 0;
    }
    
    /**
     * método para agregar al inicio
     * @param value un genérico
     */
    @Override
    public void addFirst(E value) {
       Node<E> temp = new Node<E>(value);
       if(tail == null){
           tail = temp;
           tail.setNext(tail);
       }else{
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }
    /**
     * método para agregar al tail
     * @param value un genérico para el tail
     */
    @Override
    public void addLast(E value) {
       addFirst(value);
       tail = tail.next();
    }
    /**
     * método para remover el primer elemento
     * @return un genérico E
     */
    @Override
    public E removeFirst() {
        Node<E> finger = tail;
        while(finger.next() != tail){
            finger = finger.next();
        }
        Node<E> temp = tail;
        if(finger == tail){
            tail = null;
        }else{
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }
    /**
     * el método contains heredado de la interfaz
     * @param value un genérico
     * @return un boolean con true o false
     */
    @Override
    public boolean contains(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Método heredado de la interfaz de Stack, es para pushear un valor
     * @param item un genérico para agregar
     */
    @Override
    public void push(E item) {
       addFirst(item);
    }
    /**
     * Retira el primer elemento de la lista lo retorna y lo borra
     * @return un genérico E
     */
    @Override
    public E pop() {
        return  removeFirst();
    }
    /**
     * Selecciona el primer elemento
     * @return un genérico
     */
    @Override
    public E peek() {
        return getFirst();
    }
    /**
     * Un método heredado de size
     * @return un entero
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * getFirst elemento es el método para obtener el primer elemento
     * @return un genérico E
     */
    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
