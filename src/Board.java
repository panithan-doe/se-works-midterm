public class Board {
    private Square[] squares;

    public Board() {
        // สร้าง Board ที่มี Square 40 อัน (มี 40 ช่อง)
        this.squares = new Square[40];
        for (int i = 0; i < 40; i++) {
            squares[i] = new Square("Square "+ (i + 1));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {

        int newPosition = 0;
        for (int i = 0; i < 40; i++) {
            if (squares[i].getName().equals(oldLoc.getName())) {
                // ได้ตำแหน่งของ oldLoc คือ i
                newPosition = i+fvTot;
            }
        }

        // check ว่า position >= 40 ไหม (เพราะเกินตำแหน่งบนบอร์ด) ถ้ามากกว่าหรือเท่ากับให้วนกลับมาที่ position = newPosition-40
        if (newPosition >= 40) {
            newPosition -= 40;
        }

        for (Square square : squares) {
            if (square.getName().equals("Square " + (newPosition + 1))) return square;
        }

        return null;

    }

}

