/**
 * @author  6510450569 Panithan Champahom
 */
package hw6_quack;

public class CountingAndPoliteDuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() { return new CounterDecorator(new PoliteDecorator(new MallardDuck())); }
    public Quackable createRedheadDuck() {
        return new CounterDecorator(new PoliteDecorator(new RedheadDuck()));
    }
    public Quackable createDuckCall() {
        return new CounterDecorator(new PoliteDecorator(new DuckCall()));
    }
    public Quackable createRubberDuck() {
        return new CounterDecorator(new PoliteDecorator(new RubberDuck()));
    }
}