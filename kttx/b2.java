
package kttx;

import java.util.ArrayList;
import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.append(c); //
                letters.append(" ");
            } else {
                letters.append(c); //
                numbers.append(" ");
            }
        }

        System.out.println(letters.toString().replaceAll("\\s+", " ").trim());
        System.out.println(numbers.toString().replaceAll("\\s+", " ").trim());
    }
}

