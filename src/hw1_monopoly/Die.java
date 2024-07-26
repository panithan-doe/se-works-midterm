package hw1_monopoly;

/**
 * @author  6510450569 Panithan Champahom
 */

public class Die {
    private int faceValue;

    // Constructor
    public Die() { }

    public void roll() {
        // Random 0 to 6
        this.faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() { return this.faceValue; }

}