package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CatalogElements {
    private final String path;
    CatalogElements(String path){
        this.path = path;
    }

    <E> void getFiveCatalogElements() {
        File dir = new File(path);
        List<E> items = new ArrayList<>();
        int count = 0;
        if (dir.isDirectory()) {
            for (File element : dir.listFiles()) {
                if (count == 5) {
                    System.out.println(items);
                }
                items.add((E)element);
                count++;
            }
        }
    }
}
