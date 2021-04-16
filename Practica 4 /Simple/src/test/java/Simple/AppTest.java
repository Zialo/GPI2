package Simple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    public void palabraConsola(){
		String lectura = App.getter(); 
		assertEquals("Hodei Zia", lectura);
	}
}
