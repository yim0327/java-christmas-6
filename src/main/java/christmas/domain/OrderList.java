package christmas.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private final List<Order> orderList;

    private OrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public static OrderList of(List<String> rawOrderList) {
        List<Order> orderList = new ArrayList<>();

        for (String rawOrder : rawOrderList) {
            orderList.add(Order.of(rawOrder));
        }

        return new OrderList(orderList);
    }

}
