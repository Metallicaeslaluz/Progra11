

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class clienteTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class clienteTest
{
    /**
     * Default constructor for test class clienteTest
     */
    public clienteTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void eee(){
        EstadoCliente estadoC= new EstadoCliente(60.0 , 170.1);
        Cliente cliente= new Cliente("1234", estadoC);
        assertEquals(60.0 , cliente.getPeso(),0.0);
    }
}
