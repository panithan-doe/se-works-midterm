package hw6_quack;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private Quackable alphaDuck;
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quackable) {
        if (alphaDuck == null) {
            alphaDuck = new AlphaDuckDecorator(quackable);
            quackers.add(alphaDuck);
        } else {
            quackers.add(quackable);
        }
    }

    @Override
    public void quack() {
        System.out.println("----Flock----");
        for (Quackable q : quackers) {
            q.quack();
        }
    }

}
