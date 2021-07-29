import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("#10");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(mass));

        int max = mass[0];
        int maxI = 0;
        for (int i = 0; i < mass.length; i++){
            if (max < mass[i]){
                max = mass[i];
                maxI = i;
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i < mass.length; i++){
            if (mass[i] == 0){
                mass[i] = max;
            }
        }
        mass[maxI] = 0;

        System.out.println(Arrays.toString(mass));
    }
}
