/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;

import java.util.Vector;

/**
 *
 * @author amayabalaguer
 */
public class Queen extends ChessPiece{ // can move in any direction but cannot jump pieces

    @Override
    public void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) throws NoPathFreeException {
        int distr = Math.abs(rd-ro);
        int distc = Math.abs(cd-co);
        //diagonal move
        if(distr == distc){
           if (ro < rd){// it wants to move up
                if(co < cd){ // it wants to to the right
                    for (int row = ro;row < rd; row++){ // increments the rows
                        for(int col = co; col < cd; col++){  // increments the columns
                            if (!board.isPositionEmpty(row,col)){
                                throw new NoPathFreeException();
                            }
                        }
                    }
                }else{// upper left
                for (int row = ro;row < rd; row++){ 
                    for(int col = co; col > cd; col--){  
                         if (!board.isPositionEmpty(row,col)){
                                throw new NoPathFreeException();
                           }
                    }
                }
            }
            }else{//move down
                if(co < cd){ // it wants to to the right
                    for (int row = ro;row > rd; row--){ // increments the rows
                        for(int col = co; col < cd; col++){  // increments the columns
                             if (!board.isPositionEmpty(row,col)){
                                    throw new NoPathFreeException();
                               }
                        }
                    }
                }else{// down left
                    for (int row = ro;row > rd; row--){ 
                        for(int col = co; col > cd; col--){  
                             if (!board.isPositionEmpty(row,col)){
                                    throw new NoPathFreeException();
                               }
                        }
                    }
                }
            }
            
        }else{//straight move
            if(ro < rd){//right
                for(int row = ro; row < rd; row++){  // increments the columns
                            if (!board.isPositionEmpty(row,co)){
                                throw new NoPathFreeException();
                            }
                        }
            }else if(ro > rd){ //left
                for(int row = ro; row > rd; row--){  // increments the columns
                            if (!board.isPositionEmpty(row,co)){
                                throw new NoPathFreeException();
                            }
                        }
            }
            if(co < cd){//up
                for(int col = co; col < cd; col++){  // increments the columns
                    if (!board.isPositionEmpty(ro,col)){
                        throw new NoPathFreeException();
                    }
                }    
            }else if(co > cd){//down
                for(int col = co; col > cd; col--){  // increments the columns
                    if (!board.isPositionEmpty(ro,col)){
                        throw new NoPathFreeException();
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
        
        
        if(distr == distc|distr == 0 | distc == 0){
            
        }else { // movement is not diagonal 
            throw new NoPieceMovementException();
        }
         
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector getMovements(int ro, int co, ChessBoard board) {
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
