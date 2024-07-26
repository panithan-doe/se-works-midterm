/**
 * @author  6510450569 Panithan Champahom
 */

package hw6_quack;

public class CounterDecorator implements Quackable {
    private Quackable quackable;

    static int numOfQuack = 0;

    public CounterDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numOfQuack++;        // Decorated part
    }

    public static int getNumOfQuack() { return numOfQuack; }

}
