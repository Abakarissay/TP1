/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import javax.print.PrintException;
import junit.framework.TestCase;

/**
 *
 * @author sa665519
 */
public class OrangeTest extends TestCase {
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    public void Panier() {
        System.out.println("getPrix");
        Orange instance = null;
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String  p = "France";
         
       Orange o = new Orange(2.0,p);
      assertTrue(o.getOrigine()== p);

    }

    /**
     * Test of setPrix method, of class Orange.
     */
    public void testGetprix() {
        System.out.println("Getprix");
        double pr = -5.0;
        Orange o = new Orange(pr, "France");
        assertTrue((double)o.getPrix() == (double)pr);
        
    }
    
    public void testSetprix() {
        System.out.println("SetPrix");
        double pr=12.0;
        Orange o=new Orange( pr,"" );
        
        try{
        o.setPrix(-5.0);
        fail();
        }
        catch(Prixnegatif e)
        {
            assertTrue(o.getPrix()== 12.0);
        }  
        
        
        //assertTrue(o.getPrix()==pr);      
    }
    
    
}
