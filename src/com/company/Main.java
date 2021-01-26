package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        random();
    }

    private static void random() {
        Random random = new Random();
        int randomNumber = 0;

        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        int tries = 3;

        do {
            if (tries == 3) {
                System.out.println("Let the game begin!");
                randomNumber = random.nextInt(10);
            }
            inputNumber = scanner.nextInt();
            if (randomNumber != inputNumber) {
                tries -= 1;
                System.out.println("Неверно, осталось попыток: " + tries);

                if (inputNumber < randomNumber) {
                    System.out.println("Введенное число меньше загаданного");
                } else if (inputNumber > randomNumber) {
                    System.out.println("Введенное число больше загаданного");
                }

            }
            if (tries == 0 || inputNumber == randomNumber) {

                System.out.println("Загаданное число: " + randomNumber);
                System.out.println("Начать заново игру - 1");
                System.out.println("Продолжить игру - 0");
                inputNumber = scanner.nextInt();
                if (inputNumber == 0) {
                    break;
                } else if (inputNumber == 1) {
                    tries = 3;
                    continue;
                }
            }

        } while (true);
    }
}
