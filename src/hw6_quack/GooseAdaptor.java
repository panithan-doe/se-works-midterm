/**
 * @author  6510450569 Panithan Champahom
 */
package hw6_quack;

public class GooseAdaptor implements Quackable {
    private Goose goose;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
