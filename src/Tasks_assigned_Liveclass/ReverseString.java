package Tasks_assigned_Liveclass;

/** Write a program to reverse a string without using inbuilt functions.**/
public class ReverseString {
    public static void main(String[] args) {
        String s = "Sarika is good girl";
        String s1 = "";
        int length = 0;
        //Length of the string
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            length = length + 1;
        }
        System.out.println(length);

        //reverse String
        int left = 0;
        int right = length - 1;
        int WordsCount = 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            right--;

        }
        s1 = new String(charArray);
        System.out.println("Original string is:" + s);
        System.out.println("reverse string is:" + s1);

        // Words in string
        for (int i = 0; i < length; i++) {
            // checking if current character is space or not
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                WordsCount++; // incrementing the word count
            }


        }
        System.out.println("No of words in String is:" + WordsCount);
    }
}