package kttx;

import java.util.*;

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n >= 1000) {
            System.out.println("Vui lòng nhập một số từ 0 đến 999.");
            return;
        }

        String result = numberToWords(n);
        System.out.println(result);
    }

    public static String numberToWords(int n) {
        String[] units = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] teens = {"mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm",
                "mười sáu", "mười bảy", "mười tám", "mười chín"};
        String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
                "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (n == 0) {
            return units[0];
        }

        StringBuilder words = new StringBuilder();


        if (n >= 100) {
            words.append(units[n / 100]).append(" trăm ");
            n %= 100;
        }


        if (n >= 20) {
            words.append(tens[n / 10]).append(" ");
            n %= 10;
        } else if (n >= 10) {
            words.append(teens[n - 10]).append(" ");
            return words.toString().trim();
        }

        // Hàng đơn vị
        if (n > 0) {
            words.append(units[n]).append(" ");
        }

        return words.toString().trim();
    }
}
