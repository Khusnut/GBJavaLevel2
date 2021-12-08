package HomeWork3;
import java.util.ArrayList;

public class Box <F extends Fruit> {

    private float weight;
    private final ArrayList<F> fruit;

    {
        fruit = new ArrayList<>();
    }


    public float getWeight() {
        if (fruit.size() == 0) {
            return 0.0f;
        }
        for (F f : fruit) {
            weight += f.getWeight();
        }
        return weight;
    }


    public boolean compare(Box<?> otherBox) {
        return (this.weight - otherBox.weight) < 0.00001;
    }

    public void pourInto(Box<F> otherBox) {
        otherBox.fruit.addAll(this.fruit);
        this.fruit.clear();
    }


    public void addFruit(F oneFruit, int num) {
        for (int i = 0; i < num; i++) {
            fruit.add(oneFruit);
        }
    }

}