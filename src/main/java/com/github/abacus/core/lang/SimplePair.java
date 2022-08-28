package com.github.abacus.core.lang;

import java.util.Map;

@SuppressWarnings("unused")
public class SimplePair<K, V> implements Map.Entry<K, V> {

    private K key;

    private V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V old = this.value;
        this.value = value;
        return old;
    }

    @Override
    public String toString() {
        return "SimplePair{" + key + ":" + value + '}';
    }
}
