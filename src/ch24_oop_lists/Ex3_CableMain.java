package ch24_oop_lists;

import java.util.ArrayList;
import java.util.List;

public class Ex3_CableMain {
    public static void main(String[] args) {
        List<Cable> cables = new ArrayList<>();

        Cable usb = new Cable("usb", 10);
        Cable jack = new Cable("jack", 25);
        Cable chinch = new Cable("chinch", 100);

        cables.add(usb);
        cables.add(jack);
        cables.add(chinch);
        cables.add(new Cable("usb-c", 100));
        cables.add(new Cable("euro", 50));

        System.out.println(cables.size());

        for (Cable cable : cables) {
            cable.print();
        }

        System.out.println("Removing 'jack'");
        cables.remove(jack);

        for (int i = 0; i < cables.size(); i++) {
            cables.get(i).print();
        }
    }
}
