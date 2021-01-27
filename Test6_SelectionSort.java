public class Test6_SelectionSort {
    public void SelectionSort(int[] array) {
        for(int i =0; i<array.length-1; i++) {
            int minIdx = i;
            for(int j = i+1; j<array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        //Question 6 : Sort the array with the help of selection sorting.
        //Time Complexity of the program is O(n^2)- Quadratic time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        Test6_SelectionSort ob = new Test6_SelectionSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.SelectionSort(arr);
        System.out.println("The Sorted array is : ");

        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
