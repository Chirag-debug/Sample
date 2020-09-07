
//Re-edited`
//edited this file in Terminal using vim
class search {
    public int linearSearch(int[] array, int key) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (key == array[mid]) {
                return mid;
            }
            if (key < array[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int key, int start, int end, int defaultIndex) { // need to improve
        int mid = (start + end)/2;
        if (key == array[mid]) {
            defaultIndex = mid;
        }
        if (key < array[mid]) {
            binarySearch(array, key, start, mid - 1, defaultIndex);
        }
        else if (key > array[mid]) {
            binarySearch(array, key, mid + 1, end, defaultIndex);
        }
        return defaultIndex;
    }
}

class sort {

}

class driverSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 9};
        int key = 7;
        System.out.println("linear search key index is: " + new search().linearSearch(array, key));
        System.out.println("iterative binary search key index is: " + new search().binarySearch(array, key));
        System.out.println("recursive binary search key index is: " + new search().binarySearch(array, key, 0, array.length - 1, -1));
    }
}

class driverSort {
    public static void main(String[] args) {
        
    }
}

