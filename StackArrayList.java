import java.util.ArrayList;
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Implementación de Pila para ArrayList
 */

public class StackArrayList<E> implements Stack<E>{
    protected ArrayList<E> data;

	public StackArrayList()
	{
		data = new ArrayList<>();
	}

    @Override
	public void push(E item)
	{
		data.add(item);

	}

    @Override
	public E pop()

	{
		return data.remove(size() - 1);
	}

    @Override
	public E peek()
	{
		return data.get(size() - 1);
	}

    @Override
	public int size()
	{
		return data.size();
	}

    @Override
	public boolean empty()
	{
		return size() == 0;
	}
}
