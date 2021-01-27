public class Test7_BinarySearch {
    public int BinarySearch(int[] array, int left, int right, int toFind) {
        if(right >= left) {
            int middle = left + (right - left)/2;
            if(toFind == array[middle]) {
                return middle;
            }
            if(toFind<array[middle]) {
                return BinarySearch(array, left, middle-1, toFind);
            }
            return BinarySearch(array, middle+1, right, toFind);
        }
        return -1;
    }
    public static void main(String[] args) {
        //Question 7 : Use Binary Search to find an element.
        //Time Complexity of the program is O(log n)- logarithmic time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        Test7_BinarySearch obj = new Test7_BinarySearch();
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int l = 0;
        int r = arr.length-1;
        int x = 77;
        int result = obj.BinarySearch(arr, l, r, x);
        if (result == -1)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at index " + result);

    }
}
