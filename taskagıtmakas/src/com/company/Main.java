package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rock = 0;
        int paper = 1;
        int scissor = 2;
          int oyun=0;
          int makine_kazanma=0;
        do {
            System.out.println("taş (0), kağıt (1) , makas(3) tuşlarına basınız");
            int input = scan.nextInt();
            int random = (int) (Math.random() * 3);
            System.out.println(random);
            switch (random) {
                case 0:
                    System.out.println("taş");
                    break;
                case 1:
                    System.out.println("kağıt");
                    break;
                case 2:
                    System.out.println("makas");
                    break;

            }
            System.out.println();

            if (random == 0 && input == 0) {
                System.out.println("yeniden");
                oyun++;
            } else if (random == 1 && input == 1) {
                System.out.println("yeniden");
                oyun++;
            } else if (random == 2 && input == 2) {
                System.out.println("yeniden");
                oyun++;
            } else if (random == 0 && input == 1) {
                System.out.println("kağıt sarar, makine kaybetti");
                oyun++;
            } else if (random == 0 && input == 2) {
                System.out.println("taş makası kırar, kullanıcı kaybetti");
                makine_kazanma++;
                oyun++;
            } else if (random == 1 && input == 0) {
                System.out.println("kağıt sarar, makine kaybetti");
                oyun++;
            } else if (random == 1 && input == 2) {
                System.out.println("makas kağıdı keser, makine kaybetti");
                oyun++;
            } else if (random == 2 && input == 0) {
                System.out.println("taş makası kırar, makine kaybetti");
                oyun++;
            } else if (random == 2 && input == 1) {
                System.out.println("makas kaığıdı keser, kullanıcı kaybetti");
                oyun++;
                makine_kazanma++;
            }
            System.out.println(oyun);
        }while (true);



     }

    }

