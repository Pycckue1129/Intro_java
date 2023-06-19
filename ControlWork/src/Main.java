public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        store.addNewToy(1, "Кукла", 5, 30);
        store.addNewToy(2, "Машинка", 10, 50);
        store.addNewToy(3, "Мячик", 15, 40);

        store.updateToyFrequency(2, 20);

        store.drawPrizeToys(2);

        Toy prizeToy = store.getPrizeToy();
        while (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
            prizeToy = store.getPrizeToy();
        }
    }
}