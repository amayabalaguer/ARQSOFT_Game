/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;
import java.lang.Math;
import java.util.Vector;

/**
 *
 * @author amayabalaguer
 */
public class Knight extends ChessPiece{

    @Override
    public void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) throws NoPathFreeException {
        
        if (board.isPositionEmpty(rd,cd)){
    //Tiene que hacer algo más?        
        }else{
            throw new NoPathFreeException();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isPieceMovement(int ro, int co, int rd, int cd) throws NoPieceMovementException {
        int distr = Math.abs(rd-ro);
        int distc = Math.abs(cd-co);
        
        
        if((Math.min(distr,distc) == 1) && Math.abs(distr - distc) == 1){
            
        }else{
            throw new NoPieceMovementException();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector getMovements(int ro, int co, ChessBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
