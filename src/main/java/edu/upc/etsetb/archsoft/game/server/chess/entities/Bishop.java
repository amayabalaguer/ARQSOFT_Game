/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amayabalaguer
 */

// The bishop can only move in diagonal and must check that there are no pieces in its way
public class Bishop extends ChessPiece{
    @Override
     public void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) throws NoPathFreeException {
         
        
        if (ro < rd){// it wants to move up
            if(co < cd){ // it wants to to the right
                for (int row = ro;row < rd; row++){ // increments the rows
                    for(int col = co; col < cd; col++){  // increments the columns
                         if (!board.isPositionEmpty(rd,cd)){
                                throw new NoPathFreeException();
                           }
                    }
                }
            }else{// upper left
                for (int row = ro;row < rd; row++){ 
                    for(int col = co; col > cd; col--){  
                         if (!board.isPositionEmpty(rd,cd)){
                                throw new NoPathFreeException();
                           }
                    }
                }
            }
        }else{//move down
            if(co < cd){ // it wants to to the right
                for (int row = ro;row > rd; row--){ // increments the rows
                    for(int col = co; col < cd; col++){  // increments the columns
                         if (!board.isPositionEmpty(rd,cd)){
                                throw new NoPathFreeException();
                           }
                    }
                }
            }else{// down left
                for (int row = ro;row > rd; row--){ 
                    for(int col = co; col > cd; col--){  
                         if (!board.isPositionEmpty(rd,cd)){
                                throw new NoPathFreeException();
                           }
                    }
                }
            }
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isPieceMovement(int ro, int co, int rd, int cd) throws NoPieceMovementException {
        int distr = Math.abs(rd-ro);
        int distc = Math.abs(cd-co);
        
        
        if(distr == distc){
            
        }else if((distr != distc) | distr == 0 | distc == 0){ // movement is not diagonal 
            throw new NoPieceMovementException();
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector getMovements(int ro, int co, ChessBoard board) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
