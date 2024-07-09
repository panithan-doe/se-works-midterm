package monopoly;

/**
 * @author  6510450569 Panithan Champahom
 */

public class Piece {
    private Square location;
    public Piece() {
        this.location = new Square("monopoly.Square 1");
    }

    public Square getLocation() {
        return this.location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
