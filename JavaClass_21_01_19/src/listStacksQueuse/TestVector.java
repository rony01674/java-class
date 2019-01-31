package listStacksQueuse;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();//Creating Vector
        v.add("Umesh");//Method of Collection
        v.addElement("Irfan");//Method of Vector
        v.addElement("Kumar");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
