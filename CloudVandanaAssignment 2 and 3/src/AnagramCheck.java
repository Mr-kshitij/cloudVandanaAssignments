// 2. String Manipulation - Anagram Check
//Write a Java program that takes two strings as input and checks if they are anagrams
//(containing the same characters in a different order).
//Example:
//Input: "listen", "silent"
//Output: true
//Input: "hello", "world"
//Output: false

import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        boolean isAnagram = true;

        if (arr1.length != arr2.length) {
            isAnagram = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                boolean found = false;
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        arr2[j] = 0;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
