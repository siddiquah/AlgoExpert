import java.util.Arrays;

public class Test2_3rdLargestNumber {
    public static void main(String[] args) {
        //Question 2 : Find the 3rd Largest element in the array.
        //Time Complexity of the program is O(n^2)- Quadratic time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        int[] array = {5,7,9,14,3};
        Arrays.sort(array);
        int largest3rd = array.length-3;
        System.out.println("The third Largest number is : " + array[largest3rd]);
    }
}
