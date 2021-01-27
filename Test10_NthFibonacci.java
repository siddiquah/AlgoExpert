public class Test10_NthFibonacci {
    static int FindNthFibonacci(int n) {
        if(n<=1) {
            return n;
        }
        return FindNthFibonacci(n-1) + FindNthFibonacci(n-2);
    }

    public static void main(String[] args) {
        //Question 10 : Find Nth Fibonacci.
        //Time Complexity of the program is O(2^n)- Exponential time.
        //space Complexity is O(n)- linear.
        //where n is the number.

        int n = 9;
        System.out.println(FindNthFibonacci(n));
    }
}
