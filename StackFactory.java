/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Patrón de diseño: Factory
 */
public class StackFactory {

    public Stack getImplementacion(String forma){
        if ("1".equals(forma)) {
            System.out.println("USASTE ARRAYLIST");
            return new StackArrayList();
            
        }
        else if (forma.equals("2")) {
            System.out.println("USASTE Vector");
            return new StackVector();
        }
        else if (forma.equals("3")) {
            System.out.println("USASTE List single");
            return new SinglyLinkedList();
        }
        else if(forma.equals("4")){
            System.out.print("USASTE List Circular");
            return new CircularList();
        }
        else if (forma.equals("5")) {
            System.out.println("Usaste DoubleLinked List");
            return new DoublyLinkedList();
        }
        return null;
    }
}
