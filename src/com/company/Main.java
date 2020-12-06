package com.company;


import javax.swing.*;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        boolean name = true;
        double[] mas = {1.1, 2.2, 3.3, 4.4, -5.5, 12.5, 7.7, -8.8, 10.9, -10.2, 11.2, 12.2, 13.2, 14, 2};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
        double sum = 0;

        for (double currentElement : mas) {

            if (currentElement < 0) {
                name = false;
            }

            if (name == false) {
                if (currentElement > 0) {
                    sum = sum + currentElement;
                }
            }
        }
        double sredArif = sum / mas.length;
        System.out.println("\n" + sum);
        System.out.println(sredArif);

//

        int[] massive = {5, 6, 8, 4, 7, 2, 9};
        boolean isSorted = false;
        int buf;

        while (!isSorted) {
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;
                    buf = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = buf;
                    System.out.println(Arrays.toString(massive));
                }
            }
        }

    }
}



