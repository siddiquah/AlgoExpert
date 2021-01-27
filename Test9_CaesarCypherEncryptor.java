public class Test9_CaesarCypherEncryptor {
    public static StringBuffer CaesarCypherEncryptor(String s, int key) {
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                char ch = (char)(((int)s.charAt(i) + key - 65) % 26 + 65);
                sb.append(ch);
            }
            else {
                char ch = (char)(((int)s.charAt(i) + key - 97) % 26 + 97);
                sb.append(ch);
            }
        }
        return sb;
    }
    public static void main(String[] args)
    {
        //Question 9 : Famous Algorithms - Caesar cipher Encryptor.
        //Time Complexity of the program is O(n)- linear time.
        //space Complexity is O(1)- constant.
        //where n is the length of the String.
        String text = "OhMyGod";
        int s = 1;
        System.out.println("Message Text  : " + text);
        System.out.println("Shift of : " + s);
        System.out.println("After being Encrypted: " + CaesarCypherEncryptor(text, s));
    }
}
