package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Heghine");
        strings.add("Meri");
        strings.add("Inessa");

        strings.forEach((n) -> {
                    for (int i = n.length() - 1; i >= 0; i--) {
                        System.out.print(n.charAt(i));
                    }
                    System.out.println();
                }
        );
    }
}
