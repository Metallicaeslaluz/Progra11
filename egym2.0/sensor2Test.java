
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
public class sensor2Test
{
    /**
     * Default constructor for test class sensor2Test
     */
    public sensor2Test()
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
    //cuando existe el cliente
    @Test
    public void yyy(){
        String ci="12345";
        EstadoCliente estadoMock= mock(EstadoCliente.class);
        Cliente cliente= new Cliente(ci, estadoMock);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        Sensor sensor= new Sensor();
        assertTrue(sensor.comprobarRegistro(registro , ci));
    }
    //y cuando no existe el cliente
    @Test
    public void xxx(){
        String ci="12345";
        EstadoCliente estadoMock= mock(EstadoCliente.class);
        Cliente cliente= new Cliente(ci, estadoMock);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        Sensor sensor= new Sensor();
        assertFalse(sensor.comprobarRegistro(registro , "123456"));
    }
    //falta de calcular calorias
}
