import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("#5");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(mass));

        System.out.println("сжатый массив, без каждого 2ого элемента: ");
        for (int i = 0; i < mass.length; i++){
            if (i % 2 == 0){
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Замена каждого второго эл-та на ноль:");
        for (int i = 0; i < mass.length; i++){
            if (i % 2 != 0){
                mass[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass));

    }
}
