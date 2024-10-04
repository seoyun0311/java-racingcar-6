package racingcar.Controller;

import racingcar.Model.WinGenerator;
import racingcar.View.InputView;
import racingcar.View.OutputView;

import java.util.List;

public class RacingController {

    public void startRace() {
        // 사용자로부터 자동차 리스트와 시도 횟수를 입력받기
        List<ForwardController> cars = InputView.getCars();
        int attempts = InputView.getAttempts();

        // 경주 진행
        for (int i = 0; i < attempts; i++) {
            for (ForwardController car : cars) {
                car.move();
            }
            OutputView.showRoundResult(cars);
        }

        // 우승자 계산 및 출력
        WinGenerator.determineWinners(cars);
    }
}

