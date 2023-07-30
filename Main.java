public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addPerson("Иван");
        market.addPerson("Мария");
        market.addPerson("Петр");

        System.out.println("Размер очереди магазина: " + market.queueSize());

        market.removePerson();
        market.removePerson();
        market.removePerson();
        market.removePerson();

        System.out.println("Размер очереди магазина: " + market.queueSize());

        // Example of using the custom functional interface with a lambda expression
        market.setOrderProcessor(order -> System.out.println("Обрабатываем заказ: " + order));
        market.addPerson("Новый заказ");
        market.update();
    }
}