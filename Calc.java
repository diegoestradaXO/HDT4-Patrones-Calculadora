/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 *  Calculadora: implementación
 */
public class Calc implements Calculadora {
	//Utilizacion de Factory
     StackFactory stackF= new StackFactory();
	 private Stack<String> miStack;
         private static Calc miCalc;
         
	//Constructor
	private Calc(String forma) {
		
                miStack=stackF.getImplementacion(forma);
	}
		/*
			SINGLETON
		 */
        public static Calc getCalc(String forma){
            if (miCalc==null) {//Si no existe una calculadora, la crea
                miCalc= new Calc(forma);
            }
            return miCalc;//Si ya existe, la retorna
        }


	public Stack<String> getMiStack() {
		return miStack;
	}


	public void setMiStack(Stack<String> miStack) {
		this.miStack = miStack;
	}

         @Override
	public double operar(String expresion) {
		double resultado = 0;
		String subcadena = "";
		boolean execute = true;

		// Ciclo 'For' que verifica que la expresión tenga únicamente caracteres válidos
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

		if (execute == true) {//Realiza operacion si lo anterior es true
			for (int i = 0; i < expresion.length(); i++) {
				subcadena = expresion.substring(i, i + 1);
				if (!" ".equals(subcadena)) {
					switch (subcadena) {
					case "+":
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
						continue;
					}
				}
			}
			resultado = Double.parseDouble(miStack.pop());
		} else {
			resultado = Double.NaN;
		}

		return resultado;
	}
		 //Método para sumar
	private void sumar() {
		double suma;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		suma = a + b;
		miStack.push(String.valueOf(suma));
	}

	//Metodo para restar
	private void restar() {
		double resta;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		resta = b - a;
		miStack.push(String.valueOf(resta));
	}

	//Metodo para multiplicar
	private void multiplicar() {
		double multiplicacion;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());
		multiplicacion = b * a;
		miStack.push(String.valueOf(multiplicacion));
	}

	//Metodo para dividr
	private void dividir() {
		double division;
		double a = Double.parseDouble(miStack.pop());
		double b = Double.parseDouble(miStack.pop());

		//Revision de la division por 0
		try {
			division = b / a;
		} catch (Exception e) {
			miStack.push(String.valueOf(Double.NaN));
		}
		division = b / a;
		miStack.push(String.valueOf(division));
	}

}
