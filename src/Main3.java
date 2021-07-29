import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("#3");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(mass));

        System.out.println("задайте число С: ");
        int c = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] > c){
                sum += mass[i];
                count++;
            }
        }

        if (count == 0){
            System.out.println("В массиве нет чисел, превосходящих число С");
        }else {
            System.out.println("среднее арифметическое элементов, превосходящих число С: " + (sum/count));
        }

    }
}
