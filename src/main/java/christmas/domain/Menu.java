package christmas.domain;

public enum Menu {
    SOUP("양송이스프", "appetizer", 6000),
    TAPAS("타파스", "appetizer", 5500),
    SALAD("시저샐러드", "appetizer", 8000),

    T_BORN("티본스테이크", "main", 55000),
    BARBECUE_LIP("바비큐립","main", 54000),
    SEAFOOD_PASTA("해산물파스타","main", 35000),
    CHRISTMAS_PASTA("크리스마스파스타","main", 25000),

    CHOCOLATE_CAKE("초코케이크", "desert", 15000),
    ICE_CREAM("아이스크림","desert", 5000),

    ZERO_COKE("제로콜라", "drink", 3000),
    RED_WINE("레드와인", "drink", 60000),
    CHAMPAGNE( "샴페인","drink", 25000);

    private final String name;
    private final String category;
    private final int price;

    Menu(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

}
