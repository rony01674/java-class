package generic_c19;

public class TestGenericStack {

    public static void main(String[] args) {
        GenericStack<String> stake1 = new GenericStack<>();
        stake1.push("London");
        stake1.push("Paris");
        stake1.push("Berlin");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("Size: " + stake1.getSize());
        System.out.println("Peek: " + stake1.peek());
        System.out.println("Size: " + stake1.getSize());
        System.out.println("Pop: " + stake1.pop());
        System.out.println("Size: " + stake1.getSize());
    }

}
