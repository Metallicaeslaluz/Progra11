
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SensorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SensorTest
{
    /**
     * Default constructor for test class SensorTest
     */
    public SensorTest()
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
    
    
    //Identificador de usuario caso lista vaciaMOCK
    @Test
    public void xxxxxxxxTest(){
        Registro regMock = mock(Registro.class);
        Cliente clienteMock = mock(Cliente.class);
        when(regMock.buscarCI("12404624")).thenReturn(null);
        Sensor sensor = new Sensor();
        assertFalse(sensor.comprobarRegistro(regMock,"12404624"));
    }
    
    //caso no vacia
    @Test
    public void xxxxxxx1Test(){
        Registro regMock = mock(Registro.class);
        EstadoCliente estate = new EstadoCliente(60,170);
        Cliente cliente = new Cliente("12404624",estate);
        when(regMock.buscarCI("12404624")).thenReturn(null);
        Sensor sensor = new Sensor();
        assertTrue(sensor.comprobarRegistro(regMock,"12404624"));
    }
}
