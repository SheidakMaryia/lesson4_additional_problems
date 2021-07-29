import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("#4");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размерность массива: ");
        int x = sc.nextInt();

        int[] mass = new int[x];
        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(mass));

        int min;
        int j = 0;
        do {
            min = mass[j];
            j++;
        } while(min % 2 == 0);

        for (int i = 0; i < mass.length; i++){
            if (mass[i] % 2 != 0 && min >= mass[i]){
                min = mass[i];
            }
        }

        System.out.println("наименьший нечетный элемент: " + min);
    }
}
