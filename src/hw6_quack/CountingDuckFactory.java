package hw6_quack;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new CounterDecorator(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new CounterDecorator(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new CounterDecorator(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new CounterDecorator(new RubberDuck());
    }


}
