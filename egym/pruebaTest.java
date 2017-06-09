
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebaTest
{
    /**
     * Default constructor for test class pruebaTest
     */
    public pruebaTest()
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
    public void aaa(){
        Prueba pruebamock = mock(Prueba.class);
        when(pruebamock.getNumero()).thenReturn(4);
        assertEquals(4 , pruebamock.getNumero());
    }
    @Test
    public void xx(){
        Pesas pesasMock= mock(Pesas.class);
        when(pesasMock.zonaTrabajadaDelCuerpo()).thenReturn("brazos");
        EstadoCliente esMock= mock(EstadoCliente.class);
        Cliente c= new Cliente("124", esMock);
        assertEquals("brazos" , c.entrenar(pesasMock , 30.1));
    }
}
