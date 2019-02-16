
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de clase Calculadora
 */
/*
 * Hoja de trabajo No.4, Patrones de Diseño
 * Algoritmos y Estructuras de Datos
 * Created by Maria Isabel Ortiz Naranjo 18176
 * Created by Diego Estrada 18540
 */
public class CalcTest {

    public CalcTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test de operar
     */
    @Test
    public void testOperar() {
        System.out.println("Hacer la operacion");
        String expresion = "15*4+2-";
        Calc instance = Calc.getCalc("1");
        double expResult = 7;
        double result = instance.operar(expresion);
        assertEquals(expResult, result, 0.0);
        if (!(expResult == result)){
            fail("La operacion fallo");
        }
    }

}



