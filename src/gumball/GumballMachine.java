/**
 * @author  6510450569 Panithan Champahom
 */

package gumball;

public class GumballMachine {

    private boolean hasQuarter;
    private int ballAmount;

    public GumballMachine(int ballAmount) {
        this.hasQuarter = false;
        this.ballAmount = ballAmount;
    }

    private void dispenseGumball() {
        System.out.println("Gumball sold.");
        this.ballAmount -= 1;
    }

    private boolean checkGumball() {
        if (this.ballAmount > 0) {
            dispenseGumball();
            return true;
        } else {
            System.out.println("Gumball is out!");
            return false;
        }
    }

    public void insertQuarter() {
        this.hasQuarter = true;
        System.out.println("You inserted a quarter.");
    }

    public void turnCrank() {
        if (hasQuarter && ballAmount >= 0) {
            System.out.println("You turned...");
            this.hasQuarter = false;
            checkGumball();

        }
        else System.out.println("You haven't inserted a quarter!");
    }

    public void ejectQuarter() {
        if (hasQuarter) {
            System.out.println("Eject a quarter.");
            this.hasQuarter = false;
        }
    }

    public void checkBallAmount() {
        System.out.println("Balls remaining is " + this.ballAmount + '.');
    }

    public void checkQuarter() {
        if (hasQuarter) System.out.println("A quarter is already inserted.");
        else System.out.println("No quarter.");
    }







}
