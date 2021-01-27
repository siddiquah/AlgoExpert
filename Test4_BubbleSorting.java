public class Test4_BubbleSorting {
    public void bubbleSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        //Question 4 : Sort the array with the help of bubble sorting.
        //Time Complexity of the program is O(n^2)- Quadratic time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        Test4_BubbleSorting ob = new Test4_BubbleSorting();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("The Sorted array is : ");

        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
