
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
public class sensorTest
{
    /**
     * Default constructor for test class pruebaTest
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
    //test prueba
    @Test
    public void aaa(){
        Prueba pruebamock = mock(Prueba.class);
        when(pruebamock.getNumero()).thenReturn(4);
        assertEquals(4 , pruebamock.getNumero());
    }
    //cliente null
    @Test
    public void quemarCalorias(){
        Registro registroMock= mock(Registro.class);
        Sensor sensor= new Sensor();
        MaquinasFuerza maquina= new Pesas();
        EstadoCliente estadoC= new EstadoCliente(60.0 , 170.1); 
        Cliente cliente= new Cliente("1234" , estadoC);
        when(registroMock.buscarCI("1234")).thenReturn(null);
        assertFalse(sensor.comprobarRegistro(registroMock, "1234"));
        assertEquals(0.0 , cliente.entrenar(maquina , 30.0 , sensor), 0.0);
        
        
    }
    //identificador de usuario
    @Test
    public void otroyyy(){
        Cliente clienteMock= mock(Cliente.class);
        Registro registroMock= mock(Registro.class);
        when(registroMock.buscarCI("1234")).thenReturn(clienteMock);
        Sensor sensor= new Sensor();
        assertTrue(sensor.comprobarRegistro(registroMock, "1234"));
    }
    //ciente no null
    @Test
    public void quemarCalorias2(){
        Registro registroMock= mock(Registro.class);
        Sensor sensor= new Sensor();
        MaquinasFuerza maquina= new Pesas();
        EstadoCliente estadoC= new EstadoCliente(60.0 , 170.1); 
        Cliente cliente= new Cliente("1234" , estadoC);
        when(registroMock.buscarCI("1234")).thenReturn(cliente);
        assertTrue(sensor.comprobarRegistro(registroMock, "1234"));
        assertEquals(94.5 , cliente.entrenar(maquina , 30.0 , sensor), 0.0);
    }
}
