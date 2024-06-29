/**
 * @author  6510450569 Panithan Champahom
 */

public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public Player(String name) {
        this.name = name;
        this.dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();
        this.board = new Board();
        this.piece = new Piece();

    }

    public void takeTurn() {
        // Roll
        dice[0].roll();
        dice[1].roll();
        int fv1 = dice[0].getFaceValue();
        int fv2 = dice[1].getFaceValue();
        int fvTot = fv1 + fv2;

        System.out.println("Total Value: " + fvTot);

        // Move Piece
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);

        System.out.println("Move from " + oldLoc.getName() + " to " + newLoc.getName());

        piece.setLocation(newLoc);

    }

    public String getName() { return this.name; }


}

