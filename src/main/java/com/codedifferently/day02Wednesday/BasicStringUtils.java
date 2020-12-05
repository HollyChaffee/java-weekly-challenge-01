package com.codedifferently.day02Wednesday;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        int numberOfSpaces = 0;
        int lengthOfStr = str.length();
        char arrayOfCharacters[] = str.toCharArray();
        arrayOfCharacters[0] = Character.toUpperCase(arrayOfCharacters[0]);

        for (int i = 0; i < lengthOfStr; i++) {
            if (arrayOfCharacters[i] == ' ') {
                numberOfSpaces++;
                arrayOfCharacters[i + 1] = Character.toUpperCase(arrayOfCharacters[i + 1]);
            }
        }
        return String.valueOf(arrayOfCharacters, 0, lengthOfStr);

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        if (str == null) {
            return str;
        }

        String output = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);
        }

        return output;
    }


    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);

            } else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }

            str = new String(charArray);
        }
        return str;
    }
}


