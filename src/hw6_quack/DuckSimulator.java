/**
 * @author  6510450569 Panithan Champahom
 */
package hw6_quack;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingAndPoliteDuckFactory = new CountingAndPoliteDuckFactory();

        // เลือกว่าจะใส่ factory แบบไหน
//        simulator.simulate(duckFactory);
//        simulator.simulate(countingDuckFactory);
        simulator.simulate(countingAndPoliteDuckFactory);

    }

    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // Goose (Adapted)
        Quackable goose = new GooseAdaptor(new Goose());

        // Pigeon (Adapted)
        Quackable pigeon = new PigeonAdaptor(new Pigeon());


        System.out.println("\nDuck Simulator");

        // Flock of ducks (and goose)
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        // Flock of mallards
        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        // Flock of goose
        Flock flockOfGoose = new Flock();
        Quackable gooseOne = new GooseAdaptor(new Goose());
        Quackable gooseTwo = new GooseAdaptor(new Goose());
        Quackable pigeonOne = new PigeonAdaptor(new Pigeon());

        flockOfGoose.add(gooseOne);
        flockOfGoose.add(gooseTwo);
        flockOfGoose.add(pigeonOne);

        // Flock of duck2
        Flock flockOfDucksTwo = new Flock();
        Quackable rubberDuckTwo = duckFactory.createRubberDuck();
        Quackable duckCallTwo = duckFactory.createDuckCall();
        Quackable redHeadDuckTwo = duckFactory.createRedheadDuck();

        flockOfDucksTwo.add(rubberDuckTwo);
        flockOfDucksTwo.add(duckCallTwo);
        flockOfDucksTwo.add(redHeadDuckTwo);





        simulate(flockOfDucks);
        simulate(flockOfMallards);
        simulate(flockOfGoose);
        simulate(flockOfDucksTwo);

        System.out.println("\nThe ducks quacked " + CounterDecorator.getNumOfQuack() + " times.");



    }

    public void simulate(Quackable quackable) {
        quackable.quack();
    }




}
