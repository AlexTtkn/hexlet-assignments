package exercise;

import java.util.Arrays;

class SafetyList {
    // BEGIN
    private Integer[] arr;

    SafetyList() {
        arr = new Integer[0];
    }

    public synchronized void add(Integer number) {
        var newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;
        arr = newArr;
    }

    public Integer get(int index) {
        return arr[index];
    }

    public int getSize() {
        return arr.length;
    }
    // END
}
