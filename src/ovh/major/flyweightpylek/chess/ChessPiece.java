package ovh.major.flyweightpylek.chess;

public class ChessPiece {
    String name;
    String letterPosition;
    int numberPosition;
    Color color;

    public ChessPiece(String name, int numberPosition, String letterPosition, String color) {
        this.name=name;
        this.numberPosition=numberPosition;
        this.letterPosition=letterPosition;
        switch (color.toUpperCase()) {
            case "black" -> { this.color = ColorRepository.getBlack(); }
            case "white" -> { this.color = ColorRepository.getWhite(); }
        }
    }
    public Color getColor() {
        return color;
    }

}
