package com.company;

import java.util.*;

public class Collections {
    <T> HashSet<T> newHashSet(T value) {
        HashSet<T> set = new HashSet<>();
        set.add(value);
        return set;
    }
    <T> ArrayList<T> newArrayList(T value) {
        ArrayList<T> list = new ArrayList<>();
        list.add(value);
        return list;
    }
    <K, V> HashMap<K, V> newHashMap(K key, V value) {
        HashMap<K, V> Map = new HashMap<>();
        Map.put(key, value);
        return Map;
    }
}
