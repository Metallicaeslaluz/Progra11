
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
    
    //comprobar Identidad existente
    @Test
    public void aaaaaaaaaaaaTest(){
        Sensor sensor = new Sensor();
        Registro reg = mock(Registro.class);
        Cliente cliente = mock(Cliente.class);
        when(reg.buscarCI("12404624")).thenReturn(cliente);
        assertTrue(sensor.comprobarRegistro(reg,"12404624"));
    }
    
    //Calorias qumadas cliente null
    @Test
    public void qqqqqqqqqTest(){
        Registro registroMock= mock(Registro.class);
        Sensor sensor= new Sensor();
        when(registroMock.buscarCI("1234")).thenReturn(null);
        assertFalse(sensor.comprobarRegistro(registroMock, "1234"));
        assertEquals(0.0 , sensor.calcularCalorias(30.0,3), 0.0);   
    }
    
    //ciente no null
    @Test
    public void quemarCalorias2(){
        Registro registroMock= mock(Registro.class);
        Sensor sensor= new Sensor();
        MaquinasFuerza maquina= new Mancuernas(); 
        Cliente cliente= new Cliente("1234" , 60.0, 170.1);
        when(registroMock.buscarCI("1234")).thenReturn(cliente);
        assertTrue(sensor.comprobarRegistro(registroMock, "1234"));
        assertEquals(94.5 , sensor.calcularCalorias(30.0,3), 0.0);
    }
}
