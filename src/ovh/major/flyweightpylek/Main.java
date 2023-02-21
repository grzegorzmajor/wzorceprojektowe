package ovh.major.flyweightpylek;

import ovh.major.flyweightpylek.chess.*;

public class Main {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek",7,"A");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek",2,"A");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
