package com.cruiser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Tim", "Jane", "Mariya", "CJ", "Anna"};
        Arrays.setAll(names, (i) -> {
            String toExport = names[i].toUpperCase();
            toExport = toExport.charAt(0) + " " + toExport;

            return toExport + " " + toCamelCase(new StringBuffer(names[i]).reverse().toString());
        });

        List<String> listToPrint = new ArrayList<>(Arrays.asList(names));
        listToPrint.removeIf(s -> {
            String[] temp = s.split(" ");
            return temp[1].equalsIgnoreCase(temp[2]);
        });
        listToPrint.forEach(s -> System.out.println(s));
    }

    public static String toCamelCase(String string){
        return (String.valueOf(string.charAt(0))).toUpperCase() + string.substring(1).toLowerCase();
    }

}
