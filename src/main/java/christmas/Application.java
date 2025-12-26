package christmas;

import christmas.controller.ChristmasPlanManager;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ChristmasPlanManager christmasPlanManager = new ChristmasPlanManager(inputView, outputView);

        christmasPlanManager.start();
    }
}
