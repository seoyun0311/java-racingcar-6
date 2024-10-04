package racingcar.Controller;

import java.util.Random;

public class ForwardController {
    private final String name;
    private int position;

    public ForwardController(String name) {
        this.name = name;
        this.position = 0;
    }

    // 4 이상일 경우 전진
    public void move() {
        Random random = new Random();
        if (random.nextInt(10) >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
