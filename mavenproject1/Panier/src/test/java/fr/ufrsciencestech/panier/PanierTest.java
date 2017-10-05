/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author sa665519
 */
public class PanierTest extends TestCase {
    
    public PanierTest(String testName) {
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
     * Test of getTaillemax method, of class Panier.
     */
    public void testGetTaillemax() {
        System.out.println("getTaillemax");
        Panier instance = null;
        int expResult = 0;
        int result = instance.getTaillemax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaillemax method, of class Panier.
     */
    public void testSetTaillemax() {
        System.out.println("setTaillemax");
        int taillemax = 0;
        Panier instance = null;
        instance.setTaillemax(taillemax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPanier method, of class Panier.
     */
    public void testGetPanier() {
        System.out.println("getPanier");
        Panier instance = null;
        ArrayList<Orange> expResult = null;
        ArrayList<Orange> result = instance.getPanier();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPanier method, of class Panier.
     */
    public void testSetPanier() {
        System.out.println("setPanier");
        ArrayList<Orange> panier = null;
        Panier instance = null;
        instance.setPanier(panier);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Panier.
     */
    public void testToString() {
        System.out.println("toString");
        Panier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Ajout method, of class Panier.
     */
    public void testAjout() {
        System.out.println("Ajout");
        double pr=0.5;
        int taillemax = 0;
        Panier p = new Panier(taillemax) ;       
        String pays="France";
        Orange o = new Orange(pr,pays);
        p.Ajout(o);
        assertTrue(p.estVide()==false);
        
    }

    /**
     * Test of Retire method, of class Panier.
     */
    public void testRetire() {
        System.out.println("Retire");
        Orange o = null;
        Panier instance = null;
        instance.Retire(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
