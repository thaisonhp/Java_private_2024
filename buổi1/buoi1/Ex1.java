import java.util.Scanner;

public class Ex1 {
    // Cách 1: Xử lý thông qua chuỗi
    public static String convertTo(long inputNumber , int typeOfNumber) {
        if (typeOfNumber < 2 || typeOfNumber > 16) {
            return "Cơ số phải nằm trong khoảng từ 2 đến 16.";
        }
        String chars = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();
        if (inputNumber == 0) {
            return "0";
        }
        while (inputNumber > 0) {
            int remainder = (int) (inputNumber % typeOfNumber);
            result.insert(0, chars.charAt(remainder));
            inputNumber /= typeOfNumber;
        }
        return result.toString();
    }

    // Cách 2: Xử lý thuận với đệ quy
    public static void convertTo_V2(long inputNumber, int typeOfNumber) {
        if (typeOfNumber < 2 || typeOfNumber > 16) {
            System.out.println("Cơ số phải nằm trong khoảng từ 2 đến 16.");
            return;
        }
        if (inputNumber == 0) {
            System.out.print("0");
            return;
        }
        // Gọi đệ quy và in kết quả
        if (inputNumber > 0) {
            int remainder = (int) (inputNumber % typeOfNumber);
            convertTo_V2(inputNumber / typeOfNumber, typeOfNumber);

            if (remainder >= 10) {
                System.out.print((char) ('A' + (remainder - 10)));
            } else {
                System.out.print(remainder);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long inputNumber = sc.nextLong();
        int typeOfNumber = sc.nextInt();


        // String result = convertTo(inputNumber, typeOfNumber);
        // System.out.println(result);

        convertTo_V2(inputNumber, typeOfNumber);
        System.out.println(); // Xuống dòng sau khi in kết quả
    }
}
