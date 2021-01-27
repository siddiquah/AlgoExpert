public class Test8_isValidSubsequence {
    public static Boolean IsSubsequence(String str1, String str2, int str1_idx, int str2_idx) {
        if(str1_idx == 0) {
            return true;
        }
        if(str2_idx == 0) {
            return false;
        }

        if(str1.charAt(str1_idx-1) == str2.charAt(str2_idx-1)) {
            return IsSubsequence(str1, str2, str1_idx-1, str2_idx-1);
        }
        return IsSubsequence(str1, str2, str1_idx, str2_idx-1);
    }

    public static void main(String[] args) {
        //Question 8 : Find if a string is a valid subsequence of another.
        //Time Complexity of the program is O(1)- constant time.
        //space Complexity is O(1)- constant.
        //where n is the length of the Strings.
        String str1 = "Sdah";
        String str2 = "Siddiquah";
        int m = str1.length();
        int n = str2.length();
        boolean result = IsSubsequence(str1, str2, m, n);
        if(result)
            System.out.println("Yes, it is a subsequence");
        else
            System.out.println("No, it is'nt a subsequence");
    }
}
