/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Patrón de diseño: Factory
 */
public class StackFactory {

    public Stack getImplementacion(String forma){

        //Factory que, dependiendo del parametro string, creara una instancia del tipo a utilizar.

        if ("1".equals(forma)) {
            System.out.println("ArrayList");
            return new StackArrayList();
            
        }
        else if (forma.equals("2")) {
            System.out.println("Vector");
            return new StackVector();
        }
        else if (forma.equals("3")) {
            System.out.println("Single List");
            return new SinglyLinkedList();
        }
        else if(forma.equals("4")){
            System.out.print("Circular List");
            return new CircularList();
        }
        else if (forma.equals("5")) {
            System.out.println("DoubleLinked List");
            return new DoublyLinkedList();
        }
        return null;
    }
}
