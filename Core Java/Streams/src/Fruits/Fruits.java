package Fruits;

public class Fruits {
    String name;
    int calories;
    int price;
    String colour;

    public Fruits(String name, int calories, int price, String colour) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Fruits = {" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
