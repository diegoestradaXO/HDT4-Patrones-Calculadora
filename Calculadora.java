
/**
 * Interfaz de la calculadora
 */
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 * Calculadora: Interfaz
 */
public interface Calculadora {

    /**
     * Metodo operar que se le dará cuerpo luego
     * @param expresion es la expresion a operar
     * @return Resultado de la operacion dependiendo si es suma, resta, multiplicacion o division
     */
    double operar(String expresion);
}
