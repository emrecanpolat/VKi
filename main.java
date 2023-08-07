package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        System.out.println("Boyunuzu giriniz:");
        boy = input.nextDouble();

        indeks = kilo/(boy*boy);

        System.out.println("Vücut kitle indexiniz: "+ indeks);

    }
}
