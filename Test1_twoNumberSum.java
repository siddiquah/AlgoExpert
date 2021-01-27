import java.util.Arrays;

public class Test1_twoNumberSum {
    public static void main(String[] args) {
        //Question 1 : Two Number Sum.
        //Time Complexity of the program is O(nlog(n))- log linear.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSum = 17;
        Arrays.sort(array);
        int lhs = array[0];
        int rhs = array.length-1;

        while(lhs<rhs) {
            int sum = array[lhs] + array[rhs];
            if(sum == targetSum) {
                System.out.println("The two numbers are : " + array[lhs] + " & " + array[rhs] );
            }
            else if(sum<targetSum) {
                lhs++;
            }
            else {
                rhs--;
            }
        }
        System.out.println("Error");
    }
}
