package christmas.controller;

import christmas.domain.OrderList;
import christmas.util.InputParser;
import christmas.view.InputView;
import christmas.view.OutputView;

public class ChristmasPlanManager {
    private final InputView inputView;
    private final OutputView outputView;

    public ChristmasPlanManager(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        outputView.printGreetingMessage();
        int date = inputView.readVisitDate();

        String rawSelectedMenu = inputView.readMenuTypesAndNumbers();
        OrderList orderList = OrderList.of(new InputParser().parseStringToList(rawSelectedMenu));

    }

}
