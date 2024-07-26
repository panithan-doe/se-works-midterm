/**
 * @author  6510450569 Panithan Champahom
 */
package hw6_quack;

public class PigeonAdaptor implements Quackable {


    Pigeon pigeon = new Pigeon();

    public PigeonAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        // Coo 2 times
        for (int i = 0; i < 2; i++) {
            pigeon.coo();
        }
    }

}
