package modulo6_3_actividad03;

public class Actividad03 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
