package buoi1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputNumber = sc.nextLong();
        long result = 1;
        while(inputNumber > 0){
            result*=inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println(result);
    }
}
