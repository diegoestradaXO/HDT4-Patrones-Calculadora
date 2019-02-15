/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Calculadora: implementación
 */
public class Calc implements Calculadora {

	/**
	 * ArrayList que se utiliza para calcular las operaciones
	 */
         StackFactory stackF= new StackFactory();
	 private Stack<String> miStack;
         private static Calc miCalc;
         
	/**
	 * Constructor de la clase
         * @param forma es la forma de la implementacion que va a devolver
	 */
	private Calc(String forma) {
		
                miStack=stackF.getImplementacion(forma);
	}
        /**
         * Este static es el getCalc
         * @param forma la forma de la implementacion
         * @return una instancia unica de cada objeto
         */
        public static Calc getCalc(String forma){
            if (miCalc==null) {
                miCalc= new Calc(forma);
            }
            return miCalc;
        }

	/**
         * Este método retorna un stack
         * @return un objeto tipo String de mi 
         */
	public Stack<String> getMiStack() {
		return miStack;
	}

	/**
         * Este método setea un STack
         * @param miStack un objeto tipo Stack
         */
	public void setMiStack(Stack<String> miStack) {
		this.miStack = miStack;
	}

	/**
         *  * Es el método que se encarga de calcular el resultado de la operación en el
	 * archivo de texto por medio de los métodos descritos anteriormente
         * @param expresion es la expresion a operar
         * @return un double con el resultado
         */
         @Override
	public double operar(String expresion) {
		double resultado = 0;
		String subcadena = "";
		boolean execute = true;

		// For que corrobora que la expresión contenga únicamente caracteres válidos
		for (int i = 0; i < expresion.length(); i++) {
			if (expresion.substring(i, i + 1).contains("1") == false
					&& expresion.substring(i, i + 1).contains("2") == false
					&& expresion.substring(i, i + 1).contains("3") == false
					&& expresion.substring(i, i + 1).contains("4") == false
					&& expresion.substring(i, i + 1).contains("5") == false
					&& expresion.substring(i, i + 1).contains("6") == false
					&& expresion.substring(i, i + 1).contains("7") == false
					&& expresion.substring(i, i + 1).contains("8") == false
					&& expresion.substring(i, i + 1).contains("9") == false
					&& expresion.substring(i, i + 1).contains(" ") == false
					&& expresion.substring(i, i + 1).contains("+") == false
					&& expresion.substring(i, i + 1).contains("-") == false
					&& expresion.substring(i, i + 1).contains("*") == false
					&& expresion.substring(i, i + 1).contains("/") == false) {
				execute = false;
			}
		}
		// System.out.println(execute);
		if (execute == true) {// Si los caracteres de la expresión son válidos, ejecuta la operación
			for (int i = 0; i < expresion.length(); i++) {
				subcadena = expresion.substring(i, i + 1);
				// System.out.println(subcadena + "...subcadena");
				if (!" ".equals(subcadena)) {
					// System.out.println("Entro al if");
					switch (subcadena) {
					case "+":
						// System.out.println("Entro a suma");
						// System.out.println(miStack.peek());
						// System.out.println("Sí pasa el peek");
						sumar();
						continue;
					case "-":
						restar();
						continue;
					case "*":
						multiplicar();
						continue;
					case "/":
						dividir();
						continue;
					default:
						miStack.push(subcadena);
						// System.out.println("holi");
						// System.out.println(miStack.peek());
						// System.out.println("bye");
						continue;
					}
				}
				// System.out.println(miStack.peek());

			}
			resultado = Double.parseDouble(miStack.pop());
		} else {
			resultado = Double.NaN;
		}

		return resultado;
	}

	/**
	 * Método para sumar en la lista
	 */
	private void sumar() {
		double suma;
		// System.out.println("Entro al método de suma");
		double a = Double.parseDouble(miStack.pop());
		// System.out.println(a);
		double b = Double.parseDouble(miStack.pop());
		// System.out.println(b);
		suma = a + b;
		miStack.push(String.valueOf(suma));
	}

	/**
	 * Método para restar en la lista
	 */
	private void restar() {
		double resta;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		resta = b - a;
		miStack.push(String.valueOf(resta));
	}

	/**
	 * Método para multiplicar en la lista
	 */
	private void multiplicar() {
		double multiplicacion;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		multiplicacion = b * a;
		miStack.push(String.valueOf(multiplicacion));
	}

	/**
	 * Método para dividir en la lista
	 */
	private void dividir() {
		double division;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());

		// Try para prevenir la división dentro de 0.
		try {
			division = b / a;
		} catch (Exception e) {
			miStack.push(String.valueOf(Double.NaN));
		}
		division = b / a;

		miStack.push(String.valueOf(division));
	}

}
