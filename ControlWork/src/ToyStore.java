import java.io.*;
import java.util.*;

public class ToyStore {
    private final List<Toy> toys;
    private final List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addNewToy(int id, String name, int quantity, double frequency) {
        boolean isExistingToy = false;
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setName(name);
                toy.setQuantity(quantity);
                toy.setFrequency(frequency);
                isExistingToy = true;
            }
        }
        if (!isExistingToy) {
            Toy newToy = new Toy(id, name, quantity, frequency);
            toys.add(newToy);
        }
    }

    public void updateToyFrequency(int id, double frequency) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
            }
        }
    }

    public void drawPrizeToys(int numOfPrizes) {
        Random rand = new Random();
        while (numOfPrizes > 0) {
            double totalFrequency = 0.0;
            for (Toy toy : toys) {
                totalFrequency += toy.getFrequency();
            }
            double randomNum = rand.nextDouble() * totalFrequency;
            int index = -1;
            while (randomNum > 0.0) {
                index++;
                randomNum -= toys.get(index).getFrequency();
            }
            Toy selectedToy = toys.get(index);
            prizeToys.add(selectedToy);
            selectedToy.reduceAmount();
            numOfPrizes--;
        }
    }

    public Toy getPrizeToy() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.get(0);
            prizeToys.remove(0);
            try {
                File file = new File("prize_toys.txt");
                FileWriter writer = new FileWriter(file, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prizeToy;
        }
        return null;
    }
}

