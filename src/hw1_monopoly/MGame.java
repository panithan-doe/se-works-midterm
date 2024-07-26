package hw1_monopoly;

/**
 * @author  6510450569 Panithan Champahom
 */

public class MGame {
    private final int N;
    private int roundCnt;
    private Player[] players;
    private Die[] dice;
    private Board board;


    // Constructor : N คือจำนวนรอบในการเล่นเกมนนี้
    // สามารถ implement ให้ร constructor รับ object monopoly.Die กับ monopoly.Board ได้ (ทำให้ไม่ต้องประกาศใหม่ใน monopoly.Player)
    public MGame(int N) {
        this.N = N;
        // กำหนดรอบเริ่มต้นเป็นรอบที่ 1 (roundCnt = 0)
        this.roundCnt = 0;
        this.dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();

        // จำนวน monopoly.Player มากสุดคือ 8 คน (monopoly.Player 1-8)
        this.players = new Player[8];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("monopoly.Player " + (i+1));
        }
        this.board = new Board();
    }

    public void playGame() {
        while (roundCnt < N) {
            System.out.println("---------- round " + (roundCnt+1) + " ----------\n");
            playRound();
            roundCnt++;
        }
    }

    private void playRound() {
        for (Player player : players) {
            System.out.println("----- " + player.getName() + " -----");
            player.takeTurn();
            System.out.println();
        }
    }

}
