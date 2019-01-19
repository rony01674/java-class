package generic_c19;

public class TestBosta {

    public static void main(String[] args) {
        GenericStack<Bosta> bostaList = new GenericStack<>();
        bostaList.push(new Bosta(100, "60 kg"));
        bostaList.push(new Bosta(110, "50 kg"));
        bostaList.push(new Bosta(120, "60 kg"));
        bostaList.push(new Bosta(130, "100 kg"));
        System.out.println("Size: " + bostaList.getSize());
        System.out.println("Peek: " + bostaList.peek());
        System.out.println("Size: " + bostaList.getSize());
        System.out.println("Pop: " + bostaList.pop());
        System.out.println("Size: " + bostaList.getSize());
    }
}
