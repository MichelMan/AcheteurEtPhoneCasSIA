package Test;
import Bob.*;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class phoneTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class phoneTest
{
    /**
     * Default constructor for test class phoneTest
     */
    public phoneTest()
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
        Acheteur a = new Acheteur();
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
    public void addAcheteurTest()
    {
      	Acheteur a1 = new Acheteur();
    	Acheteur a2 = new Acheteur();
    	
    	Phonee p = new Phonee();
    	p.setAcheteur(a1);
    	p.setAcheteur(a2);
    	
        assertEquals(2, p.getAcheteur().size());
    }
    
    public void addPhoneTest()
    {
    	Phonee a1 = new Phonee();
      	Phonee a2 = new Phonee();
    	
      	Acheteur p = new Acheteur();
    	p.setPhone(a1);
    	p.setPhone(a2);
    	
        assertEquals(2, p.getPhone().size());
    }
    
    
    public void equalSizeTest()
    {
    	Phonee a1 = new Phonee();
      	Phonee a2 = new Phonee();
    	
      	Acheteur p = new Acheteur();
    	p.setPhone(a1);
    	p.setPhone(a2);
    	
        a1.equals(p);
    }

 
}


