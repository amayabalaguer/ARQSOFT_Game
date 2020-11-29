/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.game.server.chess.entities;

import edu.upc.etsetb.archsoft.game.server.entities.Board;

/**
 *
 * @author amayabalaguer
 */
public class ChessBoard implements Board{
    static int maxro = 8;
    static int maxco = 8;
    
    ChessPiece [][] board = new ChessPiece[maxro][maxco];
    
   public boolean isPositionEmpty(int rd,int cd){
       
       if(this.board[rd][cd] == null){   
           return true;
       }else{
           return false;
       }
       
   }
    
}
