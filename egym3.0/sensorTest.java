
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class sensor2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class sensorTest
{
    /**
     * Default constructor for test class sensor2Test
     */
    public sensorTest()
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
    //identificador de usuario
    //cuando existe el cliente
    @Test
    public void yyy(){
        String ci="12345";
        Cliente cliente= new Cliente(ci, 60.0);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        Sensor sensor= new Sensor();
        assertTrue(sensor.comprobarRegistro(registro , ci));
    }
    //y cuando no existe el cliente
    @Test
    public void xxx(){
        String ci="12345";
        Cliente cliente= new Cliente(ci, 60.0);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        Sensor sensor= new Sensor();
        assertFalse(sensor.comprobarRegistro(registro , "123456"));
    }
    //calorias quemadas
    @Test
    public void dyyy(){
        Cliente clienteMock= mock(Cliente.class);
        when(clienteMock.getPeso()).thenReturn(60.0);
        Registro registroMock = mock(Registro.class);
        when(registroMock.buscarCI("1234")).thenReturn(clienteMock);
        Sensor sensor= new Sensor();
        assertTrue(sensor.comprobarRegistro(registroMock , "1234"));
        assertEquals(94.5 , sensor.calcularCalorias(30.0 , 3), 0.0);
        //si el cliente no entrena
        assertEquals(0.0, sensor.calcularCalorias(0.0 , 3));
        //el tiempo y MET no pueden ser cifras negativas
        assertEquals(0.0  , sensor.calcularCalorias(-15.0, 3));
        assertEquals(0.0  , sensor.calcularCalorias(15.0, -3));
    }
}
