package btvn_buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class btvn_buoi3 {
    static int[] numbers = {1, 5, 7, 9, 4};
    static int count = numbers.length;
    // in ra mang
    // 1 - for
    static void dungFor() {
        for (int i = 0; i < count; i++) {
            System.out.println("Phan tu thu " + i + " cua mang la " + numbers[i]);
        }
    }

    // dung while

    static void dungWhile() {
        int i = 0;
        while (i < count) {
            System.out.println("Phan tu thu " + i + " cua mang la " + numbers[i]);
            i++;
        }
    }

    // dung do-while
    static void dungDoWhile() {
        int j = 0;
        do {
            System.out.println("Phan tu thu " + j + " cua mang la " + numbers[j]);
            j++;
        } while(j < count);
    }

    // 2 - nhap mang so 2 phan tu- in ra
    static void nhapMang() {
        int[] numbers = new int[2];
        int inputNumber;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            inputNumber = sc.nextInt();
            numbers[i] = inputNumber;
            count += inputNumber;
        }
        System.out.println("Tong cua mang la " + count);
        // in ra
        for (int i : numbers
        ) {
            System.out.println("Phan tu cua mang la " + i);
        }
    }
    // 3 - noi phan tu cua mang
    static void noiMang() {
        int[] arr1 = {1, 4, 6, 9};
        int[] arr2 = {22, 27, 98, 6, 52};
        int countArr = arr1.length + arr2.length;
        int[] result = new int[countArr];
        int p = 0;
        // luu phan tu hai mang vao mang result
        for (int i: arr1) {
            result[p] = i;
            p++;
        }
        for (int i: arr2) {
            result[p] = i;
            p++;
        }
        System.out.println(Arrays.toString(result));
    }

    // 4 - dung do-while de nhap cho den khi n > 10
//    static void nhapN() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while(n < 10) {
//            System.out.println("nhap lai");
//            break;
//        }
//    }
    public static void main(String[] args) {
//        dungFor();
//        dungWhile();
//        dungDoWhile();
//        nhapMang();
//        noiMang();
//        nhapN();
    }
}
