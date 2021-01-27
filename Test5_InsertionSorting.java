public class Test5_InsertionSorting {
    public void InsertionSort(int array[]) {
        for(int i = 1; i<array.length; ++i) {
            int k = array[i];
            int j = i-1;
            while(j>=0 && array[j]>k) {
                array[j + 1] = array[j];
                j = j-1;
            }
            array[j+1] = k;
        }
    }
    public static void main(String args[]) {
        //Question 5 : Sort the array with the help of Insertion sorting.
        //Time Complexity of the program is O(n^2)- Quadratic time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        Test5_InsertionSorting ob = new Test5_InsertionSorting();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.InsertionSort(arr);
        System.out.println("The Sorted array is : ");

        for (int i=0; i<arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
