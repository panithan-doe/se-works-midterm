/**
 * @author  6510450569 Panithan Champahom
 */

package gumball;

public class Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        // insert and turn
        machine.insertQuarter();
        machine.turnCrank();

        // insert and eject
        machine.insertQuarter();
        machine.ejectQuarter();

        // turn, but do not insert a quarter
        machine.turnCrank();

        // turn, but has no gumballs remaining
        for (int i = 0; i < 5; i++) {
            machine.insertQuarter();
            machine.turnCrank();
        }









    }
}
