package com.tugas;

import java.util.Scanner;

public class Utility {

    public static void cetak(String result) {
        System.out.println(result);
    }

    protected static Integer validasiInputInteger(String strLabel) {
        Scanner input = new Scanner(System.in);
        int value;
        do {
            System.out.print(strLabel);
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Input salah (harus angka positif), ");
                }
            } else {
                System.out.print("Input salah (harus angka), ");
                input.next();
            }
        } while (true);

    }
}
