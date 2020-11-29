/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amayabalaguer
 */
public class KnightTest extends ChessPiece{
    
    public KnightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Empezamos test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        
         System.out.println("Terminamos test");
    }
    
    @Before
    public void setUp() {
        Knight arturo = new Knight();
        arturo.color = 0;
        
    }
    
    @After
    public void tearDown() {
        
        
       
    }

    /**
     * Test of isPathFree method, of class Knight.
     */
    @Test
    public void testIsPathFree() throws Exception {
        System.out.println("isPathFree");
        int ro = 0;
        int co = 0;
        int rd = 0;
        int cd = 0;
        ChessBoard board = null;
        Knight instance = new Knight();
        instance.isPathFree(ro, co, rd, cd, board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPieceMovement method, of class Knight.
     */
    @Test
    public void testIsPieceMovement() throws Exception {
        System.out.println("isPieceMovement");
        int ro = 0;
        int co = 0;
        int rd = 0;
        int cd = 0;
        Knight instance = new Knight();
        instance.isPieceMovement(ro, co, rd, cd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovements method, of class Knight.
     */
    @Test
    public void testGetMovements() {
        System.out.println("getMovements");
        int ro = 0;
        int co = 0;
        ChessBoard board = null;
        Knight instance = new Knight();
        Vector expResult = null;
        Vector result = instance.getMovements(ro, co, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testSomeMethod() {
        System.out.println("Test");
        Assert.assertEquals(0,this.getColor());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Override
    public void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) throws NoPathFreeException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isPieceMovement(int ro, int co, int rd, int cd) throws NoPieceMovementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector getMovements(int ro, int co, ChessBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
