package cl.praxis;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import cl.praxis.model.Calculadora;

public class CalculadoraTest {
    private static final Logger logger = Logger.getLogger(CalculadoraTest.class.getName());
    private static final Calculadora calculadora = new Calculadora();
    private int numero1;
    private int numero2;

    @BeforeAll
    public static void init(){
        logger.warning("-> Inicio de los test de la clase Calculadora");
    }

    @BeforeEach
    public void initEach(){
        logger.info("-> Inicio del test");
    }

    @AfterEach
    public void closeEach(){
        logger.info("-> Fin del test");
    }

    @AfterAll
    public static void close(){
        logger.warning("-> Fin de los test de la clase Calculadora");

    }

    @Test
    public void testConstructorConParametros() {
        logger.info("Test para constructor con parámetros");
        numero1 = 10;
        numero2 = 5;
        Calculadora calculadoraConParametros = new Calculadora(numero1, numero2);
        assertEquals(numero1, calculadoraConParametros.getNumero1());
        assertEquals(numero2, calculadoraConParametros.getNumero2());
        logger.info("El test para constructor con parámetros funciona correctamente");
    }

    @Test
    public void testGettersAndSetters() {
        logger.info("Test para getters y setters");
        numero1 = 10;
        numero2 = 5;
        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);
        assertEquals(numero1, calculadora.getNumero1());
        assertEquals(numero2, calculadora.getNumero2());
        logger.info("El test para getters y setters funciona correctamente");
    }

    @Test
    public void testSumar() {
        logger.info("Test para sumar dos números");
        numero1 = 10;
        numero2 = 5;
        assertEquals(15, calculadora.sumar(numero1, numero2));
        logger.info("El test para sumar dos números funciona correctamente");
    }

    @Test
    public void testRestar() {
        logger.info("Test para restar dos números");
        numero1 = 10;
        numero2 = 5;
        assertEquals(5, calculadora.restar(numero1, numero2));
        logger.info("El test para restar dos números funciona correctamente");
    }

    @Test
    public void testMultiplicar() {
        logger.info("Test para multiplicar dos números");
        numero1 = 10;
        numero2 = 5;
        assertEquals(50, calculadora.multiplicar(numero1, numero2));
        logger.info("El test para multiplicar dos números funciona correctamente");
    }

    @Test
    public void testDividir() {
        logger.info("Test para dividir dos números");
        numero1 = 10;
        numero2 = 5;
        assertEquals(2, calculadora.dividir(numero1, numero2));
        logger.info("El test para dividir dos números funciona correctamente");
    }

    @Test
    public void testDividirPorCero() {
        numero1 = 10;
        numero2 = 0;
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculadora.dividir(numero1, numero2));
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }


}