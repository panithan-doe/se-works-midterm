package hw6_quack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PoliteDecorator implements Quackable {

    Quackable quackable;

    public PoliteDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {

        // ปกติแล้วใช้ System.out.println จะพิมพ์แล้วขึ้นบรรทัดใหม่
        // ใช้ 'ByteArrayOutputStream' กับ 'PrintStream ' เพื่อพิมพ์ 'kaa🙏' ในบรรทัดเดียวกับ 'Quack'

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;

        System.setOut(ps);
        quackable.quack();

        System.out.flush();
        System.setOut(old);

        String quackOutput = baos.toString().trim(); // ใช้ trim() เพื่อลบ '\n' ที่ตำแหน่งสุดท้าย

        System.out.println(quackOutput + " kaa🙏");

    }
}
