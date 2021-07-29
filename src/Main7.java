import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("#7");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mass));

        System.out.println("введите целое число:");
        int n = sc.nextInt();

        int count = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == n){
                count++;
            }
        }

        System.out.println("Число " + n + " встречается в массиве " + count + " раз");

    }
}
