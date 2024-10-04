package racingcar.Model;

import racingcar.Controller.ForwardController;
import racingcar.View.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class WinGenerator {
    public static void determineWinners(List<ForwardController> cars) {
        int maxPosition = cars.stream()
                .mapToInt(ForwardController::getPosition)
                .max()
                .orElse(0);

        List<String> winners = cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .map(ForwardController::getName)
                .collect(Collectors.toList());

        OutputView.showWinners(winners);
    }
}
