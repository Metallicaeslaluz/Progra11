
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
    //test buscarRegistro
    @Test
    public void uuuu(){
        //si no encuentra ningun dato del cliente en el registro
        Cliente cliente= new Cliente("1234", 60.0);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        assertNull(registro.buscarCI("12345"));
        //si el cliente esta incluido en el registro
        cliente= new Cliente("12345", 60.0);
        registro= new Registro();
        registro.añadirUsuario(cliente);
        assertNotNull(registro.buscarCI("12345"));
        //si el ci a buscar esta vacio
    }
    //test de añadir usuario
    @Test
    public void xxxx(){
        //cliente con ci vacio
        Cliente cliente= new Cliente("", 60.0);
        Registro registro= new Registro();
        registro.añadirUsuario(cliente);
        assertNull(registro.buscarCI("12345"));
        
    }
}
