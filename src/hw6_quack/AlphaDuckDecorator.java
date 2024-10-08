package hw6_quack;
/**
 * @author  6510450569 Panithan Champahom
 */
public class AlphaDuckDecorator implements Quackable {
    private Quackable quackable;

    public AlphaDuckDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        for (int i = 0; i < 3; i++) {
            quackable.quack();
        }
    }
}
