

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class maquinasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class maquinasTest
{
    /**
     * Default constructor for test class maquinasTest
     */
    public maquinasTest()
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
    //verificamos y testeamos el comportamiento de las maquinas
    @Test
    public void eee(){
        MaquinasFuerza maquina= new Pesas();
        assertEquals("brazos", maquina.zonaTrabajadaDelCuerpo());
        maquina= new Dorsalera();
        assertEquals("espalda", maquina.zonaTrabajadaDelCuerpo());
        maquina= new BancoPress();
        assertEquals("parte superior del tronco", maquina.zonaTrabajadaDelCuerpo());
        maquina = new PrensaPiernas();
        assertEquals("piernas", maquina.zonaTrabajadaDelCuerpo());
    }
}
