package ru.itsjava.collection.list.myarraylist;

public class MyArrayList {
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        Object[] resultArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                break;
            }
            resultArray[i] = array[i];
        }

        if (removeIndex == realSize) return false;

        for (int i = removeIndex; i < realSize; i++) {
            resultArray[i] = array[i + 1];
        }
        array = resultArray;
        realSize--;
        return true;
    }

    public void clear() {

    }

    private void checkIndex(int index) {
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index: " + index +
                    " out of size " + realSize);
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }


    //MyArrayList{elem1, elem2 , elem3 ... }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result.append(array[i]).append(" ");
        }
        result.append('}');

        return result.toString();
    }
}
