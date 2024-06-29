public class MGame {
    private final int N;
    private int roundCnt;
    private Player[] players;
    private Die[] dice;
    private Board board;


    // Constructor : N คือจำนวนรอบในการเล่นเกมนนี้
    public MGame(int N) {
        this.N = N;
        // กำหนดรอบเริ่มต้นเป็นรอบที่ 1 (roundCnt = 0)
        this.roundCnt = 0;
        this.dice = new Die[2];
        dice[0] = new Die();
        dice[1] = new Die();

        // จำนวน Player มากสุดคือ 8 คน (Player 1-8)
        this.players = new Player[8];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player " + (i+1));
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
