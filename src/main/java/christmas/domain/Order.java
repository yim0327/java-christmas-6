package christmas.domain;

public class Order {
    private final Menu selectedMenu;
    private final int count;

    private Order(Menu selectedMenu, int count) {
        this.selectedMenu = selectedMenu;
        this.count = count;
    }

    public static Order of(String rawOrder) {
        String[] parts = rawOrder.split("-");

        String menuName = parts[0];
        int menuCount = Integer.parseInt(parts[1]);

        Menu selectedMenu = Menu.fromName(menuName);

        return new Order(selectedMenu, menuCount);
    }

}
