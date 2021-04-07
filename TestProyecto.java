
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestProyecto {

    /*
     * VARIABLES
     */

    @Test
    public void testWrite() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(write 'UVG)");
        assertEquals(evaluar, "UVG");
    }

    @Test
    public void testSetQ() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(setq universidad 'UVG)");
        assertEquals(evaluar, "");
    }

    /*
     * LISTAS
     */
    @Test
    public void testFirst() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(first '(a b c)");
        assertEquals(evaluar, "a");
    }

    @Test
    public void testSecond() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(second '(a b c)");
        assertEquals(evaluar, "b");
    }

    @Test
    public void testThirtd() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(thirtd '(a b c)");
        assertEquals(evaluar, "c");
    }

    @Test
    public void testNth() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(nth 1 '(a b c)");
        assertEquals(evaluar, "a");
    }

    @Test
    public void testAppend() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(nth '(a b c) '(e f))");
        assertEquals(evaluar, "a b c e f");
    }

    @Test
    public void testLast() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(last '(a b c))");
        assertEquals(evaluar, "c");
    }

    /*
     * FUNCIONES
     */
    @Test
    public void testDefun() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(defun sum '((a b) (+ a b)))");
        assertEquals(evaluar, "");
    }

    /*
     * CONDICIONALES
     */
    @Test
    public void testEcuals() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(ecuals 10 10)");
        assertEquals(evaluar, "T");
    }

    @Test
    public void testEcuals2() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(ecuals 'A 2)");
        assertEquals(evaluar, "nill");
    }

    @Test
    public void testNumberp() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(numberp 'b)");
        assertEquals(evaluar, "nill");
    }

    @Test
    public void testNumberp2() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(numberp 5)");
        assertEquals(evaluar, "T");
    }

    /*
     * PREDICADOS
     */
    @Test
    public void testEval() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(eval (+ 1 2))");
        assertEquals(evaluar, "3");
    }

    @Test
    public void testEval2() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(eval (/ 1 2))");
        assertEquals(evaluar, "0.5");
    }

    @Test
    public void testOperaciones() {
        Interprete interprete = new Interprete();
        String evaluar = interprete.evaluar("(+ 1 2)");
        assertEquals(evaluar, "3");
    }

}
