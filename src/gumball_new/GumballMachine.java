package gumball_new;
/**
 * @author  6510450569 Panithan Champahom
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;
    String gumFlavour;
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        gumFlavour = "Gum";

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    void setState(State state) {
        this.state = state;
    }
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    void choose(String gumFlavour) {
        System.out.println("You have chosen the flavor " + gumFlavour);
        this.gumFlavour = gumFlavour;
    }

    public State getNoQuarterState() { return noQuarterState; }

    public State getSoldState() { return soldState; }

    public State getHasQuarterState() { return hasQuarterState; }

    public int getCount() { return count; }

    public State getSoldOutState() { return soldOutState; }

    public State getWinnerState() { return winnerState; }

    public String getGumFlavour() { return gumFlavour; }

}