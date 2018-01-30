package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk kilometrus: ");
        float atstumas = sc.nextFloat();
        System.out.println("Ivesk litrus: ");
        float litrai = sc.nextFloat();


        System.out.println("Vidurkis: " + vidurkis(atstumas, litrai));
    }

    public static float vidurkis(float atstumas, float litrai) {
        return (litrai * 100) / atstumas;
    }
}
