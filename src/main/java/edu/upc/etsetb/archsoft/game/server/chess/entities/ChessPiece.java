/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;
import java.lang.Math;
import edu.upc.etsetb.archsoft.game.server.entities.Piece;
import java.util.Vector;

/**
 *
 * @author amayabalaguer
 */
public abstract class ChessPiece implements Piece{
    int ro;
    int co;
    int color; // Black=0 White=1 more colors? We'll see
    int p;
    boolean dead; // Status dead or alive   
    
    public abstract void isPathFree(int ro, int co, int rd, int cd, ChessBoard board) throws NoPathFreeException;// check if the path is free
    public abstract void isPieceMovement(int ro, int co, int rd, int cd)  throws NoPieceMovementException; //check if it is legal
    abstract public Vector getMovements(int ro, int co, ChessBoard board);
    public int getColor(){ 
        return co;
    };

}

