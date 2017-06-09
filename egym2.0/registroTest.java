
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class registroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class registroTest
{
    /**
     * Default constructor for test class registroTest
     */
    public registroTest()
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
    public void uuuu(){
        EstadoCliente estadoMock= mock(EstadoCliente.class);
        Cliente cliente= new Cliente("1234", estadoMock);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        assertNull(registro.buscarCI("12345"));
        
    }
    @Test
    public void xxxx(){
        EstadoCliente estadoMock= mock(EstadoCliente.class);
        Cliente cliente= new Cliente("1234", estadoMock);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        assertNotNull(registro.buscarCI("1234"));
        
    }
}
