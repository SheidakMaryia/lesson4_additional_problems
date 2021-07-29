import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("#9");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mass));

        int min = mass[0];
        for (int i = 0; i < mass.length; i++){
            if (i % 2 == 0 && min >= mass[i]){
                min = mass[i];
            }
        }

        System.out.println("наименьший эл-т среди эл-тов с четными индексами массива: " + min);

    }
}
