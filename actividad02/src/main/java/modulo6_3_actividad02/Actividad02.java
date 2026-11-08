package modulo6_3_actividad02;

import java.util.Scanner;

public class Actividad02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        while (true) {
            int value = input.nextInt();
            total += value;
            if (value == 999) {
                break;
            }
        }
        System.out.println("Suma: " + total);
    }
}
