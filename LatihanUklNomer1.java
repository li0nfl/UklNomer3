/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.latihanuklnomer1;

/**
 *
 * @author li0nfl
 */
import java.util.Scanner;

public class LatihanUklNomer1 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Bulat Positif: ");
        int n = inputan.nextInt();

        if (n < 0) {
            System.out.println("Bilangan Harus Positif!");
        } else {
            long faktorial = 1;

            for (int i = 1; i <= n; i++) {
                faktorial *= i;
        }
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);

    }
    }
}