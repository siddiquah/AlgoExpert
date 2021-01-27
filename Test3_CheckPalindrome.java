public class Test3_CheckPalindrome {
    public static void main(String[] args) {
        //Question 3 : check if a string is a palindrome or not.
        //Time Complexity of the program is O(n)- linear time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Array.

        String original = "Siddiquah";
        String reversed = "";

        for(int i = original.length()-1; i>=0 ; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(original.equals(reversed));
    }
}
