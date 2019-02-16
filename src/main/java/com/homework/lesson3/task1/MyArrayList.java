package com.homework.lesson3.task1;


import java.util.Arrays;
import java.util.RandomAccess;

public class MyArrayList<E> implements RandomAccess {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] array;

    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialSize) {
        if (initialSize > DEFAULT_CAPACITY) {
            array = new Object[initialSize];
        } else {
            array = new Object[DEFAULT_CAPACITY];
        }
    }

    private void checkCapacity(int newSize) {
        if (array.length < newSize) {
            array = Arrays.copyOf(array, array.length << 2);
        }
    }

    public void add(E e) {
        checkCapacity(size + 1);
        array[size] = e;
        size++;
    }

    public E get(int index) {
        if (index < size) {
            return (E) array[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        Object[] tmp = new Object[array.length];
        System.arraycopy(array, 0, tmp, 0, index);
        System.arraycopy(array, index + 1, tmp, index, array.length - index - 1);
        array = tmp;
        size--;
        return true;
    }

    public boolean remove(int index) {
        if (size < index) {
            throw new IndexOutOfBoundsException();
        }
        Object[] tmp = new Object[array.length];
        System.arraycopy(array, 0, tmp, 0, index);
        System.arraycopy(array, index + 1, tmp, index, array.length - index - 1);
        array = tmp;
        size--;
        return true;
    }

}
