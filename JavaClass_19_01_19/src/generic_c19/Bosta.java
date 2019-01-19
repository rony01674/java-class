package generic_c19;

public class Bosta<E> {

    private final int serial;
    private final String weight;

    public Bosta(int serial, String weight) {
        this.serial = serial;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bosta{" + "serial=" + serial + ", weight=" + weight + '}';
    }

}
