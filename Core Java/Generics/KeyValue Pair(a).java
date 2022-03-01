public class Pair<T>{

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;

    @Override
    public String toString() {
        return "Pair = {" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Pair<String> pair = new Pair<>();
        pair.setKey("1");
        pair.setValue("King");
        System.out.println(pair);
    }
}