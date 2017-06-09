
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
    public void quemarCalorias(){
        Sensor sensor= new Sensor();
        MaquinasFuerza maquina= new Pesas();
        EstadoCliente estadoC= new EstadoCliente(); 
        Cliente cliente= new Cliente("1234" , estadoC);
        assertEquals(94.5 , cliente.entrenar(maquina , 30.0 , sensor), 0.0);
    }
    @Test
    public void otroyyy(){
        Cliente clienteMock= mock(Cliente.class);
        Registro registroMock= mock(Registro.class);
        when(registroMock.buscarCI("1234")).thenReturn(clienteMock);
        Sensor sensor= new Sensor();
        assertTrue(sensor.comprobarRegistro(registroMock, "1234"));
    }
}
