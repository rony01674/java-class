package visibilityModifire;

public class AccessModifiersEx1 {

    public static void main(String[] args) {
        AccessModifiersEx obj = new AccessModifiersEx();
        System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
    }
}
